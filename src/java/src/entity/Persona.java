/*

    Fecha de creación : 7/03/2022, 10:40:34 AM
    Author: Cristian Adair Ramirez Rodriguez
    Fecha de actualizacion:
    Descripcion:


 */

package src.entity;

/**
 *
 * @author labso07
 */
public class Persona {

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }
    String nombre;
    String sexo;
    int edad;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
