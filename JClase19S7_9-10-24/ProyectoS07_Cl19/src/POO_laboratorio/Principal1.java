package POO_laboratorio;

public class Principal1 {
    public static void main(String[] args) {
        //Instanciar un objeto de la clase alumno
        Alumno1 a1=new Alumno1();
        Alumno1 a2=new Alumno1();
        
        //Accesar al objeto alumno para asignar aores fijos
        a1.codalu=1000;
        a1.nomalu="Clotilde Magallanes";
        a1.curalu="POO";
        a1.exapar=15.6;
        a1.exafin=18.2;
        
        a2.codalu=2000;
        a2.nomalu="Clotilde Magallanes";
        a2.curalu="POO";
        a2.exapar=12.6;
        a2.exafin=15.2;
        
        
        
        //Mostrar datos 
        a1.mostrarDatos();
        a2.mostrarDatos();
    }
}
