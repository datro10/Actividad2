/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico;

/**
 *
 * @author pbape
 */
public class MedioPublicidad {
    private int id;
    private String nombre;
    private String descripcion;

    /*
     Constructor de la clase MedioPublicidad.
     */
    public MedioPublicidad(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /*
      Obtiene el identificador del medio de publicidad.
      El identificador del medio de publicidad.
     */
    public int getId() {
        return id;
    }

    /*
      Obtiene el nombre del medio de publicidad.
      El nombre del medio de publicidad.
     */
    public String getNombre() {
        return nombre;
    }

    /*
     Obtiene la descripción del medio de publicidad.
      La descripción del medio de publicidad.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /*
     Muestra la información del medio de publicidad.
     */
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
    }
}

