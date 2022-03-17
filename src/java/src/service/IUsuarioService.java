/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package src.service;

import java.util.List;
import src.entity.Usuario;

/**
 *
 * @author labso07
 */
public interface IUsuarioService {
    public void crearRegistro(Usuario usuario);
    public void actualizaRegistro(Usuario usuario);
    public void eliminarRegistro(int idUsuario);
    public List<Usuario> obtenerRegistros(Usuario usuario);
    public Usuario obtenerRegistro(int idUsuario);

    public List<Usuario> obtenerRegistros();
}
