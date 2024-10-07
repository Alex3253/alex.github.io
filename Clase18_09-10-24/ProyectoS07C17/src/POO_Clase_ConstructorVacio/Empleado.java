
package POO_Clase_ConstructorVacio;

public class Empleado {
    //Atributos
    int codemp;
    String nomemp;
    double sueemp;
    
    //Constructor vacio
    Empleado(){
        
    }
    
    //Metodos
    void mostrarDetalle(){
        System.out.println("Detalle del empleado: " + codemp);
        System.out.println("---------------------");
        System.out.println(codemp + "|" + nomemp + "|" + sueemp);

    }
    
}
