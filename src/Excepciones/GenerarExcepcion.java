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
public class GenerarExcepcion {

    public static void main(String[] args) {
        try {
            System.out.println("Mensaje mostrado por pantall");
            Exception e = new Exception("Esto es un objeto Exception");
            throw e;
        } catch (Exception ex) {
            System.out.println("Excepcion capturada con mensaje: " + ex.getMessage());
        }
        System.out.println("Programa terminado");

    }

}