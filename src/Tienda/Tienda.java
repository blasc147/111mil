/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Blas
 */
public class Tienda {
    
    private static List<Producto> productos;
 
    public Tienda() {
        productos= new ArrayList<>();
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
 
        Tienda minitienda = new Tienda();
 
        menuEntrada();
 
    }
 
    
    public static void menuEntrada () {
        int opcion;
 
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("++++ SupermerK2 +++++");
            System.out.println("");
            System.out.println("1 Registrar un Producto");
            System.out.println("2 Registrar Venta");
            System.out.println("3 Salir ");
            opcion = teclado.nextInt();
 
            switch (opcion) {
                case 1: {
                    menuProductos();
                    break;
                }
                case 2: {
                    menuVentas();
                    break;
                }
                case 3: {
                    System.out.println("Gracias!!!");
                    break;
                }
                default: {
                    System.out.println("Error");
                    break;
                }
            }
 
        } while (opcion != 3);
 
 
    }
 
    public static void menuProductos() {
        String respuesta = "no";
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("- Menu registrar producto -");
 
            productos.add(new Producto());
 
            System.out.println("Â¿Desea registrar otro Producto?");
            respuesta = teclado.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));
 
    }
 
    public static void menuVentas() {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        int unidades=0;
        String respuesta;
        double factura = 0;
        do {
            System.out.println("------Registrar Venta------");
            System.out.println("");
 
            for (int i = 0; i < productos.size(); i++) {
                System.out.println("Puse " + i + " Para comprar " + productos.get(i).getNombre() + " su precio " + productos.get(i).getPrecio() + " su stock " + productos.get(i).getStock() + " unidades");
            }
 
            opcion = teclado.nextInt();
 
            System.out.println("Ha elegido comprar " + productos.get(opcion).getNombre());
 
            for (int i = opcion; i < productos.size(); i++) {
 
                unidades = unidades();
 
                if (productos.get(i).quedaStock(unidades) == true) {
                    productos.get(i).modificarStock(unidades);
                     unidades = (int) (unidades * productos.get(i).getPrecio());
                }
                break;
            }
 
            factura = factura + unidades;
 
            System.out.println("¿Desea comprar otro producto?(si/no)");
            respuesta = teclado.next();
 
        } while (respuesta.equalsIgnoreCase("si"));
 
        System.out.println("El total de su compra es: $" + factura);
 
    }
 
    public static int unidades() {
        Scanner teclado = new Scanner(System.in);
        int unidades;
 
        System.out.println("Cantidad : ");
        unidades = teclado.nextInt();
 
        return unidades;
    }
 
 
    
}
