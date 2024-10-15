package POO_Clase_ConstructorParametros;

public class Docente {
    //Atributos
    int coddoc;
    String nomdoc;
    double sueldoc;
    String curdoc;
    
    //Constructor con parametros// el constructor tiene el minsmo mombre de la clase(Docente)
    Docente(int coddoc, String nomdoc, double sueldoc, String curdoc){
        this.coddoc=coddoc;
        this.nomdoc=nomdoc;
        this.sueldoc=sueldoc;
        this.curdoc=curdoc;
    }
    
    //Metodos 
    void mostrarDocente(){
        System.out.println("Detalle del docente");
        System.out.println("---------------------------------------------------");
        System.out.println(coddoc + "|" + nomdoc + "|" + sueldoc + "|" + curdoc);
    }
}
