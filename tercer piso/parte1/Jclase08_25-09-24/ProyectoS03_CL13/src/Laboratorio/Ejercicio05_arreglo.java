package Laboratorio;

import java.util.Scanner;


public class Ejercicio05_arreglo {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner leer=new Scanner(System.in);
        int codigo;
        String nombre;
        int nivel;
        
        //Declarcin de arreglos
        int codigos[]={100, 200, 300, 400, 500};
        String nombres[]={"villegas", "tejada", "briceño", "molleda", "pizarro"};
        int niveles[]={1, 2, 3, 2, 1};
        
        //Reporte de estudiantes
        System.out.println(" codigo   nivel   nombre ");
        System.out.println("--------------------------");
        for(int e=0; e<codigos.length;e++){
            System.out.println((e+1)+":" + codigos[e] + "|" + niveles[e] + "|" + nombres[e]);
        }
        
        //Consulta por el codigo del estudiante 
        System.out.print("Ingresa el codigo a consultar: ");
        codigo=leer.nextInt();
        //Busca el codigo ingresado en el arreglo codigo
        for(int c=0;c<codigos.length;c++){
            if(codigo == codigos[c]){
                System.out.println(("-" + codigos[c] + " | " + niveles[c] + " | " + nombres[c]));
                
            }
        }
        
        //Consulta por el nivel del estudiante 
        System.out.print("Ingresa el nivel a consultar: ");
        nivel=leer.nextInt();
        //Busca el codigo ingresado en el arreglo codigo
        for(int n=0;n<niveles.length;n++){
            if(nivel == niveles[n]){
                System.out.println((" - " + codigos[n] + " | " + niveles[n] + " | " + nombres[n]));
                
            }
        }
        
        //Consulta por el nuevo nombre del estudiante 
        System.out.print("Ingresa el nuevo nombre: ");
        codigo=leer.nextInt();
        //Busca el codigo ingresado en el arreglo codigo
        for(int c=0;c<codigos.length;c++){
            if(codigo == codigos[c]){
                System.out.print("Ingrese el nuevo nombre: ");
                nombre =leer.next();
                nombres[c]=nombre;
            }
        }
        
        //Reporte de estudiantes
        System.out.println(" codigo   nivel   nombre ");
        System.out.println("--------------------------");
        for(int e=0; e<codigos.length;e++){
            System.out.println((e+1)+":" + codigos[e] + "|" + niveles[e] + "|" + nombres[e]);
        }
        
        //Eliminar un estudiante por el codigo
        System.out.println("Ingresar el codigo del estudiante a eliminar: ");
        codigo=leer.nextInt();
        //Buscar el codigo ingresado en el arreglo codigos
        for(int c=0;c<codigos.length;c++){
            if(codigo==codigos[c]){
                codigos[c]=0;
                nombres[c]=null;
                
            }
        }
        //Reporte del estudiante
        System.out.println("Codigo  Nivel  Nombre");
        System.out.println("");
        for(int e=0;e<codigos.length;e++){
            System.out.println((e+1)+":" + codigos[e] + "|" + niveles[e] + "|" + nombres[e]);
        }
    }
    
}
