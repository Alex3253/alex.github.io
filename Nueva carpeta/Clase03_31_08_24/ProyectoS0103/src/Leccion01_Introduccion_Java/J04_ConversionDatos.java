package Leccion01_Introduccion_Java;

public class J04_ConversionDatos {
    public static void main(String[] args) {
        //Declaracion de variables
        String edad = "25";
        String estatura= "1.90";
        
        //Conversion de cadena de texto a entero
        int conversionEdad = Integer.parseInt(edad);
        
        //Conversion de cadena de texto a decimal
        double conversionEstatura = Double.parseDouble(estatura);
        
    }
    
}
