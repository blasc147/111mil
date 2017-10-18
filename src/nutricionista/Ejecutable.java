/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista;

/**
 *
 * @author Blas
 */
public class Ejecutable {

   
    public static void main(String[] args){
        
        Persona person2 = new Persona("Juan", "Perez", 25, "33687417", 'H', 200, 1.8);
        System.out.println(person2);
        MuestraMensajePeso(person2);
        
        System.out.println(Persona.sobrePeso);
        
        
    }

    public static void MuestraMensajePeso(Persona p) {
        
        
        int IMC = p.calcularIMC();
        switch (IMC) {
            case Persona.pesoIdeal:
                System.out.println("La persona esta en su peso ideal");
                break;
            case Persona.menosPeso:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case Persona.sobrePeso:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }

    
    
}
