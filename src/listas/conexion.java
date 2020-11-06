/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author Andres Julian Romero
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;


public class conexion {

    private Connection connection = null;

    public void conectar() {
        try {
            System.out.println("Generando conexión a Postgresql");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/seguridad2", "postgres", "1070967183");
            Class.forName("org.postgresql.Driver");
            System.out.println("Conexión generada exitosamente");
        } catch (SQLException ex) {
            System.err.println("No se pudo generar la conexión: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println("No encotro el Driver: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Exception general: " + ex.getMessage());
        }
    }

    public void desconectar() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión cerrada exitosamente");
            } else {
                System.out.println("No existe ninguna conexión por cerrar");
            }
        } catch (SQLException ex) {
            System.err.println("No se pudo cerrar la conexión: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Exception general: " + ex.getMessage());
        }
    }

    
    public Connection getConnetion() {
        return connection;
    }
    
     public void Menu(){
        
        int a,c,i;
        String b="";
        String pa;
        List<String> p = new java.util.ArrayList();
        p.add("");
        
       do{
      a = Integer.parseInt(JOptionPane.
      showInputDialog("¿Que desea hacer?\n\n1.Ingresar nombres\n2.Salir"));
      switch(a){
          case 1 :
           p.add(JOptionPane.showInputDialog("nombre"));
           break;
      
      
              
      
      }
       
    }while(a!=2);
       
       
       for(String elementos:p){
            BaseDatos bit = new  BaseDatos();
           String descripcion =""+elementos;
            bit.enviarDatos("nonbres", descripcion);
           String str = String.valueOf(elementos);
     
        
      
    }
       
     
        
      
        
       
      
        

    
     
     
     
     
 




       }
}