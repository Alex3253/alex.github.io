package Leccion_Metodos_II;

/*
Desarrollar una aplicacion que permita registrar la compra de un producto para
ello debe solicitar el precio y cantidad .
Al iniciar la aplicacion debe solcitar el nombre del cliente.
*/
import java.util.Scanner;
public class CRSP {
    //Variables globales
    static Scanner leer= new Scanner(System.in);
    
    //Metodo principal de la clase
    public static void main(String[] args) {
        //Declaracion de variables
        //Variable locales
        double imppag;
        String nomcli;
        System.out.print("Ingrese el nombre del cliente: ");
        nomcli=leer.next();
        System.out.println("Hola " + nomcli+ " Bienbenido al Supermercado");
        
        imppag=realizarCompras();
        System.out.println("Total a pagar " + imppag);   
    }
    //Metodo con retorno/ sin paramentros: realizar compras
    public static double realizarCompras(){
        //Variables locales
        int canpro;
        double prepro, totcom;
        
        //Entradda de datos
        System.out.print("Ingresa el preco del producto: ");
        prepro=leer.nextDouble();
        
        System.out.print("Ingresa la cantidad a comprar: ");
        canpro = leer.nextInt();
        
        //Proceso de datos
        totcom= prepro* prepro;
        return totcom;
    }
}
