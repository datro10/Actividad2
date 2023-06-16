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
public class Venta {

    private int consecutivo;
    private Date fecha;
    private Cliente cliente;
    private String medioPago;
    private String modalidad;
    private Producto producto;
    private double precioVenta;
    private int cantidad;
    private double descuento;
    private double valorSinIVA;
    private double valorDescuento;
    private double valorIVA;
    private double valorTotal;

    /*
      Constructor de la clase Venta.
     
     */
    public Venta(int consecutivo, Date fecha, Cliente cliente, String medioPago, String modalidad, Producto producto,
            double precioVenta, int cantidad, double descuento, double valorSinIVA, double valorDescuento,
            double valorIVA, double valorTotal) {
        this.consecutivo = consecutivo;
        this.fecha = fecha;
        this.cliente = cliente;
        this.medioPago = medioPago;
        this.modalidad = modalidad;
        this.producto = producto;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.valorSinIVA = valorSinIVA;
        this.valorDescuento = valorDescuento;
        this.valorIVA = valorIVA;
        this.valorTotal = valorTotal;
    }

    Venta(String v001, String string, Producto producto1, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /*
      Obtiene el número consecutivo de la venta.
      El número consecutivo de la venta.
     */
    public int getConsecutivo() {
        return consecutivo;
    }

    /*
     Obtiene la fecha de la venta.
      La fecha de la venta.
     */
    public Date getFecha() {
        return fecha;
    }

    /*
      Obtiene el cliente asociado a la venta.
     El cliente asociado a la venta.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /*
      Obtiene el medio de pago utilizado en la venta.
      El medio de pago utilizado en la venta.
     */
    public String getMedioPago() {
        return medioPago;
    }

    /*
     Obtiene la modalidad de la venta (directa o domicilio).
     La modalidad de la venta.
     */
    public String getModalidad() {
        return modalidad;
    }

    /*
      Obtiene el producto vendido.
      El producto vendido.
     */
    public Producto getProducto() {
        return producto;
    }

    /*
      Obtiene el precio de venta del producto.
       El precio de venta del producto.
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /*
      Obtiene la cantidad de productos vendidos.
      La cantidad de productos vendidos.
     */
    public int getCantidad() {
        return cantidad;
    }

    /*
      Obtiene el descuento aplicado a la venta.
      El descuento aplicado a la venta.
     */
    public double getDescuento() {
        return descuento;
    }

    /*
      Obtiene el valor total de la venta sin incluir el IVA.
      El valor total de la venta sin incluir el IVA.
     */
    public double getValorSinIVA() {
        return valorSinIVA;
    }

    /*
      Obtiene el valor del descuento aplicado a la venta.
       El valor del descuento aplicado a la venta.
     */
    public double getValorDescuento() {
        return valorDescuento;
    }

    /*
      Obtiene el valor del IVA aplicado a la venta.
       El valor del IVA aplicado a la venta.
     */
    public double getValorIVA() {
        return valorIVA;
    }

    /*
     Obtiene el valor total de la venta.
     El valor total de la venta.
     */
    public double getValorTotal() {
        return valorTotal;
    }
}

