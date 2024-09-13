package Laboratorio;

/*
Un supermercado vende aceite en botellas de 1 litro a los precios por litro dados en
la siguiente tabla:

  ---Aceite                 precio por litro---
  primor                       s/5.99
  girasol                      s/5.50
  cil                          s/4.50
  cocinero                     s/4.70

como oferta, el supermecado ofrece un porcentaje de descuento sobre el importe
de la compra de acuerdo con la siguiente tabla

----cantidad de dlitro               descuento----
     <4                                  5.0%
     >=4 y 7                             7.5%
     >=7 y <10                           10.0%
     >=10                                12.5%

Diseñe un algoritmo que determine el importe de la compra, el import4 de descuento
y el importe a pagar por la compra de cierta cantidad de litros de una misma marcad de
aceite
*/

import java.util.Scanner;
public class E02 {
    public static void main(String[] args) {
       //Declaracion de variables
        Scanner leer = new Scanner(System.in);
        String  aceite;
        double PrecioLitro = 0, descuento = 0, importeCompra, importePago;
        int litros;
        
       //Entrada de datos
           System.out.println("Ingresar nombre de Aceite:");
           aceite = leer.next();
           System.out.println("Ingresar catidad de litros:");
           litros = leer.nextInt();
       //Proceso de datos
       if (aceite.equalsIgnoreCase("primor")) {
            PrecioLitro = 5.99;
        } else if (aceite.equalsIgnoreCase("girasol")) {
            PrecioLitro = 5.50;
        } else if (aceite.equalsIgnoreCase("cil")) {
            PrecioLitro = 4.50;
        } else if (aceite.equalsIgnoreCase("cocinero")) {
            PrecioLitro = 4.70;
        } else {
            System.out.println("Tipo de aceite no válido.");
            return;
        }
       
       importeCompra = PrecioLitro * litros;
       
        if (litros < 4) {
            descuento = 0.05;
        } else if (litros >= 4 && litros < 7) {
            descuento = 0.075;
        } else if (litros >= 7 && litros < 10) {
            descuento = 0.10;
        } else if (litros >= 10) {
            descuento = 0.125;
        }
        
        importePago = importeCompra * (1 - descuento);   
         // Salida de datos
        System.out.println("Importe de la compra: S/. " + importeCompra);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Importe a pagar: S/. " + importePago);
        
        
    }
    
}
