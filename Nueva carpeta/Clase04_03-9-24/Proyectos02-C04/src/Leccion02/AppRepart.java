package Leccion02;

//Una empresa

import java.util.Scanner;
public class AppRepart {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner leer= new Scanner(System.in);
        double alquiler, publicidad, transporte, servicios, decoracion, gastosVarios, monto;
        
        //Entrada de datos
        System.out.print("Ingrese el monto a invertir: ");
        monto=leer.nextDouble();
        
        //Proceso de datos
        alquiler= 0.23 * monto ;
        publicidad= 0.07 * monto;
        transporte= 0.26 * monto;
        servicios= 0.12 * monto;
        decoracion= 0.21 * monto;
        gastosVarios= 0.11 * monto;
        
        //Salidad de datos
        System.out.println("----------------------------------");
        System.out.println("Alquiler del local: " + alquiler);
        System.out.println("Publicidad: " + publicidad);
        System.out.println("Transporte: " + transporte);
        System.out.println("Servicios Feriales: " + servicios);
        System.out.println("Decoracion: " + decoracion);
        System.out.println("Gastos Varios: " + gastosVarios);   
    }
    
}
