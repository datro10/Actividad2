/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

/**
 *
 * @author pbape
 */
public class NodoLista {

    
    int valor;
    NodoLista siguiente;

    public NodoLista(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}

class ListaEnlazada {

    NodoLista cabeza;

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertar(int valor) {
        NodoLista nuevoNodo = new NodoLista(valor);
        if (estaVacia()) {
            cabeza = nuevoNodo;
        } else {
            NodoLista actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public void mostrar() {
        NodoLista actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaEnlazada miLista = new ListaEnlazada();
        miLista.insertar(10);
        miLista.insertar(20);
        miLista.insertar(30);
        miLista.mostrar();
    }
}
