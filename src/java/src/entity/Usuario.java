/*
    Fecha de creación : 8/03/2022, 10:00:34 AM
    Author: Cristian Adair Ramirez Rodriguez
    Fecha de actualizacion:8/03/2022, 10:40:34 AM
    Descripcion:Usuarios
 */
package src.entity;

import java.util.ArrayList;

/**
 *
 * @author labso07
 */
public class Usuario extends Producto {

    int codigo;
    String nombre_usuario;
    String contraseña;
    String sexo;
    int edad;

    public Usuario(int codigo, String nombreusuario, String contraseña, String nombre,String sexo,int edad) {

    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getcodigo() {
        return codigo;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Usuario() {

    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    }

