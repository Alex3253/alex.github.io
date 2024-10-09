package POO_Encapsulacion_AccesoPublicoApp;

import POO_Encapsulacion_AccesoPublicoModels.Estudiante;

public class Principal {
    public static void main(String[] args) {
        //Declaracion y creacion de un objetos
        Estudiante e1=new Estudiante();
        
        //Accesar a los valores de lobjetos e1
        e1.codest=100;
        e1.nomest="miguel asturias";
        e1.edaest=25;
    }
    
}
