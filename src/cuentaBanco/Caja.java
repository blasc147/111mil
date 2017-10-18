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
public class Caja {
    
    private String titular;

    @Override
    public String toString() {
        return "TItular : "+ titular;
    }


    public Caja(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
}
