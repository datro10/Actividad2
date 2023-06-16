/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoritmosDeOrdenamiento;

/**
 *
 * @author pbape
 */
public class AlgoritmoCombSort {

    public static void combSort(int[] arr) {
        int n = arr.length;
        int gap = n;
        boolean intercambio = true;

        while (gap > 1 || intercambio) {

            gap = obtenerSiguienteGap(gap);
            intercambio = false;

            for (int i = 0; i < n - gap; i++) {
                if (arr[i] > arr[i + gap]) {

                    intercambiar(arr, i, i + gap);
                    intercambio = true;
                }
            }
        }
    }

    private static int obtenerSiguienteGap(int gap) {
        gap = (gap * 10) / 13;
        if (gap < 1) {
            return 1;
        }
        return gap;
    }

    private static void intercambiar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 6, 10, 3, 5, 2, 9, 7};
        System.out.println("Arreglo original:");
        imprimirArreglo(arr);

        combSort(arr);

        System.out.println("Arreglo ordenado:");
        imprimirArreglo(arr);
    }
}
