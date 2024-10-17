package Leccion01_Introduccion_Java;

public class J01_Variables {
    public static void main(String[] args) {
        //Declaracion de variales primitivas(int) y de objetos(String)
        String nombres; //tipo cadena de texto(String)
        int edad; //tipo entero(integer)
        double estatura; //tipo real(double)
        char simbolo; //tipo caracter(character)(una sola letra(caracter))
        boolean estado; //tipo logico(boolean)
        
        //Declaracion de constantes (SIEMPRE SON EN MAYUSCULA)
        final double IGV;
        final int DESCUENTO;
        
        //Declaracin E inicializacion de una variable
        int cantidad = 140;
        String profesion = "Ingeniero de software";
        
        //Asignacion de valores a las variables y constantes
        nombres = "Carlo Antonio";
        edad = 25;
        estatura = 1.92;
        simbolo = 'A'; //solo funciona con comilla simple ''
        estado = true; //(true, false)
        IGV = 0.18;
        
        //Formas de declaracion de variables
        String categoria;
        int precioProducto;
        double canCaramelo;
        boolean impcom;
        double dscto20;
        char _model;
    }
    
}
