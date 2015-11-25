/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.app;

import estacionamento.cliente.Cliente;
import estacionamento.dao.ClienteDaoDerby;
import estacionamento.dao.Dao;
import estacionamento.gui.Caixa;
import java.util.*;

/**
 *
 * @author Jardel
 */
public class App {

    
    Date date = new Date();
    Calendar calendar = GregorianCalendar.getInstance();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new Caixa().setVisible(true);
               
        //Cliente joao = new Cliente("BJR-1917", "Fusca", 1);
       // Cliente maria = new Cliente("RJB-0666", "Opala", 2);
        // TODO code application logic here
    
       // Dao dao = new ClienteDaoDerby();
        
        
        
        //dao.saida(joao);
       // dao.saida(maria);
      /*  dao.listarTudo();
        dao.entrada(joao);
        dao.listarTudo();
        dao.entrada(maria);
        dao.listarTudo();*/
        
        
        
      //  dao.saida(joao);
        //dao.listarTudo();
      //  dao.saida(maria);
     //   dao.listarTudo();
     //   dao.entrada(maria);
     //   dao.entrada(joao);
     //   dao.listarTudo();
        
        
    
    
    }
    
}
