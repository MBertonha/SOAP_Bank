/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientehan;

/**
 *
 * @author berto
 */
public class ClienteHan1 {
    public static void main(String[] args) {
        
}

    private static boolean alterCadastro(java.lang.String oldNome, java.lang.String newNome, java.lang.String oldSenha, java.lang.String newSenha) {
        ws.BankWS_Service service = new ws.BankWS_Service();
        ws.BankWS port = service.getBankWSPort();
        return port.alterCadastro(oldNome, newNome, oldSenha, newSenha);
    }

    private static boolean cadastrarUser(java.lang.String nome, java.lang.String senha, java.lang.String saldo) {
        ws.BankWS_Service service = new ws.BankWS_Service();
        ws.BankWS port = service.getBankWSPort();
        return port.cadastrarUser(nome, senha, saldo);
    }

    private static String consultUser(java.lang.String nome, java.lang.String senha) {
        ws.BankWS_Service service = new ws.BankWS_Service();
        ws.BankWS port = service.getBankWSPort();
        return port.consultUser(nome, senha);
    }

    private static boolean deposito(double valor, java.lang.String nome) {
        ws.BankWS_Service service = new ws.BankWS_Service();
        ws.BankWS port = service.getBankWSPort();
        return port.deposito(valor, nome);
    }

    private static double saldoUser(java.lang.String nome, java.lang.String senha) {
        ws.BankWS_Service service = new ws.BankWS_Service();
        ws.BankWS port = service.getBankWSPort();
        return port.saldoUser(nome, senha);
    }

    private static boolean saque(double valor, java.lang.String nome) {
        ws.BankWS_Service service = new ws.BankWS_Service();
        ws.BankWS port = service.getBankWSPort();
        return port.saque(valor, nome);
    }
    
}
