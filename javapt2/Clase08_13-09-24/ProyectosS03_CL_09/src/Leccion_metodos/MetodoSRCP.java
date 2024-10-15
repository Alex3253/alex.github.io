package Leccion_metodos;

import java.util.Scanner;

public class MetodoSRCP {
    //Metodo principal
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner leer=new Scanner(System.in);
        String nombre;
        int edad;
        double estatura;
        
        //Entrada de datos
        System.out.println("Ingresa el nombre: ");
        nombre=leer.next();
        
        System.out.println("Ingresa la edad: ");
        edad=leer.nextInt();
        
        System.out.println("Ingresa la estatura: ");
        estatura=leer.nextDouble();
        
        //Salidad de datos
        saludar(nombre);
        mostrarDatos(nombre, edad, estatura);
    }
    
    //Metodod saludar con paametros
    static void saludar(String nombre){
        System.out.println("Hola " + nombre);
    }
    
    //Metodo detalle con parametros
    static void mostrarDatos(String nombre, int edad, double estatura){
        System.out.println("Nombre del usuario: " + nombre);
        System.out.println("Edad del usuario: " + edad);
        System.out.println("Estatura del usuario: " + estatura);
        
    }
}
