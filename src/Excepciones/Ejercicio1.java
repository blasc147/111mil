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
public class Ejercicio1 {
    public static void main(String[] args){
        try {
            throw new Exception("Esto es una Excepcion");
        } catch(Exception e) {
            System.out.println("Se produjo un excepcion: " + e.getMessage());
        } finally {
            System.out.println("Siempre se muestra");
        }
   }
}
