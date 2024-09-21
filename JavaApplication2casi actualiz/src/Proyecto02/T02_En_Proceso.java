package Proyecto02;
import java.util.Scanner;   
public class T02_En_Proceso {

    public static void main(String[] args) {
        //Declaracion de variables
        Scanner leer = new Scanner(System.in);
        int opcion, grado;
        String nombre;
        
        //Salir del sistema de registos de estdantes
        opcion=0;
        while(opcion !=4){
            //Entradads de datos
            System.out.println("Colegio Certus: ");
            System.out.println("----------------");
            System.out.println("[1]Inicial");
            System.out.println("[2]Primarias");
            System.out.println("[3]Secundaria");
            System.out.println("[4]Salir");
            System.out.println("Elige una opcion: ");
            opcion = leer.nextInt();
        
            //Validacion de las opciones del menu(error)
            while(opcion<1 || opcion >4){
                System.out.println("Error, vuelve a elegir una opcion: ");
                opcion=leer.nextInt();
            }

            if (opcion == 1) {
                //Validacion si deseas continuar registrando estudiantes:
                char rpta= 'S';
                while(rpta == 'S' || rpta=='s'){
                    System.out.println("Nivel Inicial: ");
                    System.out.println("---------------");
                    System.out.println("Elige un grado a matricular [3, 4, 5]");
                    grado = leer.nextInt();

                //Validacion del grado inicial
                while(grado<3 || grado >5){                     //ES UN O (||)    
                    System.out.println("Error, vuelve a elegir el grado: ");
                    grado=leer.nextInt();
                }
                if (grado >= 3 & grado <= 5) {
                    System.out.println("Ingrese el nombre del estudiante: ");
                    nombre = leer.next();
                    System.out.println("El estudiante " + nombre + " se matriculo con exito");
                }
                System.out.println("Deseas continuar S/N: ");
                rpta=leer.next().charAt(0);
             }
  
            } else if (opcion == 2) {
                //Validacion si deseas continuar registrando estudiantes:
                char rpta2= 'S';
                while(rpta2 == 'S' || rpta2=='s'){
                    System.out.println("Nivel de primaria");
                    System.out.println("-----------------");
                    System.out.println("Elige un grado a matricular [1, 2, 3, 4, 5, 6]");
                    grado = leer.nextInt();
                    
                //Validacion del grado primaria
                while(grado<1 || grado >6){                     //ES UN O (||)    
                    System.out.println("Error, vuelve a elegir el grado: ");
                    grado=leer.nextInt();
                }
                if (grado >= 1 & grado <= 6) {
                    System.out.println("Ingrese el nombre del estudiante: ");
                    nombre = leer.next();
                    System.out.println("El estudiante " + nombre + " se matriculo con exito");
                }
                System.out.println("Deseas continuar S/N: ");
                rpta2=leer.next().charAt(0);
                }
                
            } else if (opcion == 3) {
                //Validacion si deseas continuar registrando estudiantes:
                char rpta3='S';
                while(rpta3== 'S' || rpta3== 's'){
                    System.out.println("Nivel de secundaria: ");
                    System.out.println("---------------------");
                    System.out.println("Elige un grado a matricular [1, 2, 3, 4, 5]");
                    grado = leer.nextInt();
                    
                //Validacion de grado secundaria
                while(grado<1 || grado >5){                     //ES UN O (||)    
                    System.out.println("Error, vuelve a elegir el grado: ");
                    grado=leer.nextInt();
                }
                if (grado >= 1 & grado <= 5) {
                    System.out.println("Ingrese el nombre del estudiante: ");
                    nombre = leer.next();
                    System.out.println("El estudiante " + nombre + " se matriculo con exito");
                } 
                System.out.println("Deseas continuar S/N: ");
                rpta3=leer.next().charAt(0);
                    
                }
                
                /*
                Se puede borrar
                hay que usar while
                y completar lo que falta(la opcion 2 y 3)
                */
            } 

        }

        
    }
}



//Aplicar while
