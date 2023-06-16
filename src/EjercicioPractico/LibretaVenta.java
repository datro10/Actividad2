/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pbape
 */
public class LibretaVenta {
        private List<Venta> ventas;

    /*
      Constructor de la clase LibretaVenta.
     */
    public LibretaVenta() {
        ventas = new ArrayList<>();
    }

    /*
      Agrega una venta a la libreta de ventas.
      La venta a agregar.
     */
    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    }

    /*
      Obtiene todas las ventas registradas en la libreta.
      Una lista de ventas.
     */
    public List<Venta> obtenerVentas() {
        return ventas;
    }


}
