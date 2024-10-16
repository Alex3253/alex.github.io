package Laboratorio;
/*
Desarrollar una app que permita almacenar una coleccion de 10 
nombres de personas.
Finalmente debe mostrar un reporte de todos los nombes y el total 
de nombres ingresadas.
*/
import java.util.Scanner;
public class Ejercicio01_Arreglo {
    public static void main(String[] args) {
        //Declaracon de variables
        Scanner leer=new Scanner(System.in);
        String nombres[]=new String[10];

        
        //Entrada y proceso de datos
        for(int n=0; n<nombres.length;n++){
            System.out.print("Ingrese el nombre #"+(n+1)+" : ");
            nombres[n]=leer.next();
        }
        
        //Salidad de datos
        for(int n=0; n<nombres.length;n++){
            System.out.println((n+1) + " : nmbre : " + nombres[n]);
           
        }
        System.out.println("Cantidad total de nombres: " + nombres.length);
        
        
    }
    
}
