/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico;

/**
 *
 * @author pbape
 */
public class Publicidad {
    private int id;
    private String nombre;
    private String descripcion;
    private double costo;
    private MedioPublicidad medioPublicidad;

    /*
      Constructor de la clase Publicidad.
     */
    public Publicidad(int id, String nombre, String descripcion, double costo, MedioPublicidad medioPublicidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.medioPublicidad = medioPublicidad;
    }

    /*
     Obtiene el identificador de la publicidad.
     El identificador de la publicidad.
     */
    public int getId() {
        return id;
    }

    /*
     Obtiene el nombre de la publicidad.
     El nombre de la publicidad.
     */
    public String getNombre() {
        return nombre;
    }

    /*
      Obtiene la descripción de la publicidad.
      La descripción de la publicidad.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /*
      Obtiene el costo de la publicidad.
      El costo de la publicidad.
     */
    public double getCosto() {
        return costo;
    }

    /*
      Obtiene el medio de publicidad utilizado.
      El medio de publicidad utilizado.
     */
    public MedioPublicidad getMedioPublicidad() {
        return medioPublicidad;
    }

    /*
      Muestra la información de la publicidad.
     */
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Costo: " + costo);
        
    }
}

