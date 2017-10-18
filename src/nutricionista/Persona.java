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
public class Persona {
    
    private String nombre;
    
    private String apellido;
 
    private int edad;
 
    private String DNI;
 
    private char sexo;
 
    private double peso;
 
    private double altura;
    
    public static final int menosPeso = -1;
 
    public static final int pesoIdeal = 0;
 
    public static final int sobrePeso = 1;

    public Persona(String nombre, String DNI) {
        this(nombre, "", 0, DNI, 'H', 0, 0);
    }

    

    public Persona(String nombre, String apellido, int edad, String DNI, char sexo) {
        this(nombre, apellido, edad, DNI, sexo, 0, 0);
    }
    
    

    public Persona(String nombre, String apellido, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        comprobarSexo();
        this.peso = peso;
        this.altura = altura;
    }

    private void comprobarSexo() {
 
        if (sexo != 'H' || sexo != 'M') {
            this.sexo = 'H';
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public int calcularIMC() {
        
        double pesoActual = peso / (Math.pow(altura, 2));
        
        if (pesoActual >= 20 && pesoActual <= 25) {
            return pesoIdeal;
        } else if (pesoActual < 20) {
            return menosPeso;
        } else {
            return sobrePeso;
        }
    }
    
    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }
    
    @Override
    public String toString() {
        String show;
        if (this.sexo == 'H') {
            show = "hombre";
        } else {
            show = "mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Apellido: " + apellido + "\n"
                + "Sexo: " + show + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + DNI + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }
    
}
