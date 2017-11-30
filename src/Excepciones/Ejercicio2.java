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
public class Ejercicio2 {
    private String s = "ejercico 2 sobre Excepciones";
    
    String getString() {
        return s;
    }
        
    public static void main(String[] args) {
       Ejercicio2 obj = null;
       try {
           obj.getString();
       } catch (Exception e){
           System.out.println("Se produjo una expción. ");
           e.printStackTrace();
       }
    }

}
