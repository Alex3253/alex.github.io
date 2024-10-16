package leccion08_bucles;

/*
Desarrollar una app que permita registrar 5 empleados,
solicitando su nombre y su sueldo.
Finalmentedebe imprimir el total de los sueldos acumulados
*/
import java.util.Scanner;
public class bucle_while_determinado_Acumulador {
    public static void main(String[] args) {
        // Declaracion de variables
        Scanner leer= new Scanner(System.in);
        String nombre;
        double sueldo, tsueldos = 0;
        int n;
        
        //Entradad de datos
        n=1;
        while(n <=5){
            System.out.print("Ingresa el nombre del empleado: ");
            nombre= leer.next();
            
            System.out.println("Ingrese el suedo del empleado: ");
            sueldo=leer.nextDouble();
            
            tsueldos= tsueldos + sueldo;
            n= n+1;
        }

        //Salidad de datos
        System.out.println("Total de sueldos: " + tsueldos);

    }
    
}
