/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.service;

import java.util.List;
import src.entity.Usuario;
import src.model.IUsuarioModel;
import src.model.UsuarioModellmpl;

/**
 *
 * @author labso07
 */
public class UsuarioServiceImpl implements IUsuarioService{
    IUsuarioModel modelo=new UsuarioModellmpl();

    @Override
    public void crearRegistro(Usuario usuario) {
        modelo.crearRegistro(usuario);
    }

    @Override
    public void actualizaRegistro(Usuario usuario) {
    modelo.actualizarRegistro();
       }

    @Override
    public void eliminarRegistro(int idUsuario) {
        modelo.eliminarRegistro(idUsuario);
    }

    @Override
    public List<Usuario> obtenerRegistros(Usuario usuario) {
           return modelo.obtenerRegistro(usuario);

    }

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
        return modelo.obtenerRegistro(idUsuario);
    }

 }