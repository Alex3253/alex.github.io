package Leccion_Metodos_II;

import java.util.Scanner;

/*
Desarrolla una aplicacion que permita registrar el nombre del cliente, el precio
del producto y la cantidad a comprar cuando inicia la aplicacion.
Utilizar un metodo que permita calcular el total a pagar.
*/

public class MetodoCRCP {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String nomcli;
        int canpro;
        double prepro, imppag;
        
        //Entrada de datos
        System.out.println("Ingrese el nombre del cliente: ");
        nomcli=leer.next();
        System.out.println("Ingrese el precio del producto: ");
        prepro=leer.nextDouble();
        System.out.println("Ingrese la cantidad a pagar: ");
        canpro=leer.nextInt();
        
        //Salida de datos
        /*opcion1
        imppag=CalcularImpPago(prepro, canpro);  //pasando datos
        System.out.println("Importe a pagar: " + imppag);
        */
        System.out.println("Importe a pagar: " + CalcularImpPago(prepro,canpro));   //Opcion2
    }
    
    //Metodo con retor y con paramentros: calcular importe de pago
    public static double CalcularImpPago(double prepro, int canpro){    //recibiendo datos
        /*
        double totpag;
        totpag= prepro *canpro;
        return totpag;
        opcion1
        */   
        
        return prepro * canpro;  //opcion2
    }
   
}
