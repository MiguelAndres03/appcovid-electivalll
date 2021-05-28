/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impelementacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class Conexion {
    
    public Connection conectar()
    {
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/covid", "postgres", "123456");            
            boolean validar = c.isValid(50000);
            System.out.print(validar ?"conexion exitosa":"error de conexion");
            return c;
             
        } catch (ClassNotFoundException  ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return null;
    }
    
    public void desconectar(Connection cx)
    {
        if(cx!= null)
        {
            try {
                cx.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "no se cerró la conexión", ex);
            }
        }
    }
   
}
