/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Blas
 */
public class Ejercicio3 {
    
    int[] array = {0, 1, 2, 3, 4, 5};
    int getValor(int indice) {
        return array[indice];
    }

    public static void main(String[] args) {
        Ejercicio3 ea = new Ejercicio3();
        try {
           ea.getValor(6);
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Excepción: indice de array fuera de limites: " + e.getMessage());
       }
   }
}
