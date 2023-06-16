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
public class LibretaCliente {

    private List<Cliente> clientes;

    /*
      Constructor de la clase LibretaCliente.
      Inicializa una lista vacía de clientes.
     */
    public LibretaCliente() {
        this.clientes = new ArrayList<>();
    }

    /*
     grega un cliente a la libreta.
     El cliente a agregar.
     */
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    /*
      Elimina un cliente de la libreta.
      El cliente a eliminar.
     */
    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    /*
       Obtiene la lista completa de clientes en la libreta.
      La lista de clientes.
     */
    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    /*
      Busca un cliente en la libreta por su número de cédula.
      El número de cédula del cliente a buscar.
      El cliente encontrado, o null si no se encuentra.
     */
    public Cliente buscarClientePorCedula(String cedula) {
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }
        return null;
    }

    /*
     Busca todos los clientes en la libreta que coincidan con un nombre dado.
     El nombre a buscar.
     La lista de clientes encontrados que coinciden con el nombre.
     */
    public List<Cliente> buscarClientesPorNombre(String nombre) {
        List<Cliente> encontrados = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                encontrados.add(cliente);
            }
        }
        return encontrados;
    }
}
