/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomesticos;
import java.util.*;
/**
 *
 * @author Blas
 */
public class Ejecutable {
     public static void main(String[] args) {
   
        //Creamos una lista de Electrodomesticos
        
        List<Electrodomestico> lista = new ArrayList<>();
        //Electrodomestico ele = new Electrodomestico(200, 60, 'C', "Madera");
        lista.add(0, new Electrodomestico(200, 60, 'C', "fsdf"));
        lista.add(1, new Electrodomestico(200, 50, 'C', "Madesdff"));
        lista.add(2, new Electrodomestico(200, 10, 'C', "Msdfsfd"));
        lista.add(3, new Electrodomestico(200, 20, 'C', "sdfffsd"));
        lista.add(4, new Electrodomestico(200, 30, 'C', "sdfsdffsd"));
        
        for(Electrodomestico electrodomestico : lista){
                if(electrodomestico.getPeso()>20){
                    System.out.println(electrodomestico);
                }
        }
        
        
        Iterator it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            it.remove();
            
        }
        System.out.println(lista);
   
    }
}
