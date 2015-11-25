/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.dao;

import estacionamento.cliente.Cliente;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Jardel
 */
public class ClienteDaoArrayList implements Dao{
    
    
    Date date = new Date();
    Calendar calendar = GregorianCalendar.getInstance();
    int hora = calendar.get(Calendar.HOUR);
    
    private ArrayList<Cliente> lista;
    
    public ClienteDaoArrayList(){
        lista = new ArrayList<>();
    }

    @Override
    public void entrada(Cliente c) {
        lista.add(c);
        System.out.println("Cliente \""+ c.getPlaca() + " - " + c.getCarro() + "\" entrou às: " + hora + "h");
    }

    @Override
    public void saida(Cliente c) {
        lista.remove(c);
        System.out.println("Cliente \""+ c.getPlaca() + " - " + c.getCarro() + "\" realizou saída às: "+hora+"h");
    }

    @Override
    public void listarTudo() {
        System.out.println("Inicio da relação: ");
        for (Cliente elementoDaLista : lista){
            System.out.println(elementoDaLista);
        }
        System.out.println("Fim da relação");
    }
    
    @Override
    public void saida(String placa){
        System.out.println("Cliente de placa " + placa + " realizou saída");
    }
}
