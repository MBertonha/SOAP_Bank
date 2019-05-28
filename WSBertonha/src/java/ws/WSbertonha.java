/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import classes.Livro;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 *
 * @author berto
 */
@WebService(serviceName = "WSbertonha")
@Stateless()
public class WSbertonha {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "soma")
    public double soma(@WebParam(name = "num1") double num1, @WebParam(name = "num2") double num2) {
        //TODO write your implementation code here:
        return num1 + num2;
    }
    
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "retornaLivro")
    public Livro retornaLivro() {
        Livro livro = new Livro();
        livro.setNome("Sistemas Distribuidos");
        livro.setEditora("UENP");
        livro.setAno(2018);
        return livro;
    }
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "retornaLista")
    public ArrayList<Livro> retornaLista() {
        ArrayList<Livro> lista = 
                new ArrayList();
        Livro livro1 = new Livro();
        livro1.setNome("Sistemas Distribuidos");
        livro1.setEditora("UENP");
        livro1.setAno(2018);
        lista.add(livro1);
        
        Livro livro2 = new Livro();
        livro2.setNome("Linguagem de Programação");
        livro2.setEditora("UENP");
        livro2.setAno(2010);
        lista.add(livro2);
        return lista;
    }   
}
