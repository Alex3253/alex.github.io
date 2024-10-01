package Laboratorio;

import java.util.Scanner;

public class Proyect_Arreglos {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner leer = new Scanner(System.in);
        int codigo;
        String nombre;
        int nivel;
        int opcion, grado;
        
        
        
        //bucles while
        
        opcion=0;
        while(opcion !=7){
            //Entradads de datos
            System.out.println("Sitema de matriculas: ");
            System.out.println("----------------");
            System.out.println("[1]Agregar");
            System.out.println("[2]Consultar");
            System.out.println("[3]Modificar");
            System.out.println("[4]Eliminar");
            System.out.println("[5]Reporte General");
            System.out.println("[6]Reporte x nivel");
            System.out.println("[7]Salir");
            System.out.println("Elige una opcion: ");
            opcion = leer.nextInt();
            
            //Validacion de las opciones del menu(error)
            while(opcion<1 || opcion >7){
                System.out.println("Error, vuelve a elegir una opcion: ");
                opcion=leer.nextInt();
            }
            
            if(opcion ==2){
                
                
            }
            
            
            
            
            
            
        }
        
        
        
        

        //Declaracion de arreglos
        int codigos[] = {100,200,300,400,500};
        String nombres[] = {"Villegas","Tejada","Briceño","Molleda","Pizarro"};
        int niveles[] = {1,2,3,2,1};
 
        //Reporte de estudiantes
        System.out.println("  Codigo  Nivel     Nombre");
        System.out.println("--------------------------");
        for(int e=0;e<codigos.length;e++){
            System.out.println((e+1) + " : " + codigos[e] + " |   " + niveles[e] + " |    " + nombres[e] );
        }
        
        //Consulta por el codigo del estudiante
        System.out.print("Ingresa el codigo a consultar :");
        codigo = leer.nextInt();
        //Busca el codigo ingresado en el arreglo codigos
        for(int c=0;c<codigos.length;c++){
            if(codigo == codigos[c]){
                System.out.println(" - " + codigos[c] + " |   " + niveles[c] + " |    " + nombres[c] );
            }
        }
        
        
        
        //Modificar por el codigo del estudiante
        System.out.print("Ingresa el codigo del estudiante a modificar :");
        codigo = leer.nextInt();
        //Busca el codigo ingresado en el arreglo codigos
        for(int c=0;c<codigos.length;c++){
            if(codigo == codigos[c]){
                System.out.print("Ingresa el nuevo nombre : ");
                nombre = leer.next();
                nombres[c]=nombre;
            }
        }
        
        //Reporte de estudiantes
        System.out.println("  Codigo  Nivel     Nombre");
        System.out.println("--------------------------");
        for(int e=0;e<codigos.length;e++){
            System.out.println((e+1) + " : " + codigos[e] + " |   " + niveles[e] + " |    " + nombres[e] );
        }
        
        //Eliminar un estudiante por el codigo
        System.out.print("Ingresa el codigo del estudiante a eliminar :");
        codigo = leer.nextInt();
        //Busca el codigo ingresado en el arreglo codigos
        for(int c=0;c<codigos.length;c++){
            if(codigo == codigos[c]){
                codigos[c] = 0;
                nombres[c]=null;
                niveles[c]=0;
            }
        }
        
        //Reporte de estudiantes
        System.out.println("  Codigo  Nivel     Nombre");
        System.out.println("--------------------------");
        for(int e=0;e<codigos.length;e++){
            if(codigos[e]!=0){
                System.out.println((e+1) + " : " + codigos[e] + " |   " + niveles[e] + " |    " + nombres[e] );
            }
            
        }
        
        //Eliminar un estudiante por el nivel
        System.out.print("Ingresa el nivel a eliminar :");
        nivel = leer.nextInt();
        //Busca el nivel ingresado en el arreglo codigos
        for(int c=0;c<niveles.length;c++){
            if(nivel == niveles[c]){
                codigos[c] = 0;
                nombres[c]=null;
                niveles[c]=0;
            }
        }
        
        //Reporte de estudiantes
        System.out.println("  Codigo  Nivel     Nombre");
        System.out.println("--------------------------");
        for(int e=0;e<codigos.length;e++){
            if(codigos[e]!=0){
                System.out.println((e+1) + " : " + codigos[e] + " |   " + niveles[e] + " |    " + nombres[e] );
            }
            
        }
    }
}
