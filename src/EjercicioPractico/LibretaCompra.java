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
public class LibretaCompra {
        // Atributos
    private List<Compra> compras;

    // Constructor
    public LibretaCompra() {
        compras = new ArrayList<>();
    }

    // Método para agregar una compra a la libreta
    public void agregarCompra(Compra compra) {
        compras.add(compra);
    }

    // Método para obtener todas las compras de la libreta
    public List<Compra> obtenerCompras() {
        return compras;
    }

    // Método para buscar una compra por su consecutivo
    public Compra buscarCompraPorConsecutivo(int consecutivo) {
        for (Compra compra : compras) {
            if (compra.getConsecutivo() == consecutivo) {
                return compra;
            }
        }
        return null; // Retorna null si no se encuentra la compra
    }

    // Método para calcular el total de dinero invertido en compras
    public double calcularTotalDineroInvertido() {
        double total = 0;
        for (Compra compra : compras) {
            total += compra.getPrecioCompra() * compra.getCantidad();
        }
        return total;
    }

    // Método para obtener el número total de compras realizadas
    public int obtenerTotalCompras() {
        return compras.size();
    }
}
