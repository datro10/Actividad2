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
public class LibretaProducto {

    private List<Compra> compras;

    /*
      Constructor de la clase LibretaCompra.
     */
 /*
      Agrega una compra a la libreta.
      compra La compra a agregar.
     */
    public void agregarCompra(Compra compra) {
        compras.add(compra);
    }

    /*
      Obtiene todas las compras registradas en la libreta.
      Una lista de compras.
     */
    public List<Compra> obtenerCompras() {
        return compras;
    }

    /*
     Obtiene el número total de compras realizadas.
     El número total de compras.
     */
    public int obtenerTotalCompras() {
        return compras.size();
    }
}
