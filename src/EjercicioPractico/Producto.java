/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico;

/**
 *
 * @author pbape
 */
public class Producto {
     // Atributos
    private String codigo;
    private String nombre;
    private String marca;
    private String color;
    private double precioCompra;
    private double precioVenta;
    private double descuentoMaximo;
    private int unidadesExistencia;
    private String unidadMedida;
    private String categoria;

    // Constructor
    public Producto(String codigo, String nombre, String marca, String color, double precioCompra,
                    double precioVenta, double descuentoMaximo, int unidadesExistencia,
                    String unidadMedida, String categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.descuentoMaximo = descuentoMaximo;
        this.unidadesExistencia = unidadesExistencia;
        this.unidadMedida = unidadMedida;
        this.categoria = categoria;
    }

    Producto(String p001, String producto_1, double d) {
       
    }

    // Métodos getters y setters
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getDescuentoMaximo() {
        return descuentoMaximo;
    }

    public void setDescuentoMaximo(double descuentoMaximo) {
        this.descuentoMaximo = descuentoMaximo;
    }

    public int getUnidadesExistencia() {
        return unidadesExistencia;
    }

    public void setUnidadesExistencia(int unidadesExistencia) {
        this.unidadesExistencia = unidadesExistencia;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Otros métodos si es necesario

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", precioCompra=" + precioCompra +
                ", precioVenta=" + precioVenta +
                ", descuentoMaximo=" + descuentoMaximo +
                ", unidadesExistencia=" + unidadesExistencia +
                ", unidadMedida='" + unidadMedida + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}

