/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico;

/**
 *
 * @author pbape
 */
public class Categoria {
      private String nombre;
    private String descripcion;

    /*
     * Constructor de la clase Categoria.
     El nombre de la categoría.
     descripcion La descripción de la categoría.
     */
    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /*
     Obtiene el nombre de la categoría.
     El nombre de la categoría.
     */
    public String getNombre() {
        return nombre;
    }

    /*
     Establece el nombre de la categoría.
     El nombre de la categoría a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
      Obtiene la descripción de la categoría.
      La descripción de la categoría.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /*
       Establece la descripción de la categoría.
       La descripción de la categoría a establecer.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

