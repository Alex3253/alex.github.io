package Laboratorio;

import java.util.Scanner;

/*
Desarrollar una app que permita registrar 
el nombre, precio y cantidad de 5 productos
para luego mostrar el producto de menor precio
e indicar(nombre, precio y cantidad)
*/

public class Ejercicio04_Arrego {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner leer=new Scanner(System.in);
        
        //Declaracion de arreglos
        String nombres[]=new String[3];
        double precios[]=new double[3];
        int cantidades[]=new int[3];
        int indicePrecioMenor=0;
        
        //Entrada de datos
        for(int i=0;i<nombres.length;i++){
            System.out.print("Ingrese el producto: ");
            nombres[i]=leer.next();
            
            System.out.print("Ingrese el precio: ");
            precios[i]=leer.nextDouble();
            
            System.out.print("Ingrese la cantidad: ");
            cantidades[i]=leer.nextInt();
        }
        //Proceso de datos
        double precioMenor = precios[0];
        for(int x=1;x<precios.length;x++){     
            //Comparando precios
            if(precioMenor > precios[x]){
                //Actualizando la variable pecio menor
                precioMenor=precios[x];
                //Obteniendo el indice del precio menor
                indicePrecioMenor=x;
            }
        }
        //Salida de datos
        System.out.println("");
        System.out.println("Detale del producto de menor precio " );
        System.out.println("-------------------------------------");
        System.out.println("Nombre del producto: " + nombres[indicePrecioMenor]);
        System.out.println("Precio del producto: " + precios[indicePrecioMenor]);
        System.out.println("Cantidad del producto: " + cantidades[indicePrecioMenor]);
        
    }
    
}
