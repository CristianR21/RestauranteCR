/*
    Fecha de creación : 11/03/2022, 10:36:34 AM
    Author: Cristian Adair Ramirez Rodriguez
    Fecha de actualizacion:12/03/2022, 10:00:34 AM
    Descripcion:Usuarios
 */
package src.model;

import java.util.List;
import src.entity.Usuario;

/**
 *
 * @author labso07
 */
public interface IUsuarioModel {
    public void crearRegistro(Usuario usuario);
    public void actualizaRegistro(Usuario usuario);
    public void eliminarRegistro(int idUsuario);
    public void insertarDatos(String codigo, String nombre,float precio);
    public List<Usuario> obtenerRegistros();
    public Usuario obtenerRegistro(int idUsuario);
}
