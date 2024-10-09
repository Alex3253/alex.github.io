package POO_laboratorio;
public class Alumno1 {
    //Atributos o propiedades
        int codalu;
        String nomalu, curalu;
        double exapar, exafin;
        
        //Constructor vAacio(se crea de manera automatica)
        /*
        Alumno(){
        }
        */
        
        //Metodos
        double obtenerPromedio(){
            double promedio=(exapar + exafin)/2;
            return promedio;
        
        }
        //Metodo general sin retorno
        void mostrarDatos(){
            System.out.println("codigo: " + codalu + "|" + "    Nombre: " + nomalu + "\n" + 
                    "curso: " + curalu + "|" + "Examen parcial: " + exapar + "|" + "Examen parcial: " + exafin + "\n" +
                    "Promedio final: " + obtenerPromedio());
            System.out.println("");
            System.out.println("");
        }
    
}
