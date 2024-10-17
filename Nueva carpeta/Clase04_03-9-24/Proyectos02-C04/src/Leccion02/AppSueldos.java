package Leccion02;


import java.util.Scanner;
public class AppSueldos {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner leer = new Scanner(System.in);
        int hTrabajadas,tHora;
        double sBasico, bonif, sBruto, dscto, sNeto; 
        
        //Entrada de datos
        System.out.print("Ingresa las horas tranbajadas: ");
        hTrabajadas = leer.nextInt();
        
        System.out.print("Ingresa la tarifa por hora: ");
        tHora= leer.nextInt();
        
        //Proceso de datos
        sBasico= hTrabajadas * tHora;
        bonif= sBasico * 0.20;
        sBruto= sBasico + bonif;
        dscto= sBruto * 0.10;
        sNeto= sBruto - dscto;
        
        //Salida de datos
        System.out.println("----------------------------");
        System.out.println("Sueldo Basico: " + sBasico);
        System.out.println("Bonificacion: " + bonif);
        System.out.println("Sueldo Bruto: " + sBruto);
        System.out.println("Descuento: " + dscto);
        System.out.println("Sueldo Neto: " + sNeto);
    } 
}
