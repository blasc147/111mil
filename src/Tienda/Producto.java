/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import java.util.Scanner;

/**
 *
 * @author Blas
 */
public final class Producto {
    
    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
        solicitarNombrePro();
        solicitarStockPro();
        solicitarPrecioPro();
    }
    
    public static int solicitarProductos() {
        int numeroPro;
        Scanner teclado = new Scanner(System.in);
 
        System.out.println("¿Cuantos productos desea cargar?");
 
        numeroPro = teclado.nextInt();
        return numeroPro;
    }
    public void solicitarNombrePro(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("------Producto--------");
        System.out.println("Nombre del producto: ");
        nombre = teclado.nextLine();
    }
 
    public void solicitarStockPro(){
        Scanner teclado = new Scanner(System.in);
 
        System.out.println("Introduce el stock de: " + getNombre() + " : ");
        stock = teclado.nextInt();
    }
    
    public void solicitarPrecioPro(){
        Scanner teclado = new Scanner(System.in);
 
        System.out.println("Introduce el precio de: " + getNombre() + " : ");
        precio = teclado.nextInt();
    }
    
    public void modificarStock(int sto){
        stock = stock -sto;
        System.out.println("Venta realizada.");
    }
    public boolean quedaStock(int sto){
 
        if (stock >= sto) {
 
            return true;
 
        } else {
 
            System.err.println("Stock Insuficiente. Quedan " + stock + " unidades");
 
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    
    
}
