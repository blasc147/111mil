/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.util.Scanner;

/**
 *
 * @author Blas
 */
public class JuegoAdivinaNumero extends Juego {

    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
    }
    
    @Override
    public void juega() {
        int numero = (int) (Math.random() * 1000) + 1;
        
        Scanner sc = new Scanner(System.in);
        
        boolean bandera=true;
        
        while(bandera){
            System.out.print("Introduzca un número: ");
            int n = sc.nextInt();
            if(this.validaNumero(n)){
                if(n==numero ){
                System.out.println("Correcto!!");
                break;
                }else{
                    System.out.println("Incorrecto!!");
                    vidas--;
                    bandera = this.quitaVida();
                    if(n>numero){
                        System.out.println("En numero es menor");
                    }else{
                        System.out.println("El numero es mayor");
                    }
                }
            }else{
                System.out.println("Nro fuera de rango.");
            }
            
            
        }
        
        System.out.println("Fin del Juego");
        
    }
    
    public boolean validaNumero(int nro){
        return !(nro>1000 || nro<=1);
    }

    @Override
    public void reiniciarPartida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
