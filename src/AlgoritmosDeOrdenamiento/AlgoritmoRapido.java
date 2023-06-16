/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoritmosDeOrdenamiento;

public class AlgoritmoRapido {

    public void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int bajo, int alto) {
        if (bajo < alto) {
            int pivote = dividir(array, bajo, alto);
            quickSort(array, bajo, pivote - 1);
            quickSort(array, pivote + 1, alto);
        }
    }

    private int dividir(int[] array, int bajo, int alto) {
        int pivot = array[alto];
        int i = bajo - 1;
        for (int j = bajo; j < alto; j++) {
            if (array[j] < pivot) {
                i++;
                intercambio(array, i, j);
            }
        }

        intercambio(array, i + 1, alto);
        return i + 1;
    }

    private void intercambio(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {9, 5, 1, 8, 3, 2, 7};

        AlgoritmoRapido quickSort = new AlgoritmoRapido();
        quickSort.quickSort(array);

        System.out.println("Array ordenado:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
