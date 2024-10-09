package POO_Propuesto;

public class Filmacion {
    // Atributos públicos
    public int codigo;
    public String titulo;
    public int duracion;  // Duración en minutos
    public double precio;  // Precio en soles

    // Constructor con parámetros
    public Filmacion(int codigo, String titulo, int duracion, double precio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracion = duracion;
        this.precio = precio;
    }

    // Método que retorna el precio del video en dólares
    public double obtenerPrecioEnDolares() {
        final double TASA_CAMBIO = 3.38; // 1 dólar = 3.38 soles
        return precio / TASA_CAMBIO; // Convertir precio a dólares
    }
    
    
}



    
