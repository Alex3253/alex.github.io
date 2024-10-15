package Poo_Clase_Atributos;
//ES EL OBJTO CON VIDA
public class Principal {
    public static void main(String[] args) {
        //Declaracon de una variables objeto (p1)de tipo de la clase (Persona)
        Persona p1;
        //Creacion de un objeto o instancia de la clase persona
        p1= new Persona();
        
        //Declaracion y creacion de un objeto de la clase persona
        Persona p2= new Persona();
        
        //Acceder a la los atributos de la estructira del objeto p1, para asignar valores
        
        p1.nombre="Julio Tejada";
        p1.edad=20;
        p1.estatura= 1.85;
        
        //Acceder a la los atributos de la estructira del objeto p, para asignar valores
        p2.nombre="Anabella Perez";
        p2.edad=15;
        p2.estatura= 1.66;
        
        //Mostrar los datos de la persona p1
        System.out.println("Detalle de la persona p1 ");
        System.out.println("---------------------------");
        System.out.println("Nombre de la persona p1 : " + p1.nombre);
        System.out.println("Edad de la persona: " + p1.edad);
        System.out.println("Estatura de la persona: " + p1.estatura);
        System.out.println("");
        
        //Mostrar los datos de la persona p2
        System.out.println("Detalle de la persona p2 ");
        System.out.println("---------------------------");
        System.out.println("Nombre de la persona : " + p2.nombre);
        System.out.println("Edad de la persona: " + p2.edad);
        System.out.println("Estatura de la persona: " + p2.estatura);
        System.out.println("");
    }
    
}
