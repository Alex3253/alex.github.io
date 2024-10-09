package POO_laboratorio;

public class Producto {
    //Atributos
    int codprod, canprod;
    String nomprod;
    double preprod;
    
    //Constructor con parametros
    Producto(int codprod, String nomprod, int canprod, double preprod){
        this.codprod=codprod;
        this.nomprod=nomprod;
        this.canprod=canprod;
        this.preprod=preprod;  
    }
    
    //Metodos con retorno: importe de compra
    double obtenerImpCom(){
        return canprod * preprod;
    }
    
    //Metodos con retorno: importe de descuento
    double obtenerImpDes(){
        double impdes;
        if(obtenerImpCom() <= 500){
            impdes= obtenerImpCom() * 0.10;
        }else{
            impdes= obtenerImpCom() * 0.20;
        }
        return impdes; 
    }
    
    //Metodos con retorno: importe de pago
    double obtenerImpPag(){
        return obtenerImpCom() - obtenerImpDes();
    }
    
    
    //Metodo sin retorno : Mostrar datos compltos
    void mostrarDatos(){
        System.out.println("Codigo del Producto: " + codprod + "Nombre del producto: " + nomprod + "\n" + 
                "Precio del producto: " + preprod + "Cantidad a comprar: " + canprod + "\n" + 
                "Importe de compra: " + obtenerImpCom() + "Importe de Descuento: " + obtenerImpDes() + "Importe de pago: " + obtenerImpPag());
        System.out.println("");
        System.out.println("");
    }
    
    
    
}
