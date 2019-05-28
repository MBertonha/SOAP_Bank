/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.sql.Connection;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author berto
 */
@WebService(serviceName = "BankWS")
@Stateless()
public class BankWS {
    //Variaveis Banco  
    String url = "jdbc:postgresql://localhost:5432/bankSOUP";  
    String usuario = "postgres";  
    String password = "postgre"; 
    Connection con = null;
    Statement stmt;
    

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "saldoUser")
    public double verificaSaldo(@WebParam(name = "nome") String nome, @WebParam(name = "senha") String senha){
        double saldoExib = 0;
        String texto;
        try{
            //Conecta Banco
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, password);  
            System.out.println("Conexão realizada com sucesso.");  
            Statement stm = con.createStatement();   
            
            //SQL banco
            Statement stmt = null; 
            String sql = "SELECT saldo FROM clients WHERE nome = " + "'" + nome + "'";
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){  //verifica o conteúdo da resposta
                texto = rs.getString("saldo");
                saldoExib = Double.parseDouble(texto);
                saldoExib = rs.getDouble("saldo");
            } 
        }catch(Exception e){
            System.err.print(e.getMessage());
            System.out.println("Vai ver nada não fera...");
        }
        return saldoExib;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "deposito")
    public boolean deposito(@WebParam(name = "valor") double valor, @WebParam(name = "nome") String nome) {
        double valorDep = valor;
        double saldoAtual = 0;
        try {
            //Conecta Banco
            Class.forName("org.postgresql.Driver"); 
            con = DriverManager.getConnection(url, usuario, password);  
            System.out.println("Conexão realizada com sucesso.");  
            Statement stm = con.createStatement();
            
            //SQL Banco
            Statement stmt = null;
            String sql = "SELECT saldo FROM clients WHERE nome = " + "'" + nome + "'";
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){ 
                saldoAtual = rs.getDouble("saldo");
            }
            System.out.println(saldoAtual);
            saldoAtual = saldoAtual + valorDep;
            System.out.println(saldoAtual);
            Statement stmt2 = null;
            String sql2 = "UPDATE clients SET saldo ='" + String.valueOf(saldoAtual) + "' WHERE nome = " + "'" + nome +"'";
            stmt2 = con.createStatement();
            ResultSet rs2 = stmt2.executeQuery(sql2);
            while (rs2.next())
            {
                valorDep = rs.getDouble(sql2);
            }
        } catch (Exception e) {
            //System.err.print(e.getMessage());
            //System.out.println("Vai depositar não fera...");
            //return false;
        }
        return true;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "saque")
    public boolean saque(@WebParam(name = "valor") double valor, @WebParam(name = "nome") String nome) {
        double valorSaq = 0, valorAux = 0;
        double saldoAtual = 0, saldoNovo = 0;
        Banco b = new Banco();
        String texto;
        try{
            //Conecta Banco
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, password);  
            System.out.println("Conexão realizada com sucesso.");  
            Statement stm = con.createStatement();  

            //SQL Banco    
            Statement stmt = null;
            String sql = "SELECT saldo FROM clients WHERE nome = '" + nome + "'";
                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){
                    saldoAtual = rs.getDouble("saldo");
                }
                saldoNovo = saldoAtual - valor;
                if (saldoNovo < 0){
                    System.out.println("Vai poder sacar não cara");
                    return false;
                }else{
                    saldoAtual = saldoAtual - valor;
                    Statement stmt2 = null;
                    String sql2 = "UPDATE clients SET saldo ='" + String.valueOf(saldoAtual) + "' WHERE nome = '"+ nome +"'";
                    stmt2 = con.createStatement();
                    ResultSet rs2 = stmt2.executeQuery(sql2);
                    while (rs2.next()){
                        saldoNovo = rs.getDouble(sql2);
                    }
                }
        }catch(Exception e){
            System.err.print(e.getMessage());
            System.out.println("Vai sacar não fera...");
            return false;
        }
        return true;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "cadastrarUser")
    public boolean cadastrarUser(@WebParam(name = "nome") String nome, @WebParam(name = "senha") String senha, @WebParam(name = "saldo") String saldo) {
        int count = 0;
        try{
            //Conecta Banco
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, password);  
            System.out.println("Conexão realizada com sucesso.");  
            Statement stm = con.createStatement(); 
            
            //SQL Banco
            Statement stmt = null;
            String sql = "INSERT INTO clients VALUES(" + "'" + nome + "','" + senha + "','" + saldo + "')";
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                count++;
            }
        }catch(Exception e){
            System.err.print(e.getMessage());
            System.out.println("Vai cadastrar ngm não fera...");
            //return false;
        }
        return true;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "alterCadastro")
    public boolean alterCadastro(@WebParam(name = "oldNome") String oldNome, @WebParam(name = "newNome") String newNome, @WebParam(name = "oldSenha") String oldSenha, @WebParam(name = "newSenha") String newSenha) {
        try{
            //Conecta Banco
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, password);  
            System.out.println("Conexão realizada com sucesso.");  
            Statement stm = con.createStatement(); 
                     
            //SQL Banco
            Statement stmt = null;
            String sql2 = "UPDATE clients SET nome = '" + newNome + "'" + ", senha = '" + newSenha + "'" + " WHERE nome = '" + oldNome + "'";
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql2);
            
        }catch(Exception e){
            System.err.print(e.getMessage());
            System.out.println("Vai alterar nada não fera...");
            //return false;
        }
        return true;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "consultUser")
    public String consultUser(@WebParam(name = "nome") String nome, @WebParam(name = "senha") String senha) {
        //TODO write your implementation code here:
        String resposta = "";
        double valor = 0;
        try {
            //Conecta Banco
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, password);  
            System.out.println("Conexão realizada com sucesso.");  
            Statement stm = con.createStatement(); 
            
            
            String userName = nome;
            String texto;

            Statement stmt = null;
            String sql = "SELECT saldo FROM clients WHERE nome = '" + userName + "'";
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
                    while(rs.next()){  //verifica o conteúdo da resposta
                        texto = rs.getString("saldo");
                        valor = Double.parseDouble(texto);
                        valor = rs.getDouble("saldo");
                    }
        } catch(Exception e){
            System.err.print(e.getMessage());
            System.out.println("Vai consultar ngm não fera...");
            //return false;
        }
        resposta = "Nome = " + nome + ",   Senha = " + senha + ",   Saldo = " + valor; 
        return resposta;
    }
    
    
    
    
}
