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
public class Lavarropas extends Electrodomestico{
    //Constantes
  
    /**
     * Carga por defecto
     */
    private final static int CARGA_DEF=5;
  
    //Atributos
  
    /**
     * Carga del lavarropas
     */
    private int carga;
  
    //Métodos publicos
  
    /**
     * Devuelve la carga del lavarropas
     * @return
     */
    public int getCarga() {
        return carga;
    }
  
    /**
     * Precio final del lavarropas
     * @return precio final del lavarropas
     */
    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double plus=super.precioFinal();
  
        //añadimos el código necesario
        if (carga>30){
            plus+=50;
        }
  
        return plus;
    }
  
    //Constructor
  
    /**
     * Contructor por defecto
     */
    public Lavarropas(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }
  
    /**
     * Constructor con 2 parametros
     * @param precioBase
     * @param peso
     */
    public Lavarropas(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }
  
    /**
     * Constructor con 5 parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param carga
     */
    public Lavarropas(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
}
