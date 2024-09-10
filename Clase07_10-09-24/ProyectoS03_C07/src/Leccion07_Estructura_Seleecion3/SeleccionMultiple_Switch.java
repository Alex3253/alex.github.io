package Leccion07_Estructura_Seleecion3;

import java.util.Scanner;


public class SeleccionMultiple_Switch {
    public static void main(String[] args) {
        //Declaracon de variables
        Scanner leer= new Scanner(System.in);
        double imppago;
        int numbolo;
        String obsequio;
        
        //Entrada de datos
        System.out.print("Ingrese el importe a apagar: ");
        imppago= leer.nextDouble();
        
        //Proceso de datos
        if(imppago > 500){
            System.out.println("Escoge tu Obsequio");
            System.out.print("Ingrese el numero de bolo: ");
            numbolo=leer.nextInt();
            switch(numbolo){
                case 10:
                    obsequio= "Una Agenda";
                    break;
                case 20:
                    obsequio= "Un relog";
                    break;
                case 30:
                    obsequio= "Una memoria";
                    break;
                case 40:
                    obsequio= "Un perfume";
                    break;
                case 50:
                    obsequio= "Una radio";
                    break;
                default:
                    obsequio= "Una pelota";
                    break;
            }
        }else{
            obsequio= "No tiene obsequio";
        }  
        
        //Salida de datos
        System.out.println("Observacion: " + obsequio);
    }
    
}
