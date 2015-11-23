/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.dao;

import estacionamento.cliente.Cliente;

/**
 *
 * @author Jardel
 */
public interface Dao {
    public void entrada(Cliente c);
    public void saida(Cliente c);
    //public void saida(String placa);
    public void listarTudo();
    
}
