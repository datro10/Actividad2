/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgoritmosDeOrdenamiento;

/**
 *
 * @author pbape
 */
public class MetodoInsercion {

    public void setterInsercion(int[] arreglo) {
        int a, nun1, nun2;
        for (nun1 = 1; nun1 < arreglo.length; nun1++) {

            a = arreglo[nun1];
            for (nun2 = nun1 - 1; nun2 >= 0 && arreglo[nun2] > a; nun2--) {
                arreglo[nun2 + 1] = arreglo[nun2];
                arreglo[nun2] = a;
            }

        }
    }

    public static void main(String[] args) {
        // TODO code application logic here

        int[] arreglo = {6, 5, 4, 3, 2, 1};
        MetodoInsercion ordena = new MetodoInsercion();
        ordena.setterInsercion(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

}
