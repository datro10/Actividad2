/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AlgoritmosDeOrdenamiento;

/**
 *
 * @author pbape
 */
public class MetodoBurbuja {

    public void OrdenarBurbuja(int[] array) {

        int a;
        boolean o = false;

        while (true) {

            o = false;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    a = array[i];
                    array[1] = array[i - 1];
                    array[i - 1] = a;
                    o = true;
                }

            }

        }

    }

    public static void main(String[] args) {
        // TODO code application logic here

        int[] arreglo = {6, 5, 4, 3, 2, 1};
        MetodoBurbuja ordena = new MetodoBurbuja();
        ordena.OrdenarBurbuja(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

}
