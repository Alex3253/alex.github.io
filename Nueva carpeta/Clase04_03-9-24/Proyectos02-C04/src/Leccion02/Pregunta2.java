package Leccion02;

//Los calculos salariales de los vendedores de una empresa se efectuan de la siguiente manera

//sueldo basico mensual= s/300
//comision por venta=9% del importe total vendido en el mes
//sueldo bruto= sueldo basico mas comision
//descuento=11% del sueldo bruto
//sueldo neto= sueldo bruto menos descuento

//Dado el importe total vendido en el mes diseñe un agoritmo que imprima un reporte 
//indicando el sueldo basico, la comision, el sueldo bruto, el descuento y el sueldo neto


import java.util.Scanner;
public class Pregunta2 {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner leer= new Scanner(System.in);
        int sBasico, impTotal;
        double cVenta, sBruto, descuento, sNeto;
        
        //Entrada de datos
        System.out.println("Ingrese en importe total");
        impTotal= leer.nextInt();
        
        
        //Proceso de datos
        sBasico= 300;
        cVenta= 0.9;
        descuento= 0.11;
        comision= ventas_mensuales * comsion
        sBruto= sBasico + cVenta;
        
        sNeto= sBruto - descuento;
                
        //Salida de datos
        System.out.println("El sueldo basico: " + sBasico);
        System.out.println("La comision: " + cVenta);
        System.out.println("El sueldo bruto: " + sBruto);
        System.out.println("El descuento: " + descuento);
        System.out.println("El sueldo neto: " + sNeto);
        
    }
    
}
