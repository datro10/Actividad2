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
public class AlgoritmoRadixSort {
    
        public  void radixSort(int[] arreglo) {
                int maximo =  getterValorMaximo(arreglo);
for(int exp=1; maximo / exp >0; exp *=10){
           setterOrdenar(arreglo, exp);
        }
    }

        private  void setterOrdenar(int[] arr, int exp) {
        int n = arr.length;
        int[] a = new int[n];
        int[] b = new int[10];

        Arrays.fill(b, 0);

                for (int i = 0; i < n; i++) {
            b[(arr[i] / exp) % 10]++;
        }

                for (int i = 1; i < 10; i++) {
            b[i] += b[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            a[b[(arr[i] / exp) % 10] - 1] = arr[i];
            b[(arr[i] / exp) % 10]--;
        }

                for (int i = 0; i < n; i++) {
            arr[i] = a[i];
        }
    }

    private  int getterValorMaximo(int[] arr) {
        int vMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > vMax) {
                vMax = arr[i];
            }
        }
        return vMax;
    }

    private void setterImprimir(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
   
     public static void main(String[] args) {
         
           AlgoritmoRadixSort ejemplo=new  AlgoritmoRadixSort();
        int[] arreglo = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Arreglo original:");
        ejemplo.setterImprimir(arreglo);

        ejemplo.radixSort(arreglo);

        System.out.println("Arreglo ordenado:");
      ejemplo.setterImprimir(arreglo);
    }
    
}
   

