package POO_Clase_SobreCargarConstructores;

public class Cliente {
    //Atributos
    int codcli;
    String nomcli;
    String despro;
    int canpro;
    double prepro;
    
    //Constructor cn paramentros
    Cliente(){
        
    }
    
    //Constructor cn 2 paramentros
    Cliente(int codcli, String nomcli){
        this.codcli=codcli;
        this.nomcli=nomcli;   
    }
    
    //Constructor con todos los paramentros
    Cliente(int codcli, String nomcli, String despro, int canpro, double prepro){
        this.codcli=codcli;
        this.nomcli=nomcli;
        this.despro=despro;
        this.canpro=canpro;
        this.prepro=prepro;
        
    }
    //Metodos
    void mostrarDatosCiente(){
        System.out.println("Detalle del cliente " + codcli);
        System.out.println("-----------------------------");
        System.out.println(codcli + "|" + nomcli);
        
    }
    
    void mostrarDetalleProducto(){
        System.out.println("Detalle del producto " + despro);
        System.out.println("-----------------------------");
        System.out.println(despro + "|" + canpro + "|" + prepro + "|" + canpro*prepro);
        
    }
    
    
}
