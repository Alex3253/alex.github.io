package Arreglos_objetos.Models;

public class Producto {
    //Atributos
    private int codprod;
    private String desprod;
    private double preprod;
    
    //Constructor 
    public Producto(int codprod, String desprod, double preprod){
        this.codprod=codprod;
        this.desprod=desprod;
        this.preprod=preprod;
       
    }

    //Metodos especiales
    public int getCodprod() {
        return codprod;
    }

    public void setCodprod(int codprod) {
        this.codprod = codprod;
    }

    public String getDesprod() {
        return desprod;
    }

    public void setDesprod(String desprod) {
        this.desprod = desprod;
    }

    public double getPreprod() {
        return preprod;
    }

    public void setPreprod(double preprod) {
        this.preprod = preprod;
    }
    
    //Metodo java imprimir

    @Override
    public String toString() {
        return "Producto{" + "codprod=" + codprod + ", desprod=" + desprod + ", preprod=" + preprod + '}';
    }
    
    
}
