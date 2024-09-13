package Leccion01_Introduccion_Java;

import java.util.Scanner;

/*
Desarrollar una aplicacion que permita solicitar el nombre, el examen parcial, 
el examen final para luego mostrar el nombre y promedio del estudiane.
*/

public class J06_ProcesoDatos {
    public static void main(String[] args) {
        //Declaracion de variables o objetos
        Scanner leer = new Scanner(System.in);
        String nomest;
        double exapar, exafin, proest;
        
        //Entrada de datos
        System.out.print("Ingrese el nombre del estudiante: ");
        nomest = leer.next();
        
        System.out.print("Ingrese el examen Parcial: ");
        exapar = leer.nextDouble();
        
        System.out.print("Ingrese el examen Final: ");
        exafin = leer.nextDouble();
        
        //Proceso de datos
        proest = (exapar + exafin) / 2;
        
        //Salida de datos
        System.out.println("El estudiante " + nomest 
                + " Tiene un promedio de  " + proest);
        
        
    }
    
}
