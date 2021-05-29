/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impelementacion;

import entidad.Datos;
import inter.Operaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 */
public class OperDatos implements Operaciones<Datos>
{
    int sintoma1 = 0;
    int sintoma2 = 0;
    int sintoma3 = 0;
    int sintoma4 = 0;
    int sintoma5 = 0;
    
    
    @Override
    public int crear(Datos dato) {
        
        
      Conexion cnx = new Conexion();
      Connection connection = cnx.conectar();
       
       if(connection != null){
                  
            String sql = "SELECT * FROM datos";  
            String datos[] = new String[5];
            

           try {

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
                  
               while (rs.next()) {                   
                  String data = " ";
                  int n = rs.getMetaData().getColumnCount();
                    for (int i = 1; i <= n; i++) {
                       data = data +" "+ ((rs.getObject(i)== null) ?"":rs.getObject(i).toString());
                   }
                    System.out.print(data);
               }
               
        } catch (SQLException ex) {
            Logger.getLogger(OperDatos.class.getName()).log(Level.SEVERE, null, ex);

        } 
           //
           try {
               PreparedStatement ps = connection.prepareStatement("INSERT INTO public.datos(nombre, apellido, cedula, correo) VALUES (?, ?, ?, ?);");
               ps.setString(1, dato.getNombre());
               ps.setString(2, dato.getApellido());
               ps.setInt(3, Integer.parseInt(dato.getCedula()));
               ps.setString(4, dato.getCorreo());
               
               
               int x = ps.executeUpdate();
               return x;
               
               
           } catch (SQLException ex) {
               Logger.getLogger(OperDatos.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
        return 0;
    }
    
    
    public int crear2(Datos dato) {
        
      Conexion cnx = new Conexion();
      Connection connection = cnx.conectar();
       
       if(connection != null){
           try {

               PreparedStatement ps = connection.prepareStatement("insert into sintomas (sintoma1, sintoma2, sintoma3, sintoma4, sintoma5) values(?,?,?,?,?)");

               ps.setString(1, dato.getSintoma1());
               ps.setString(2, dato.getSintoma2());
               ps.setString(3,dato.getSintoma3());
               ps.setString(4, dato.getSintoma4());
               ps.setString(5, dato.getSintoma5());
               
               int x = ps.executeUpdate();
               return x;
               
               
           } catch (SQLException ex) {
               Logger.getLogger(OperDatos.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
        return 0;
    }

    @Override
    public int editar(Datos dato) {
        return 0;
    }

    @Override
    public int borrar(Datos dato) {
        return 0;
    }

    @Override
    public int[] consultar() 
    {
       int aux[] = new int[5];
       Conexion cnx = new Conexion();
       Connection connection = cnx.conectar();
       
       if(connection != null)
       {
            String sql = "SELECT * FROM sintomas";  
            String datos[] = new String[5];

           try {

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                
                if(datos[0]!=null){sintoma1++;}
                if(datos[1]!=null){sintoma2++;}
                if(datos[2]!=null){sintoma3++;}
                if(datos[3]!=null){sintoma4++;}
                if(datos[4]!=null){sintoma5++;}  
                
            }
            
            aux[0]=sintoma1;
            aux[1]=sintoma2;
            aux[2]=sintoma3;
            aux[3]=sintoma4;
            aux[4]=sintoma5;
            
            return aux;
            
        } catch (SQLException ex) {
            Logger.getLogger(OperDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      }
      return null;
    }


}
