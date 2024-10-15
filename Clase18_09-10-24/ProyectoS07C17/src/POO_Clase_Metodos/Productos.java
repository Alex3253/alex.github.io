package POO_Clase_Metodos;

public class Productos {
    //Atributos o propiedades
    int codpro;
    String mompro;
    double prepro;
    
    //Constructores
    
    //Metodos generales
    void mostrarDatos(){
        System.out.println("Detalle del producto");
        System.out.println("-------------------------");
        System.out.println("Codigo del producto: " + codpro);
        System.out.println("Nombre del producto: " + mompro);
        System.out.println("Precio del producto: " + prepro);
        System.out.println("");
    }
    
    
}
