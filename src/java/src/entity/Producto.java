/*
cristian adair ramirez rodriguez
Fecha de creación:07/03/2022
Fecha de actualización:08/03/2022
Descripción: Clase del producto
 */
package src.entity;

import java.util.ArrayList;

public class Producto {

    private String codigo;
    private String nombre;
    private String descripcion;
    private double precio;

    public Producto() {
    }

    public Producto(String codigo, String nombre, String descripcion, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static void main(String[] args) {
        Producto p1 = new Producto();
        Producto p2 = new Producto();
        Producto p3 = new Producto();

        ArrayList<Producto> listpro = new ArrayList<>();

        listpro.add(p1);
        listpro.add(p2);
        listpro.add(p3);

        p1.setCodigo("123");
        p1.setDescripcion("hot dog chico");
        p1.setNombre("hot dog");
        p1.setPrecio(25.50);

        p2.setCodigo("124");
        p2.setDescripcion("Hamburguesa grande");
        p2.setNombre("Hamburguesa");
        p2.setPrecio(100.50);

        p3.setCodigo("125");
        p3.setDescripcion("hot cakes");
        p3.setNombre("con miel");
        p3.setPrecio(25.50);

        for (int i = 0; i < 3; i++) {
            System.out.println("Codigo: " + listpro.get(i).getCodigo() + "\n");
            System.out.println("Descripción: " + listpro.get(i).getDescripcion() + "\n");
            System.out.println("Nombre: " + listpro.get(i).getNombre() + "\n");
            System.out.println("Precio: " + listpro.get(i).getPrecio() + "\n");

        }
    }
}
