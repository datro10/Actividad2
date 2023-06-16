/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico;

import java.util.Date;

/**
 *
 * @author pbape
 */
public class Compra {

    // Atributos
    private int consecutivo;
    private Date fecha;

    private Producto producto;
    private double precioCompra;
    private double cantidad;
    private double valorPagarSinIVA;
    private double valorPagarIVA;
    private double valorTotalPagar;

    // Constructor
    public Compra(int consecutivo, Date fecha, Producto producto,
            double precioCompra, double cantidad, double valorPagarSinIVA,
            double valorPagarIVA, double valorTotalPagar) {
        this.consecutivo = consecutivo;
        this.fecha = fecha;

        this.producto = producto;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.valorPagarSinIVA = valorPagarSinIVA;
        this.valorPagarIVA = valorPagarIVA;
        this.valorTotalPagar = valorTotalPagar;
    }

    // Métodos getters y setters
    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorPagarSinIVA() {
        return valorPagarSinIVA;
    }

    public void setValorPagarSinIVA(double valorPagarSinIVA) {
        this.valorPagarSinIVA = valorPagarSinIVA;
    }

    public double getValorPagarIVA() {
        return valorPagarIVA;
    }

    public void setValorPagarIVA(double valorPagarIVA) {
        this.valorPagarIVA = valorPagarIVA;
    }

    public double getValorTotalPagar() {
        return valorTotalPagar;
    }

    public void setValorTotalPagar(double valorTotalPagar) {
        this.valorTotalPagar = valorTotalPagar;
    }

}
