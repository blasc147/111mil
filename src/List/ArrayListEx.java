/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Blas
 */
public class ArrayListEx {
    
    public static void main(String[] args) {
        
        // Declaración el ArrayList
        ArrayList<String> nombreArrayList = new ArrayList<String>();

        // Añadimos 10 Elementos en el ArrayList
        for (int i=1; i<=10; i++){
                nombreArrayList.add("Elemento "+i); 
        }

        // Añadimos un nuevo elemento al ArrayList en la posición 2
        nombreArrayList.add(2, "Elemento 3");

        // Declaramos el Iterador e imprimimos los Elementos del ArrayList
        Iterator<String> nombreIterator = nombreArrayList.iterator();
        while(nombreIterator.hasNext()){
                String elemento = nombreIterator.next();
                System.out.print(elemento+" / ");
        }
        
        
         
    }
    
}
