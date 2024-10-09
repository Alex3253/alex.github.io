package POO_Encapsulacion_AccesoPrivado;

public class Principal {
    public static void main(String[] args) {
        //Declaracion  y creacion de un objeto
        Cliente c1=new Cliente();
        
        //Accear a asu atributos para modificar o agregr
        c1.setCodcli(100);
        c1.setNomcli("Castaeda fierro");
        c1.setTipcli(1);
        
        //Accesar a sus atributos para leer o mostrar su  valores
        System.out.println("Codigo del cliente: " + c1.getCodcli());
        System.out.println("Nombre del cliente: " + c1.getNomcli());
        System.out.println("Tipo de cliente: " + c1.getTipcli());
    }
}
