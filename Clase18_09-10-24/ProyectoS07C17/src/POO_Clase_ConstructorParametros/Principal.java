package POO_Clase_ConstructorParametros;

public class Principal {
    public static void main(String[] args) {
        //Declaracion y craecion de un objeto
        Docente docente=new Docente(100, "Carlos Villegas", 3500, "poo");
        Docente docente2=new Docente(100, "Carlos Villegas", 3500, "poo");
        
        //Mostrar  el detalle del docente
        docente.mostrarDocente();
    }
    
}
