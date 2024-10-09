package POO_Propuesto;
/*Diseñe la clase trabajador en el paquete POO_Propuesto cn los atributos publicos: codigo(int),
nombre(string), horas trabajadas(int) y tarifa horarias(double)

implementar ademas:
-un metodo que retorne el sueldo bruto (horas * tarifa)
-un metodo que retorne el descuento de acuerdo a la siguiente tabla

sueldo bruto               Descuento
<4500                      12% del sueldo bruto
>=4500 y <6500             14% swl sueldo bruto
>=6500                     16% el sueldo bruto

-Un metodo que retorne el sueldo neto(sueldo bruto - descuento)

*/

public class Trabajador {
    //Atributos o propiedades
    int codigo;
    String nombre;
    int horTrab;
    double tarhor;
    
    //Constructor 
    Trabajador(){
    }
    
    //Metodos
    double obtenerSueldbruto(){
            return horTrab * tarhor; 
    }
    
    //metodo descuento
    double obtenerDescuento(){
        double sueldoBruto=obtenerSueldbruto();
        if(sueldoBruto <4500){
            return sueldoBruto * 0.12;
        }else if(sueldoBruto >=4500 && sueldoBruto <6500){
            return sueldoBruto * 0.16;
        }else{
            return sueldoBruto * 0.16;
        }
    }
    
    
    double obtenerSueldneto(){
            return obtenerSueldbruto() - obtenerDescuento(); 
    }
    
    
    void mostrarDatos(){
            System.out.println("Codigo: " + codigo);
            System.out.println("Nombre: " + nombre);
            System.out.println("Horas trabajadas: " + horTrab);
            System.out.println("Tarifa horaria: " + tarhor);
            System.out.println("Sueldo bruto: " + obtenerSueldbruto());
            System.out.println("Descuento: " + obtenerDescuento());
            System.out.println("Sueldo neto: " + obtenerSueldneto());
            System.out.println("");
        }
    
}
























/*Diseñe la clase trabajador en el paquete POO_Propuesto cn los atributos publicos: codigo(int),
nombre(string), horas trabajadas(int) y tarifa horarias(double)

implementar ademas:
-un metodo que retorne el sueldo bruto (horas * tarifa)
-un metodo que retorne el descuento de acuerdo a la siguiente tabla

sueldo bruto               Descuento
<4500                      12% del sueldo bruto
>=4500 y <6500             14% swl sueldo bruto
>=6500                     16% el sueldo bruto

-Un metodo que retorne el sueldo neto(sueldo bruto - descuento)

*/
