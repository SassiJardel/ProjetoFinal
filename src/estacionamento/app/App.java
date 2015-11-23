/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.app;

import estacionamento.cliente.Cliente;
import estacionamento.dao.ClienteDaoDerby;
import estacionamento.dao.Dao;

/**
 *
 * @author Jardel
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Cliente joao = new Cliente("BJR-1917", "Fusca");
        Cliente maria = new Cliente("RJB-0666", "Opala");
        // TODO code application logic here
    
        Dao dao = new ClienteDaoDerby();
        dao.saida(joao);
        dao.saida(maria);
        dao.listarTudo();
        dao.entrada(joao);
        dao.listarTudo();
        dao.entrada(maria);
        dao.listarTudo();
        
        dao.saida(joao);
        dao.listarTudo();
        dao.saida(maria);
        dao.listarTudo();
    
    
    }
    
}
