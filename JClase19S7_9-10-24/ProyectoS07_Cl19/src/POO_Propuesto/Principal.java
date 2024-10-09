package POO_Propuesto;

public class Principal {
    public static void main(String[] args) {
        Trabajador trabajador= new Trabajador();
        
        //Accesar al objeto trabajador para asignar aores fijos
        trabajador.codigo=1000;
        trabajador.nombre="Alexander";
        trabajador.horTrab=12;
        trabajador.tarhor=160.5;
        
        //Mostrar datos 
        trabajador.mostrarDatos();
        
    }
    
}
