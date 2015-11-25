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

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        new Caixa().setVisible(true);

    }
    
}
