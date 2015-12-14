/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.dao;

import estacionamento.cliente.Cliente;
import java.util.*;



/**
 *
 * @author Jardel
 */
public class ClienteDaoVetor implements Dao{
    
    Date date = new Date();
    Calendar calendar = GregorianCalendar.getInstance();
    int hora = calendar.get(Calendar.HOUR);

    
    private Cliente lista[];
    private int posicao;
    
    public ClienteDaoVetor (int x){
        lista = new Cliente[x];
        posicao = 0;
    }
    
    @Override
    public void entrada(Cliente c){
        lista[posicao] = c;
        System.out.println("O cliente \""+ c.getPlaca()+" "+ c.getCarro() +"\" realizou entrada as "+ hora + "h");
        posicao++;
    }
    
    @Override
    public void saida(Cliente c){
        System.out.println("O cliente \""+ c.getPlaca()+ " " + c.getCarro() +"\" realizou saida às: "+hora+"h");
    }
    
    @Override
    public void listarTudo() {
        System.out.println("Listando..");
    }
    
    @Override
    public void saida(String placa){
        
    }


   
    
    
}
