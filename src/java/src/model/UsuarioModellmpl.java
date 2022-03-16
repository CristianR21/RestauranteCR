/*
    Fecha de creación : 8/03/2022, 11:45:34 AM
    Author: Cristian Adair Ramirez Rodriguez
    Fecha de actualizacion:15/03/2022, 11:50:34 AM
    Descripcion:Usuarios
 */
package src.model;

import db.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import src.entity.Usuario;

public class UsuarioModellmpl implements IUsuarioModel {

    private Conexion conexion;
    private Connection connection;

    public void crearRegisto(Usuario usuario) {
        try {
            conexion = new Conexion();
            conexion.Conectar();
            connection = conexion.getConnection();
            String sql = "insert into usuario(nombre_usuario, contraseña, nombre, sexo, edad) values(?,?,?,?,?);";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, usuario.getNombre_usuario());
            st.setString(2, usuario.getContraseña());
            st.setString(3, usuario.getNombre());
            st.setString(4, usuario.getSexo());
            st.setInt(5, usuario.getEdad());
            st.executeUpdate();
            conexion.Desconectar();
        } catch (Exception ex) {
            System.out.println("Error de crear registro= " + ex);
        }
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        Usuario usu = new Usuario();
        List<Usuario> lista = new ArrayList<Usuario>();
        try {
            conexion = new Conexion();
            conexion.Conectar();
            connection = conexion.getConnection();
            String sql = "select * from usuario;";
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                usu = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                lista.add(usu);
            }
            conexion.Desconectar();
        } catch (Exception ex) {
            System.out.println("Error al obtener registros= " + ex);
        }
        return null;
    }

    public static void main(String[] args) {
        Usuario a = new Usuario();
        a.setCodigo(1);
        a.setNombre_usuario("cristian");
        a.setContraseña("Rober123");
        a.setNombre("Roberto");
        a.setSexo("Hombre");
        a.setEdad(18);
        UsuarioModellmpl um = new UsuarioModellmpl();
        um.crearRegisto(a);
        // um.obtenerRegistros();
        //um.actualizaRegistro(a);
//        um.actualizarRegistro(a);
//        um.eliminarResgistro(1);
        //System.out.println(um.obtenerRegistro(1));
        //System.out.println(um.obtenerRegistros());
    }

    @Override
    public void crearRegistro(Usuario usuario) {
        try {
            conexion = new Conexion();
            conexion.Conectar();
            connection = conexion.getConnection();
            String sql = "insert into usuario (codigo,nombre_usuario,contraseña,nombre,sexo,edad) VALUES(?,?,?,?,?,?);";
            PreparedStatement s = connection.prepareStatement(sql);
            s.setInt(1, usuario.getcodigo());
            s.setString(2, usuario.getNombre_usuario());
            s.setString(3, usuario.getContraseña());
            s.setString(4, usuario.getNombre());
            s.setString(5, usuario.getSexo());
            s.setInt(6, usuario.getEdad());
            conexion.Desconectar();
        } catch (Exception ex) {
            System.out.println("Error de obetener registro= " + ex);
        }
    }

    @Override
    public void actualizaRegistro(Usuario usuario) {
        try {
            conexion = new Conexion();
            conexion.Conectar();
            connection = conexion.getConnection();
            String sql = "update usuario set nombre_usuario=?, contraseña=?, nombre=?, sexo=?, edad=? where codigo=" + usuario.getcodigo() + ";";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, usuario.getNombre_usuario());
            st.setString(2, usuario.getContraseña());
            st.setString(3, usuario.getNombre());
            st.setString(4, usuario.getSexo());
            st.setInt(5, usuario.getEdad());
            st.executeUpdate();
            conexion.Desconectar();
        } catch (Exception ex) {
            System.out.println("Error de actualizar registro= " + ex);
        }
    }

    @Override
    public void eliminarRegistro(int idUsuario) {
        try {
            conexion = new Conexion();
            conexion.Conectar();
            connection = conexion.getConnection();
            String sql = "delete from usuario where codigo=" + idUsuario + ";";
            PreparedStatement st = connection.prepareStatement(sql);
            st.executeUpdate();
            conexion.Desconectar();
        } catch (Exception ex) {
            System.out.println("Error de eliminar registro= " + ex);
        }
    }

    @Override
    public void insertarDatos(String codigo, String nombre, float precio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
