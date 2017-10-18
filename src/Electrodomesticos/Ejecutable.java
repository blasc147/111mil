/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomesticos;

/**
 *
 * @author Blas
 */
public class Ejecutable {
     public static void main(String[] args) {
   
        //Creamos un array de Electrodomesticos
        Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];
   
        //Asignamos cada una de las posiciones como queramos
        listaElectrodomesticos[0]=new Electrodomestico(200, 60, 'C', "Madera");
        listaElectrodomesticos[1]=new Lavarropas(150, 30);
        listaElectrodomesticos[2]=new Television(500, 80, 'E', "Negro", 42, false);
        listaElectrodomesticos[3]=new Electrodomestico();
        listaElectrodomesticos[4]=new Electrodomestico(600, 20, 'D', "gris");
        listaElectrodomesticos[5]=new Lavarropas(300, 40, 'Z', "plata", 40);
        listaElectrodomesticos[6]=new Television(250, 70);
        listaElectrodomesticos[7]=new Lavarropas(400, 100, 'A', "oro", 15);
        listaElectrodomesticos[8]=new Television(200, 60, 'C', "Dorado", 30, true);
        listaElectrodomesticos[9]=new Electrodomestico(50, 10);
   
        //Creamos las variables que usaremos para almacenar la suma de los precios
        double totalElectrodomesticos=0;
        double totalTelevisiones=0;
        double sumaLavarropas=0;
   
        //Recorremos el array invocando el metodo precioFinal
        for(int i=0;i<listaElectrodomesticos.length;i++){
            /*
             * Cuando una Television o un Lavarropas este en la posicion del array actual,
             * pasara por su clase y por la de electrodomestico, ya que una television es un electrodomestico.
             * Ejecutamos en cada uno su propia version del metodo precioFinal
             */
   
            if(listaElectrodomesticos[i] instanceof Electrodomestico){
                totalElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavarropas){
                sumaLavarropas+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Television){
                totalTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }
   
        //Mostramos los resultados
        System.out.println("La suma del precio de los electrodomesticos es de "+totalElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavarropas);
        System.out.println("La suma del precio de las televisiones es de "+totalTelevisiones);
   
    }
}
