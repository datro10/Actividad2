/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoritmosDeOrdenamiento;

import java.util.Arrays;

/**
 *
 * @author pbape
 */
public class AlgoritmoPorCuentas {

    public void countingSort(int[] arr) {
        int n = arr.length;

        int max = Arrays.stream(arr).max().getAsInt();

        int[] count = new int[max + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        int[] sortedArr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            sortedArr[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = sortedArr[i];
        }
    }

    public static void main(String[] args) {
        AlgoritmoPorCuentas ejemplo = new AlgoritmoPorCuentas();
        int[] arr = {5, 2, 8, 4, 1, 3, 9, 6, 7};
        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(arr));

        ejemplo.countingSort(arr);

        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(arr));
    }
}
