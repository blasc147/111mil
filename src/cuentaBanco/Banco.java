/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentaBanco;

/**
 *
 * @author Blas
 */
public class Banco {
    
    public static void main(String[] args) {
         
        Cuenta cuenta1 = new Cuenta("Juancito");
        
        Cuenta cuanta2 = new Cuenta("Carlos", 2000);
        
        
        cuenta1.ingresar(500);
        
        System.out.println(cuenta1);
        
        cuenta1.retirar(1000);
        
        
        
        
        
         
    }
    
}
