package Laboratorio;

/*
Los calculos salariales de los empleados de una empresa se efectua de la siguiente manera:
 Sueldo bruto= horas trabajadas * tarifa horaria
 dESCUENTO= 15% del sueldo bruto
 Sueldo neto= sueldo bruto - descuento

*/


import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner leer = new Scanner(System.in);
        String categoria;
        double sBruto=0, descuento, sNeto, tHora;
        int hTrabajadas;
        
        //Entrada de datos
        System.out.print("Ingrese las horas trabajadas: ");
        hTrabajadas= leer.nextInt();
        
        System.out.print("Ingrese la categoria del trabajador: ");
        categoria= leer.next();
        
        //Proceso de datos: obtener ell sueldo bruto segun la categoria
        if("c1".equals(categoria)){
            sBruto= hTrabajadas * 45.0;
        }
        
        if("c2".equals(categoria)){
            sBruto= hTrabajadas * 37.5;
        }
        
        //Proceso de datos: obteneer descuento
        descuento= sBruto * 0.15;
        
        
        //Proceso de datos: obteneer el sueldo neto
        sNeto= sBruto - descuento;
        
        //Salida de datos
        System.out.println("Suelo bruto: " + sBruto + "Descuento: " + descuento + " Sueldo neto " + sNeto);
  
    }
    
}
