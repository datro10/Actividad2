/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoritmosDeOrdenamiento;

import java.util.Random;

/**
 *
 * @author pbape
 */
public class AlgoritmoBogoSort {

    public void bogoSort(int[] arr) {
        while (!isSorted(arr)) {
            shuffle(arr);
        }
    }

    
    private boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    
    private void shuffle(int[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            swap(arr, i, j);
        }
    }

    
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

  
    private void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        AlgoritmoBogoSort ejemplo = new AlgoritmoBogoSort();
        int[] arr = {8, 4, 1, 6, 10, 3, 5, 2, 9, 7};
        System.out.println("Arreglo original:");
        ejemplo.imprimirArreglo(arr);

        ejemplo.bogoSort(arr);

        System.out.println("Arreglo ordenado:");
        ejemplo.imprimirArreglo(arr);
    }
}
