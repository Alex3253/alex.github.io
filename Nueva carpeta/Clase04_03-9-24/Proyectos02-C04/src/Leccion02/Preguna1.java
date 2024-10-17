package Leccion02;

//Un hospital ha recibido una donacion especial que sera repartida entre las 
//areas de pediatria, medicina general, ginecologia y traumatologia. 
//Cada area recibira una parte de la donacion equivalente a:


//Pediatria= 20% del monto total recibido entre medicina general y ginecologia
//Medicina general= 45% de la donacion
//Ginecologia= 80% del monot recibido por medicina general
//Traumatologia= lo que resta de la dnacion

//Dado el monto de la donacion, diseñe un algoritmo que determine cuanto recibira cada area

import java.util.Scanner;

public class Preguna1 {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner leer= new Scanner(System.in);
        double pediatria, meGeneral, ginecologia, traumatologia, donacion;
        
        //Entrada de datos
        System.out.println("Ingrese el monto total de la Donacion: ");
        donacion= leer.nextDouble();
        
        //Proceso de datos
        pediatria= 0.20 * donacion *( meGeneral + ginecologia);
        meGeneral= 0.45 * donacion;
        ginecologia= 0.80 * meGeneral;
        traumatologia= donacion - (pediatria + meGeneral + ginecologia);
        
        //Salida de datos
        System.out.println("Pediatria: " + pediatria);
        System.out.println("Medicina General: " + meGeneral);
        System.out.println("Ginecologia: " + ginecologia);
        System.out.println("Traumatologia: " + traumatologia);
        
        
               
        
        
        
        
    }
    
}
