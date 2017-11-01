/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.util.*;

/**
 *
 * @author Blas
 */
public abstract class Juego {
    
    //Recordar: si al menos un metodo de la clase es abstracto la clase debe ser abstracta
    //Una clase puede ser abstracta y tener todos sus metodos concretos
    protected int vidas;
    protected int nro;
    
    public Juego(int vidas){
        this.vidas=vidas;
    }

    public abstract void juega();
    
    public abstract void reiniciarPartida();
    
    public boolean quitaVida(){
        return vidas>0;
    }
    
    
}
