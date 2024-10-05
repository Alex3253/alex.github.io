
package Estructura_Seleecion3;

import java.util.Scanner;

/**
 *
 * @author Lab01-Norte
 */
/*
Pagina 165 - Ejercicio #1
un centro comercial ha decidido hacer un obsequio a los clientes cuyo importe total
pagado es mayor de s/500.Para obtener un obsequio, el cliente debe extraer un bolo
de una urna que contiene 50 bolos numerados de 1 al 50. con el numero de bolo, el
obsequio se obtiene de la siguiente tabla:

numero de bolo obsequio
1_Una agenda
2_reloj
3_Memoria
4_Perfume
5_Radio
6_Pelota
*/
public class Seleccion_Multiple_switch {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner leer = new Scanner(System.in);
        double imppago;
        int numbolo;
        String obsequio = "";
        //Entrada de datos
        System.out.print("Ingrese el importe a apagar : ");
        imppago = leer.nextDouble();
        
        //proceso de datos
        if(imppago > 500){
            System.out.println("Escoge tu Obsequio");
            System.out.print("Ingresa el numero de bolo : ");
            numbolo = leer.nextInt();
            switch(numbolo){
                case 10:
                    obsequio = "Una agenda";
                    break;
                case 20:
                    obsequio = "Un reloj Rolex";
                    break;
                case 30:
                    obsequio = "Una memoria de USB";
                    break;
                case 40:
                    obsequio = "Un perfume";
                    break;
                case 50:
                    obsequio = "Una radio";
                    break;
                default:
                    obsequio = "Una pelota";
                    break;
            }
        }else{
            obsequio = "No tiene obsequio";
        }
        //Salida de datos
        System.out.println("Observacion : " +obsequio);
    }
}
