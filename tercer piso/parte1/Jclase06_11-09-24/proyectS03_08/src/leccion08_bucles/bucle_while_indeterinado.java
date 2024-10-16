package leccion08_bucles;

import java.util.Scanner;

public class bucle_while_indeterinado {
    public static void main(String[] args) {
        //Ejercicio #2
        //Declaracion de variables
        Scanner leer= new Scanner(System.in);
        int cantidad, inicio=1;
        String mensaje;
        
        //Entrada de datos
        System.out.println("Ingresa el mensaje: ");
        mensaje=leer.next();
        
        System.out.println("Ingresa la cantidad a imprimir: ");
        cantidad= leer.nextInt();
        
        //Proceso de datos
        while(inicio <=cantidad){
            System.out.println("curso java");
            inicio++;
        }
    }
    
    
}


