/*
    Fecha de creación : 8/03/2022, 11:45:34 AM
    Author: Cristian Adair Ramirez Rodriguez
    Fecha de actualizacion:15/03/2022, 11:50:34 AM
    Descripcion:Usuarios
 */
package src.model;

import Entity.Usuario;
import bd.Conexion;
import db.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import src.entity.Usuario;

public class UsuarioModelmpl implements IUsuarioModel {

    private Conexion conexion;
    private Connection connection;

    @Override
    public void crearRegisto(Usuario usuario) {
        try {
            conexion = new Conexion();
            conexion.Conectar();
            connection = conexion.getConnection();
            String sql = "insert into usuario(nombre_usuario, contraseña, nombre, sexo, edad) values(?,?,?,?,?);";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, usuario.getnombre_usuario());
            st.setString(2, usuario.getcontraseña());
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
    public void actualizarRegistro(Usuario usuario) {
        try {
            conexion = new Conexion();
            conexion.Conectar();
            connection = conexion.getConnection();
            String sql = "update usuario set nombre_usuario=?, contraseña=?, nombre=?, sexo=?, edad=? where codigo=" + usuario.getcodigo() + ";";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, usuario.getNombre_Usuario());
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
                usu = new Usuario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                lista.add(usu);
            }
            conexion.Desconectar();
        } catch (Exception ex) {
            System.out.println("Error al obtener registros= " + ex);
        }
        return null;
    }

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
        Usuario usu1 = new Usuario();
        List<Usuario> lista = new ArrayList<Usuario>();
        try {
            conexion = new Conexion();
            conexion.Conectar();
            connection = conexion.getConnection();
            String sql = "select from usuario where codigo=" + idUsuario + ";";
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                usu1 = new Usuario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                lista.add(usu1);
            }
            conexion.Desconectar();
        } catch (Exception ex) {
            System.out.println("Error de obetener registro= " + ex);
        }
        return null;
    }

    @Override
    public void eliminarResgistro(int idUsuario) {
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

    public static void main(String[] args) {
        Usuario a = new Usuario();
        a.setcodigo("1");
        a.setnombre_usuario("Roberto");
        a.setcontraseña("Rober123");
        a.setNombre("Roberto");
        a.setSexo("Hombre");
        a.setEdad(18);
        UsuarioModelmpl um = new UsuarioModelmpl();
        um.obtenerRegistros();
//        um.actualizarRegistro(a);
//        um.eliminarResgistro(1);
        System.out.println(um.obtenerRegistro(1));
        System.out.println(um.obtenerRegistros());
    }
}
