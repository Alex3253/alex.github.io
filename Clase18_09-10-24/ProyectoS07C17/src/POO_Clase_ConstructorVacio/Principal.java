package POO_Clase_ConstructorVacio;

public class Principal {
    public static void main(String[] args) {
        //Declaracion y cracion de un objeto de tipo Empleado //habla de un construcro
        Empleado e1= new Empleado();
        
        //Accesar a sus atributos
        e1.codemp=1000;
        e1.nomemp="Carlos Mendoza";
        e1.sueemp=3600.30;
        
        //Mostrar sus datos
        e1.mostrarDetalle();
        
    }
    
}
