package POO_Clase_Metodos;

public class Prncipal {
    public static void main(String[] args) {
        //Declaracion y creacion de objetos de tipo producto
        Productos producto1= new Productos();
        Productos producto2= new Productos();
        
        //Acceder a los atributos del objeto[producto1] para asignarle valores
        producto1.codpro=1000;
        producto1.mompro="Lavadora";
        producto1.prepro=3600.30;
        
        //Acceder a los atributos del objeto[producto1] para asignarle valores
        producto2.codpro=2000;
        producto2.mompro="Aspiradora";
        producto2.prepro=2140.55;
        
        
        //Mostrar su informacion de cada producto
        producto1.mostrarDatos();
        producto2.mostrarDatos();
        
    }
    
}
