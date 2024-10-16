package Leccion03_Estructura_Seleccion;

/*
DESARROLLA UN PROGRAMA QUE PERMITA SOLICITAR EL NOMBRE DEl estudiante, examen parcial y examen final. 
para luego mosrar el promedio y una observacion indicando si esta aprobado o desaprobado.
*/

import java.util.Scanner;
public class IF_Compuesto {
    public static void main(String[] args) {
        //Declaracion d evariables
        Scanner leer= new Scanner(System.in);
        String nombre, obsEstudiante;
        double exParcial, exFinal, promedio;
        
        //Entrada de datos
        System.out.print("Ingresa tu nombre: ");
        nombre=leer.next();
        
        System.out.print("Ingrese el examen Parcial: ");
        exParcial= leer.nextDouble();
        
        System.out.print("Ingrese el examen Final: ");
        exFinal= leer.nextDouble();
        
        //Proceso de datos
        promedio= (exParcial + exFinal)/2;
        
        if(promedio >= 12.5){
            obsEstudiante= "Aprobado";
        }else{
            obsEstudiante= "Desaprobado";
        }
        
        
        //Salida de datos
        System.out.println("Estudiante " + nombre + " tiene un promedio de " + promedio + " entonces esta " + obsEstudiante);

    }
    
}
