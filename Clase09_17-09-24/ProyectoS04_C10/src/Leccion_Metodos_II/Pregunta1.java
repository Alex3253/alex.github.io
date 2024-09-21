package Leccion_Metodos_II;
/*
Una persona adquirio un producto para pagar en 20 meses.El primer 
mes pago 10 euros, el segundo 20 euros, el tercero 40 euros y asi
sucesivamente.
Realizar un programa para determinar cuanto debe pagar mensualmente y el total
de lo que pagara despues de los 20 meses.
Este programa puede servr para calcular otras compras y con diferentes plazos
*/

import java.util.Scanner;
public class Pregunta1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        

        System.out.print("Ingrese el monto del primer pago: ");
        int primerPago = leer.nextInt();

        System.out.print("Ingrese el numero de meses de pago: ");
        int numeroMeses = leer.nextInt();

        if (primerPago <= 0 || numeroMeses <= 0) {
            System.out.println("El monto del primer pago y el numero de meses deben ser positivos.");
            return;
        }
        
        int totalPagar = 0;
        int mes = 1;
        int pagoMensual = primerPago; 

        while (mes <= numeroMeses) {
            System.out.println("Pago del mes " + mes + ": " + pagoMensual);
            totalPagar += pagoMensual;
            pagoMensual *= 2;
            mes++;
        }
        System.out.println("Total a pagar despues de " + numeroMeses + " meses: " + totalPagar);

    }
}