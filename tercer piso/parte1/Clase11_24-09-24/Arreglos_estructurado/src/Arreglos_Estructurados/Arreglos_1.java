package Arreglos_Estructurados;

import java.util.Scanner;

public class Arreglos_1 {
    public static void main(String[] args) {
        //Declaracion de variables     //LOs arreglos son coleecciones de elelemntos
        Scanner leer=new Scanner(System.in);
        int numero;
        double precio;
        //Declaracion e inicializacion de arreglo por elementos
        int numeros[]={ 2,5,9,1,4 };
        double [] notas={ 10.5, 12.8,15.4 ,16.8 ,18.4, 8.5, 10.4 };
        
        //Declaracion de arreglos con un tamaño especifico
        double [] precios;
        precios=new double[4];
        String []frutas=new String[3];
        String nombres[]=new String[6];
        
        //Asignar valores o elementos al arreglo "nombres" de manera estatica
        nombres[0]="castañeda";
        nombres[1]="tejada";
        nombres[2]="moñeda";
        nombres[3]="bardales";
        nombres[4]="benites";
        nombres[5]="villega";
        
        //obtener el tamaño de un areglo
        System.out.println("Tamaño de arreglo numeros : " + numeros.length);
        System.out.println("Tamaño de arreglo notas : " + notas.length);
        System.out.println("Tamalo de arreglo nombres : " + nombres.length);
        System.out.println("Tamalo de arreglo precios : " + precios.length);
        
        //Asignar valores o elementos al arreglo "precios" de manera dinamica
        //Utilizando el bucle "for", para recorrer las posiciones
        for(int p=0;p<precios.length;p++){                                 //for(int p;p++) es un contador el p=0 es una variable se inixialisacion
            System.out.print("Ingresa el precio de producto: ");
            precio=leer.nextDouble();
            precios[p]=precio;
        }
        
        for(int f=0;f<frutas.length;f++){                                 
            System.out.print("Ingresa el nombre de producto: ");
            frutas[f]=leer.next();  
        }  
        
        //Mostrar los valores o elementos de un arreglo de manera estatica
        System.out.println("Precio de la posicion 0 : " + precios [0]);
        System.out.println("Fruta de la posicion 1: " + frutas[1]);
        
        //Mostrar los valores o elementos de manera dinamica
        //Recorrer un arreglo utilizando el bucle "for"
        for(int x=0; x<frutas.length;x++){
            System.out.println("Fruta: " + frutas[x]);
        }
        
        for(int p=0; p<precios.length;p++){
            System.out.println("Precios "+ p + ":" + precios[p]);
        }
    } 
}
