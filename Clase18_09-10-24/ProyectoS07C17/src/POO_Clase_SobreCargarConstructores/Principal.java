package POO_Clase_SobreCargarConstructores;

public class Principal {
    public static void main(String[] args) {
        //Declaracion y creacion de objetos  de tipo cliente
        Cliente cliente1=new Cliente();
        Cliente cliente2=new Cliente(2000, "Orando castañeda");
        Cliente cliente3=new Cliente(3000, "Jordi Socrates", "Lavadora", 20, 1200.30);
        
        //Asignando valores al cliente 1
        cliente1.codcli=1000;
        cliente1.nomcli="Sara Conors";
        cliente1.despro="Televisor";
        cliente1.canpro=5;
        cliente1.prepro=2600;
        
        //Asignando valores al cliente 2
        cliente2.despro="Aspiradora";
        cliente2.canpro=3;
        cliente2.prepro=1250;
        
        //Mostrar informacion de lcliente 1
        cliente1.mostrarDatosCiente();
        cliente1.mostrarDetalleProducto();
        cliente2.mostrarDatosCiente();
        cliente2.mostrarDetalleProducto();
        cliente3.mostrarDatosCiente();
        cliente3.mostrarDetalleProducto();
        
        
    }
    
}
