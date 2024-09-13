package Leccion01_Introduccion_Java;

import java.util.Scanner;

public class J05_EntradaDatos {
    public static void main(String[] args) {
        //Declaracion de objetos de tpo Scanner
        Scanner leer;
        
        //Creando una instancia u objeto de tipo Scanner
        leer = new Scanner(System.in);
        
        //Declaracion de variables
        String nombre;
        int edad;
        double estatura;
        
        //Entrada de datos
        System.out.print("Ingresa tu nombre: ");
        nombre = leer.next();
                
        System.out.print("Ingresa tu edad: ");
        edad = leer.nextInt();
        
        System.out.print("Ingresa tu estatura: ");
        estatura = leer.nextDouble();
        
        //Salida dde datos
        System.out.println("-------------------");
        System.out.println("Reporte de usuario ");
        System.out.println("-------------------");
        System.out.println("Nombre del usuario: " + nombre);
        System.out.println("Edad del usuario: " + edad);
        System.out.println("Estatura del usuario: " + estatura);
        
    }
    
}
