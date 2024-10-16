
package leccion08_bucles;

/*
Desarrolla una aplicacion que permita registrar el 
nombre y las notas del estudiantes,al iniciar el sistema de notas,
debe solicitar el nombre y la cantidad de notas a ingresar.
Finalmente debe imprimir el nombre y promedio de sus notas 
y la cantidad de notas acumuladas.
*/
import java.util.Scanner;

public class While_Indeterminado_Acumulador {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner leer= new Scanner(System.in);
        
        String nombre;
        int x, cantidad;
        double nota, tnotas, promedio;
        
        
        //Entradad d edatos
        System.out.println("Ingrese el nombre del estudiante:");
        nombre=leer.next();
        
        System.out.println("Ingrese la cantidad de notas a registrar: ");
        cantidad=leer.nextInt();
        
        //Proceso de datos
        x=1;
        nota= 0;
        tnotas= 0;
        while(x <=cantidad){
            System.out.println("Ingresa la nota # " + x + " : ");
            nota= leer.nextDouble();
            tnotas = tnotas + nota;
            x++;    // x=x+1
        }
        promedio= tnotas/ cantidad;
        
        //Salidad de datos
        System.out.println("El estudiante " + nombre + " tiene el romedio: " + promedio);
        System.out.println("Cantidad de notas ingresadas: " + cantidad);
        
                
    }
    
}
