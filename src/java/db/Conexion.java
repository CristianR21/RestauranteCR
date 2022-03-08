/*
cristian Adair Ramirez Rodriguez
Fecha de creación:8/03/2022, 10:43:34 AM
Fecha de actualización:
Descripción: Clase del producto
 */
package db;

import java.sql.Connection;

public class Conexion {

    Connection conexion;
    String url;
    String user;
    String pwd;

    public Conexion(Connection conexion, String url, String user, String pwd) {
        this.conexion = conexion;
        this.url = url;
        this.user = user;
        this.pwd = pwd;
    }
    public Conexion() {
    }
   public void Conectar(){
       try {
           Conectar();
       } catch (Exception e) {
       }
}
   public void Desconectar(){
       try {
           Desconectar();
       } catch (Exception e) {
       }
}

    public Connection getConexion() {
        return conexion;
    }
    public static void main(String[] args) {
        
    }
}
