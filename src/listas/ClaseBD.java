/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author SUMICENTER
 */

import java.sql.Connection;
import java.sql.Statement;


public class ClaseBD {
 
     public void enviarDatos(String operacion, String descripcion){
    
        Connection connection;
        conexion conexion = new conexion();
        conexion.conectar();
        connection = conexion.getConnetion();
        
        
        
        
        try{
            Statement stm = connection.createStatement(); 
            

            stm.executeUpdate("INSERT INTO public.bitacora(nombre) "
                            + "VALUES('"+ descripcion +"')");
                    
            
           }
        
        catch(Exception ex){
            System.out.println("Error en sql:"+ ex.getMessage());
    
    
         }finally{
        
        
            
        }
        
    
}
}
    
