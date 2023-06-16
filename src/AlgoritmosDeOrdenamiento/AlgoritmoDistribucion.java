/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoritmosDeOrdenamiento;

import java.util.Arrays;

public class AlgoritmoDistribucion {

    static void sort(int[] arreglo, int maximoValor) {
        int[] cubeta = new int[maximoValor + 1];
        for (int i = 0; i < cubeta.length; i++) {
            cubeta[i] = 0;
        }

        for (int i = 0; i < arreglo.length; i++) {
            cubeta[arreglo[i]]++;
        }

        int a = 0;
        for (int i = 0; i < cubeta.length; i++) {
            for (int j = 0; j < cubeta[i]; j++) {
                arreglo[a++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arreglo = {5, 3, 1, 4, 2};
        System.out.println("arreglo Original: " + Arrays.toString(arreglo));
        sort(arreglo, 5);
        System.out.println(" arreglo ordenado: " + Arrays.toString(arreglo));
    }
}
