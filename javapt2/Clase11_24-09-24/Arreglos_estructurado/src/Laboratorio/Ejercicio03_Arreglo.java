package Laboratorio;
import java.util.Scanner;
/*
Desarrolla una app que permita registrar
siete edades, para luego mostrar la edad mayor
*/

public class Ejercicio03_Arreglo {
    public static void main(String[] args) {
        // Declaración e inicialización de variables
        Scanner leer = new Scanner(System.in);
        int indiceEdadMayor = 0;
        int edades[] = {18, 10, 22, 16, 20, 8,28};
        
        // Entrada y proceso de datos
        // Obtener la edad de la posición 0
        int edadMayor = edades[0];

        for (int pos = 1; pos < edades.length; pos++) {
            // Comparando edades
            if (edadMayor < edades[pos]) {
                // Actualizar la edad mayor y su índice
                edadMayor = edades[pos];
                indiceEdadMayor = pos;
            }
        }  

        // Salida de datos
        System.out.println("La edad mayor: " + edadMayor);
    } 
}

/*
1era  forma
public class Ejercicio03_Arreglo {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner leer=new Scanner(System.in);
        int edades[]=new int[7];
        int edadMayor = 0;
        
        //Entrada y proceso de datos
        for(int e=0;e<edades.length;e++){
            System.out.print("Ingrese la edad # "+(e+1)+": ");
            edades[e]=leer.nextInt();
        }
        
        //Salidad de datos
        for (int e = 0; e < edades.length; e++) {
            if (edades[e] > edadMayor) {
                edadMayor = edades[e];
            }
        }
        System.out.println("La edad mayor es: " + edadMayor);
    }
    
}


*/
