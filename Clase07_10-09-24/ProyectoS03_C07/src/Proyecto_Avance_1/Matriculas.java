package Proyecto_Avance_1;
import java.util.Scanner;
public class Matriculas {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner leer= new Scanner(System.in);
        int opcion, grado;
        String nombre;

        //Entradad de datos 
        System.out.println("Colegio Certus: ");
        System.out.println("----------------");
        System.out.println("[1]Inicial: ");
        System.out.println("[2]Primaria: ");
        System.out.println("[3]Secundaria: ");
        System.out.println("Elige una opcion: ");
        opcion= leer.nextInt();
        
        if(opcion == 1){
            System.out.println("Nivel de inicial");
            System.out.println("----------------");
            System.out.print("Elige un grado a matricular [3, 4, 5]:");
            grado= leer.nextInt();
            if (grado >=3 & grado <=5){
                System.out.println("Ingrese el nombre del estudiante");
                nombre= leer.next();
                System.out.println("El estudiante " + nombre + " se matriculo con exito"); 
            }else{
                System.out.println("Error al ingresar grado; ");
            }
        }else if(opcion ==2){
            System.out.println("Nivel de primaria");
            System.out.println("----------------");
        }else if(opcion ==3){
            System.out.println("Nivel de secundaria");
            System.out.println("----------------");
        }else{
            System.out.println("Error al ingresar nivel......");
        }
    }   
}
//Hay que acer lo mismo para primara y secundaria