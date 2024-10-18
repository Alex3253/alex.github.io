package Arreglos_objetos.Controlador;

import Arreglos_objetos.Models.Producto;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        //Declaracion de variables, objetos, arreglos
        Scanner leer=new Scanner(System.in);

        String lista1[]=new String[5];//elemento del mismo tipo primitivo(string)
        Object lista2[]=new Object[5];//elementos de diferentes tipos(int, double, string)
        Producto lista3[]= new Producto[5];//elementos de tipo objeto

        ArrayList<Producto>listaProductos=new ArrayList<Producto>();//elemento de tipo objeto
        int codigo;
        String nombre;
        double precio;
        char rpta='S';
        
        //----Agregar objetos ala arreglo listaProductos
        while(rpta=='S' || rpta=='s'){
            //-----Entrad dade datos
            System.out.println("Ingresa el codigo del producto: ");
            codigo=leer.nextInt();
            System.out.println("Ingresa el nombre del producto: ");
            nombre=leer.next();
            System.out.println("Ingresa el precio del producto: ");
            precio=leer.nextDouble();

            //Creando un objeto con parametros
            Producto producto=new Producto(codigo, nombre, precio);
            //Agregar el objeto al arreglo listaProductos
            listaProductos.add(producto);
            System.out.println("Desea continuar registrando productos [S][N]: ");
            rpta=leer.next().charAt(0);
        }
        
        //----Mostrar objetos de la lista de arreglos "listaProductos"
        for(int p=0;p<listaProductos.size();p++){    //size significa tamaño
            System.out.println("- " + listaProductos.get(p).getCodprod() + 
                    "||" + listaProductos.get(p).getDesprod() + 
                    "||" + listaProductos.get(p).getPreprod());
        }
        //----Consulta los objetos de la lista de arreglos "listaProductos"
        rpta='S';
        while(rpta=='S' || rpta=='s'){
            //-----Entrad dade datos
            System.out.println("Ingresa el codigo a consultar: ");
            codigo=leer.nextInt();
            
            for(int p=0;p<listaProductos.size();p++){    //size significa tamaño
                if(codigo==listaProductos.get(p).getCodprod()){
                    System.out.println("- " + listaProductos.get(p).getDesprod() + 
                    "||" + listaProductos.get(p).getPreprod());
                }
            }
            System.out.println("Desea continuar registrando productos [S][N]: ");
            rpta=leer.next().charAt(0);
        }
        
        
        //----modificar los objetos de la lista de arreglos "listaProductos"
        rpta='S';
        while(rpta=='S' || rpta=='s'){
            //-----Entrad dade datos
            System.out.println("Ingresa el codigo del producto a modificar: ");
            codigo=leer.nextInt();
            
            for(int p=0;p<listaProductos.size();p++){    //size significa tamaño
                if(codigo==listaProductos.get(p).getCodprod()){
                    System.out.println("Ingrese el nuevo nombre del producto: ");
                    String xnombre=leer.next();
                    listaProductos.get(p).setDesprod(xnombre);
                }
            }
            System.out.println("Desea continuar registrando productos [S][N]: ");
            rpta=leer.next().charAt(0);
        }
        //----Mostrar objetos de la lista de arreglos "listaProductos"
        for(int p=0;p<listaProductos.size();p++){    //size significa tamaño
            System.out.println("- " + listaProductos.get(p).getCodprod() + 
                    "||" + listaProductos.get(p).getDesprod() + 
                    "||" + listaProductos.get(p).getPreprod());
        }
        
        //----eliminar los objetos de la lista de arreglos "listaProductos"
        rpta='S';
        while(rpta=='S' || rpta=='s'){
            //-----Entrad dade datos
            System.out.println("Ingresa el codigo del producto a eliminar: ");
            codigo=leer.nextInt();
            
            for(int p=0;p<listaProductos.size();p++){    //size significa tamaño
                if(codigo==listaProductos.get(p).getCodprod()){
                    listaProductos.remove(p);
                }
            }
            System.out.println("Desea continuar registrando productos [S][N]: ");
            rpta=leer.next().charAt(0);
        }
        //----Mostrar objetos de la lista de arreglos "listaProductos"
        for(int p=0;p<listaProductos.size();p++){    //size significa tamaño
            System.out.println("- " + listaProductos.get(p).getCodprod() + 
                    "||" + listaProductos.get(p).getDesprod() + 
                    "||" + listaProductos.get(p).getPreprod());
        }
    }
}