package Laboratorio;
import java.util.Scanner;

/*
Desarrolla una aplicacion que permita almacenar
una coleccion de 10 evaluaciones de estudiantes.
finalmente debe mostrar un reorte de todas las 
evaluaciones myores a 14
*/
public class Ejercicio02_Arreglo {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner leer=new Scanner(System.in);
        int cant=0;                                                           //opcional
        double evaluaciones[]=new double[10];
        
        //Entrada y proceso de datos
        System.out.println("Registrando evaluaciones de los estudiantes");    //opcional(estetico)
        for(int e=0;e<evaluaciones.length;e++){
            System.out.print("Ingrese la evaluacion # "+(e+1)+": ");
            evaluaciones[e]=leer.nextDouble();
        }
        
        //Salidad de datos
        System.out.println("");
        System.out.println("Reporte de los estudiantes aprobados  > 14.5");  //opcional(estetico)
        for(int e=0;e<evaluaciones.length;e++){
            if(evaluaciones[e]>14.5){
                System.out.println(cant + " : Evaluacion: " + evaluaciones[e]);   //el cant es opcional(estetico)
                cant++;
            }
        }
        System.out.println("Tortal de evaluaciones aprobadas: " + cant);
        
    }
    
}
