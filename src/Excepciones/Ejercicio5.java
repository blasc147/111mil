/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.util.Scanner;

/**
 *
 * @author Blas
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
    boolean flag = true; 
    while(flag) {        
        try {                
           System.out.print("Introduce un número entero: ");
           Scanner input = new Scanner(System.in);
           int num = input.nextInt();
           int cuadrado = num * num;
           System.out.println("El cuadrado de " + num + " = " + cuadrado);
           flag = false;
       } catch(Exception e) {
           System.out.println(e.getMessage());                
       }            
   }         
}
}
