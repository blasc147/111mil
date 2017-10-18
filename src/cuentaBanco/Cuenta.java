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
public class Cuenta {
    
    //Atributos
    private String titular;
    private double saldo;
 
    //Constructores
    public Cuenta(String titular) {
        this(titular, 0); //Sobrecarga
    }
 
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        //Si la cantidad es menor que cero, lo ponemos a cero
        if (cantidad < 0) {
            this.saldo = 0;
        } else {
            this.saldo = cantidad;
        }
    }
 
    //Metodos
    public String getTitular() {
        return titular;
    }
 
    public void setTitular(String titular) {
        this.titular = titular;
    }
 
    public double getCantidad() {
        return saldo;
    }
    
    public void setCantidad(double cantidad) {
        this.saldo = cantidad;
    }
 
    /**
     * Deposito en la cuenta, 
     * solo si es positivo la cantidad
     *
     * @param cantidad
     */
    public void ingresar(double cantidad) {
        if(cantidad > 0){
            this.saldo += cantidad;   
        }
    }
 
    /**
     * Retira una cantidad en la cuenta, si no hay suficiente se retira lo que hay
     *
     * @param cantidad
     */
    public void retirar(double cantidad) {
        if (this.saldo - cantidad < 0) {
            System.out.println("Saldo insuficiente");
            System.out.println("Saldo disponible: $"+ saldo);
        } else {
            this.saldo -= cantidad;
        }
    }
 
    /**
     * Devuelve el estado del objeto
     *
     * @return
     */
    @Override
    public String toString() {
        return "Titular: " + titular + " Saldo: $" + saldo ;
    }
    
}
