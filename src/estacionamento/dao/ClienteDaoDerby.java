/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.dao;

import estacionamento.cliente.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


/**
 *
 * @author Jardel
 */
public class ClienteDaoDerby implements Dao {
    
    Date date = new Date();
    Calendar calendar = GregorianCalendar.getInstance();
    String horaEntrada = Integer.toString(calendar.get(Calendar.HOUR))+ ":" + Integer.toString(calendar.get(Calendar.MINUTE))+"h";
    
    Statement stmt;
    
    public ClienteDaoDerby(){
        String username = "administrador";
        String password = "123456";
        String url = "jdbc:derby://localhost:1527/estacionamento";
        
        try{
            Connection con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();
        }catch(SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
    }
    }
    
    @Override
    public void entrada(Cliente c) {
        String instrucao = "INSERT INTO CLIENTE (PLACA, CARRO, HORA) VALUES ("
        + "'" +  c.getPlaca() + "', " + "'" + c.getCarro() +  "', " + "'"+ horaEntrada + "')";
        System.out.println(instrucao);
        try{
            stmt.executeUpdate(instrucao);
        }catch (SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
    }
    
    @Override
    public void saida(Cliente c){
        String instrucao = "DELETE FROM CLIENTE WHERE PLACA = " + "'" + c.getPlaca() + "'";
        System.out.println(instrucao);
        try{
            stmt.executeUpdate(instrucao);
        }catch (SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
    }
    
   /* @Override
    public void saida(String placa){
        String instrucao = "DELETE FROM CLIENTE WHERE PLACA = " + "" + placa + "";
        System.out.println(instrucao);
        try{
            stmt.executeUpdate(instrucao);
        }catch (SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
    }*/
    
    @Override
    public void listarTudo(){
        String instrucao = "SELECT * FROM CLIENTE";
        
        try{
            ResultSet rs = stmt.executeQuery(instrucao);
            
            while (rs.next()){
                System.out.println("Placa: " + rs.getString("PLACA") + " Carro: " + rs.getString("CARRO"));
            }
            
        }catch(SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
    }
}
