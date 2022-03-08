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

    String codigo;
    String nombreusuario;
    String contraseña;

    public Usuario(String codigo, String nombreusuario, String contraseña, String nombre) {

    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Usuario() {

    }

    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();
        Usuario u3 = new Usuario();

        ArrayList<Usuario> listpro = new ArrayList<>();
        listpro.add(u1);
        listpro.add(u2);
        listpro.add(u3);

        u1.setCodigo("2421");
        u1.setNombreusuario("gerardo");
        u1.setContraseña("Gerardunsis");

        u1.setCodigo("2422");
        u1.setNombreusuario("Alberto");
        u1.setContraseña("AlbertoUnsis");

        u1.setCodigo("2423");
        u1.setNombreusuario("Matilde");
        u1.setContraseña("MatildeUnsis");

        for (int i = 0; i < 3; i++) {
            System.out.println("Codigo: " + listpro.get(i).getCodigo() + "\n");
            System.out.println("Descripción: " + listpro.get(i).getNombreusuario() + "\n");
            System.out.println("Nombre: " + listpro.get(i).getContraseña() + "\n");

        }

    }
}
