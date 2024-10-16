package Leccion03_Estructura_Seleccion;


/*
Desarrolla un programa ue permita solicitar e nombre y edad de un usuario; si la edad de un usuario es mayor o igual a 18años; 
entonces tiene que mostrar un mensaje "tu eres mayor de edad", caso contraio no inprime ningun mensaje
*/
import java.util.Scanner;

public class IF_Simple {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner leer= new Scanner(System.in);
        String nombre, mensaje="";
        int edad;
        
        //Entrada de datos
        System.out.println("Ingresa tu nombre: ");
        nombre= leer.next();
        
        System.out.println("Ingresa tu edad: ");
        edad= leer.nextInt();
        
        //Proceso de datos
        if ( edad >=18 ){
            mensaje= " Tueres mayor de edad";
        }
        
        
        //Salida de datos
        if(mensaje != " "){
        System.out.println("El usuario " + nombre + " es mayor de edad");
        }
    }
    
}
