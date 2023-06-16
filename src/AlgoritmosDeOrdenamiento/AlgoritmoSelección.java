/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoritmosDeOrdenamiento;

/**
 *
 * @author pbape
 */
public class AlgoritmoSelección {

    public void setterSelección(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int minimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[minimo]) {
                    minimo = j;
                }
            }
            if (i != minimo) {
                int a = arreglo[i];
                arreglo[i] = arreglo[minimo];
                arreglo[minimo] = a;
            }

        }

    }

    public static void main(String[] args) {
     
        int[] arreglo = {6, 5, 4, 3, 2, 1};
        AlgoritmoSelección ordena = new AlgoritmoSelección();
        ordena.setterSelección(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

}
