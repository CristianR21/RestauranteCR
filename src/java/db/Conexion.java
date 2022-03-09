/*
cristian Adair Ramirez Rodriguez
Fecha de creación:8/03/2022, 10:43:34 AM
Fecha de actualización:09/03/2022 09:00 AM
Descripción: Clase del producto
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {

    static Connection conexion;
    String url = "jdbc:postgresql://localhost/restaurantonline";
    String user = "postgres";
    String password = "cristian20";

    public Conexion() {

    }

    public Conexion(Connection conexion, String url, String user, String password) {
        this.conexion = conexion;
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection Conectar() {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url,user,password);
            System.out.println("Conexion con exito");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return con;
    }

    public void Desconectar() {
        try {
            conexion.close();
            System.out.println("Conexion cerrada");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static void main(String[] args) {
        Connection conec = null;
        Conexion con = new Conexion();
        con.Conectar();
       
        try{
          
            String sql="select * from restaurantonline";
             ResultSet rs;
             Statement st= conec.createStatement();
             rs=st.executeQuery(sql);
             while(rs.next()){
                 System.out.println(rs.getObject("codigo"));
                 System.out.println(rs.getObject("nombre"));
                 System.out.println(rs.getObject("descripcion"));
                 System.out.println(rs.getObject("precio"));
                 System.out.println(rs.getObject("FechaCreacion"));
                 System.out.println(rs.getObject("FechaActualizacion"));
                 System.out.println(rs.getObject("FechaEliminacion"));
                 
                 
             }
             
        }catch(Exception e){
            System.out.println(e.toString());
       }
         con.Desconectar();
    }

}