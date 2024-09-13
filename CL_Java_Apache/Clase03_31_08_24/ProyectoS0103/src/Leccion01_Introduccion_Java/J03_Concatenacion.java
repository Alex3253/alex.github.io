package Leccion01_Introduccion_Java;

public class J03_Concatenacion {
    public static void main(String[] args) {
       //Declaracion y inicializando las variables
       String nomProducto = "Lavadora";
       int canProducto = 10;
       double preProducto =  3250.60;
       
       //Salida de datos(y concatenacion)
        System.out.println("Reporte de la compra");
        System.out.println("--------------------");
        System.out.println("Nombre del producto: " + nomProducto);
        System.out.println("Cantidad : " + canProducto);
        System.out.println("Precio del producto : " + preProducto);
    }
    
    
}
