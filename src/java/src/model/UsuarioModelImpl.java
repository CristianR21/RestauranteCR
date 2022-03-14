/*
    Fecha de creación : 8/03/2022, 11:45:34 AM
    Author: Cristian Adair Ramirez Rodriguez
    Fecha de actualizacion:8/03/2022, 11:50:34 AM
    Descripcion:Usuarios
 */
package src.model;

import db.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import src.entity.Usuario;

/**
 *
 * @author labso07
 */
public class UsuarioModelImpl implements IUsuarioModel {

    private Conexion conexion;
    private Connection connection;

    @Override
    public void crearRegistro(Usuario usuario) {
        try {
            conexion = new Conexion();
            conexion.Conectar();
            connection = conexion.getConnection();
            String sql = "INSERT INTO usuario(nombre) VALUES()";

        } catch (Exception e) {
        }
        try ( PreparedStatement statement = conecction.prepareStatement(sql)) {
            statement.get String
            (1,usuario.getNombre()
            );
         statement.executeUpdate();
        }
        
        
    

    public static void main() { //Metodo que ayuda a dar de alta los productos
        try {

            String codigo = "001";
            String nombre = "Huevos con jamon";
            String descripcion = "Desayunos";
            float precio = (float) 50.50;
            String FechaCreacion = "08/03/2022";
            String FechaActualizacion = "10/03/2022";
            String FechaEliminacion = "20/03/2022";

            String sql = "INSERT INTO producto (codigo, nombre, descripcion, precio, FechaCreacion, FechaActualizacion, FechaEliminacion) values(?, ?, ?, ?, ?, ?,?);";

            PreparedStatement ps = conexion.prepareStatement(sql);
            //Se obtinen los datos de los campos
            ps.setString(1, codigo);
            ps.setString(2, nombre);
            ps.setString(3, descripcion);
            ps.setFloat(4, precio);

            ps.setString(5, FechaCreacion);
            ps.setString(6, FechaActualizacion);
            ps.setString(7, FechaCreacion);
            ps.setString(5, FechaEliminacion);
            ps.executeUpdate();//Se insertan los datos en la base de datos
            JOptionPane.showMessageDialog(null, "datos insertados correctamente");
            conexion.close();

        } catch (Exception e) {
            System.out.println("error");

        }
    }

    @Override
    public void actualizaRegistro(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarRegistro(int idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
