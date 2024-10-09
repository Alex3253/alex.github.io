package POO_Encapsulacion_AccesoPrivado;

public class Cliente {
    //Atributos con accesos privados dentro o fuera del paqute
    private int codcli;
    private String nomcli;
    private int tipcli;
    
    //Constructores
    
    //Metodos especiales: geter(leer) / setter(escribir)
    
    //Metodos genereales

    public int getCodcli() {
        return codcli;
    }

    public void setCodcli(int codcli) {
        this.codcli = codcli;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public int getTipcli() {
        return tipcli;
    }

    public void setTipcli(int tipcli) {
        this.tipcli = tipcli;
    }
    
    
}
