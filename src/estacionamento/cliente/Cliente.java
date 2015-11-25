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
    private int horaEntrada;
   
    
    
    
    public Cliente(){
        
    }
    
    public Cliente(String placa, String carro, int hora){
        this.placa = placa;
        this.carro = carro;
        this.horaEntrada = hora;
       
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
    
    public int getHoraEntrada(){
        return horaEntrada;
    }
    
    public void setHoraEntrada(int horaEntrada){
        this.horaEntrada = horaEntrada;
    }
    
    
}
