package Leccion_Metodos_II;

/*
Realizar un algoritmo que pida numeros(se pedira por teclado la cantidad de 
numeros a introducir).El programa debe informar de cuantos numeros introducidos
son mayores que 0, menores que0 e iguales a 0.
*/

import java.util.Scanner;
public class Pregunta2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int mayor = 0, menor = 0, igual = 0;

        System.out.print("Ingrese la cantidad de numeros a introducir: ");
        int cantidad = leer.nextInt();

        for (int contador = 0; contador < cantidad; contador++) {
            System.out.print("Ingrese el numero " + (contador + 1) + ": ");
            int numero = leer.nextInt();

            if (numero > 0) {
                mayor++;
            } else if (numero < 0) {
                menor++;
            } else { 
                igual++;
            }
        }
        System.out.println("Cantidad de numeros mayores a cero: " + mayor);
        System.out.println("Cantidad de numeros menores a cero: " + menor);
        System.out.println("Cantidad de numeros iguales a cero: " + igual);
    }
}