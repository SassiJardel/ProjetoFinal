/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.cliente;

/**
 *
 * @author Jardel
 */
public class Cliente {
    
    private String placa;
    private String carro;
    
    public Cliente(){
        
    }
    
    public Cliente(String placa, String carro){
        this.placa = placa;
        this.carro = carro;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public String getCarro(){
        return carro;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public void setCarro(String carro){
        this.carro = carro;
    }
}
