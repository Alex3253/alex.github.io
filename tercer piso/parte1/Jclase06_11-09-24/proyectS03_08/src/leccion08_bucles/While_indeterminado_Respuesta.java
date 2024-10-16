package leccion08_bucles;

/*
Desarrollar una aplicacon que permita registrar el nombre, el precio
y cantidad de productos a comprar, hasta que decidas continuar
registando mas compras, caso contrario deberas imprimir el nombre del
cliente y el total a pagar, al iniciar el sitema de compras,
debe solicitaer el nombre del ciente.
*/
import java.util.Scanner;
public class While_indeterminado_Respuesta {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner leer= new Scanner(System.in);
        String nombre, nomProducto;
        char rpta;
        int numCompras, canProducto;
        double preProducto, total, sumTotal;
       
        
        //Entrada de datos
        rpta='s';
        sumTotal= 0;
        numCompras=0;
        System.out.println("Ingrese el nomnre del cliente: ");
        nombre= leer.next();
        while(rpta == 'S' || rpta == 's'){
            System.out.println("Ingresa el nombre del producto: ");
            nombre=leer.next();
            System.out.println("Ingrese el precio de producto: ");
            preProducto=leer.nextDouble();
            System.out.println("Ingrese la cantidad de compra: ");
            canProducto=leer.nextInt();
            
            //Proceso de datos
            numCompras++;
            total= preProducto * canProducto;
            sumTotal= sumTotal + total;
            System.out.println("Desea continuar S/N: ");
            rpta=leer.next().charAt(0);
        }

        //Salidad de datos
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Numero de compras: " + numCompras);
        System.out.println("Total a pagar: " + sumTotal);
    }

}
