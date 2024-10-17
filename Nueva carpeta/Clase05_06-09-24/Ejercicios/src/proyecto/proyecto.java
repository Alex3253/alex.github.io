package proyecto;

/*
Desarrollar un programa que me permita solicitar el nombre y categoria de un
empleado. Segun su categoria  se debe asignar un sueldo basico, segun las siguiente
tabla:

-------categoria---------sueldo basico-----
       A                 2500
       B                 3200
       C                 4150

finalmente debe imprimir el nombre, categoria y sueldo basico
*/

import java.util.Scanner;

public class proyecto {
    public static void main(String[] args) {
        //Declacion de variables
        Scanner leer= new Scanner(System.in);
        String nombre;
        double sueldo= 0;
        char catemp;
        
        
        //Entrada de datos
        System.out.print("Ingese el nombre del empleado: ");
        nombre= leer.next();
        
        System.out.print("Ingrese  su Categoria: ");
        catemp= leer.next().charAt(0);
        
        
        
        
        
        //Proceso de datos
        if(catemp == 'A'){
            sueldo= 2500;
        }else if(catemp == 'B'){
            sueldo= 3200; 
        }else if(catemp == 'C'){
            sueldo= 4150;
        }
        
        
        //Salida de datos
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoria: " + catemp);
        System.out.println("Sueldo basico: " + sueldo);
    }
    
}
