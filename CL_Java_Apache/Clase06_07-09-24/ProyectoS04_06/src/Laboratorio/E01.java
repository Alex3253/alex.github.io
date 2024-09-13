package Laboratorio;

/*
El sueldo bruto de los empleados se una empresa se calcula sumando el sueldo basico
mas la bonificacion poer hijos

El sueldo basico se calcula multiplicando las horas trabajadas por la tarifa horaria. 
La tarifa horaria depende de la categoria del empleado de acuerdo co la siguiente tabla:

--categoria              tarifda horaria----
     A                         45.0
     B                         37.5
la bonificacin por hijos se calcula de acuerdo con la siguiente tabla

---numero de hijos          bonificacion-------
   hasta 3                     s/.40.5 por cada hijo
   mas de 3                    s/.35.0 por cada hijo

por ley del empleado esta sujeto a un porcentaje de descuento sobre el sueldo bruto
deacuedo con las igueiente tabla:

---sueldo bruto           decuento----
  >=3500                      13.5%
  <3500                       10.0%

dadas la categora y la cantidad de las horas trabajadas de un empleado, diseñe un algoritmo 
quedetermine el suldo basico, el sueldo bruto, el descuento y el sueldo neto que corresponda


*/

import java.util.Scanner;
public class E01 {
    public static void main(String[] args) {
        // Declaración de variables
        Scanner leer = new Scanner(System.in);
        double sBruto, sBasico, descuento, sNeto, bonificacionPorHijos, tHoraria = 0;
        int hTrab, numeroHijos;
        char categoria;

        // Entrada de datos
        System.out.print("Ingrese las horas trabajadas: ");
        hTrab = leer.nextInt();

        System.out.print("Ingrese su categoria : ");
        categoria = leer.next().charAt(0);

        System.out.print("Ingrese la cantidad de hijos: ");
        numeroHijos = leer.nextInt();

        // Proceso de datos
        if (categoria == 'A') {
            tHoraria = 45.0;
        } else if (categoria == 'B') {
            tHoraria = 37.5;
        } else {
            System.out.println("Categoría no válida.");
            leer.close();
            return; 
        }

        // 
        sBasico = hTrab * tHoraria;

        
        if (numeroHijos <= 3) {
            bonificacionPorHijos = numeroHijos * 40.5;
        } else {
            bonificacionPorHijos = numeroHijos * 35.0;
        }

        // 
        sBruto = sBasico + bonificacionPorHijos;

        // 
        double porcentajeDescuento;
        if (sBruto >= 3500) {
            porcentajeDescuento = 0.135;
        } else {
            porcentajeDescuento = 0.10;
        }
        descuento = sBruto * porcentajeDescuento;

        // 
        sNeto = sBruto - descuento;

        // Salida de datos
        System.out.println("Sueldo Basico: S/" + sBasico);
        System.out.println("Sueldo Bruto: S/" + sBruto);
        System.out.println("Descuento: S/" + descuento);
        System.out.println("Sueldo Neto: S/" + sNeto);
       

    }
}
