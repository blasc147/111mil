/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Blas
 */
public class PartidoNoJugadoException extends Exception {
 // acá podríamos declarar y redefinir los métodos enunciados más arriba
 // por ahora sólo nos ocuparemos del mensaje de error
            @Override
            public String getMessage (){
                return "El partido aún no se ha jugado";
            }
            
}
