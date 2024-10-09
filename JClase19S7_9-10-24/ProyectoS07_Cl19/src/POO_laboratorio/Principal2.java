package POO_laboratorio;
/*
/*Diseñe la clase Productos en el paquete POO_laboratorio cn los atributos publicos: codigo(int),
nombre(string), precio(double) y cantidad (int)

implementar ademas:
-un constructor con parametros
-un metodo que retorne el importe de compras (impcom)
-un metodo que retorne el importe de descuentosegun la tabla 

Importe de compras                Descuento
hasta 500                     10% del importe
mas 500                       20% del importe


-Un metodo que retorne el importe a pagar (impcom - impdes)
-Un metodo que sin retorno que muestre sus datos

*/
public class Principal2 {
    public static void main(String[] args) {
        //Declaracion de y creacion de un objeto con parametros
        Producto producto1= new Producto(100, "Lavadora", 10, 1500);
        Producto producto2= new Producto(200, "tv", 5, 3100);
        
        //Mostrar datos
        producto1.mostrarDatos();
        producto2.mostrarDatos();
    }
    
}
