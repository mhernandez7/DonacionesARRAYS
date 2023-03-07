/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;



import static donacio.Donacio.Juguetes;
import static donacio.Donacio.Prendas;
import static donacio.Donacio.Libros;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public  class Persona  {
    
    protected String nombre;
    protected String contacto;
    protected String articuloDona;
    protected short ingreso;
    protected int ingreso1;

    public Persona(){
    
    }
    public Persona(String nombre, String contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
  
    }

    public Persona(String articuloDona) {
        this.articuloDona = articuloDona;
    }
   
     public void registroInfo(ArrayList<Persona>lista){
        Scanner read = new Scanner(System.in);
        Persona registro1;
        
            System.out.println("Ingrese su nombre: ");
            this.nombre = read.next();
            System.out.println("Ingrese su Contacto: ");
            this.contacto = read.next();
            registro1 = new Persona(this.nombre,this.contacto);
            lista.add(registro1);
       
    }
    public void validacion(){
    Scanner read = new Scanner(System.in);    
        System.out.println("Bienvenido a la grupo bienestar donacion");
        System.out.println("Para donar juguetes, ingrese a la opcion 1)");
        System.out.println("Para donar prendas, ingrese a la opcion  2)");
        System.out.println("Para donar Libros, ingrese a la opcion   3)");
        this.ingreso = read.nextShort();
    
        switch (this.ingreso ){
                    
            case 1: {
                Juguetes();
                break;
                    }
            case 2: {
                Prendas(); 
                 break;
                    }
            case 3: {
                Libros();
                break;
                    }
            case 4: {
                System.out.println("Error.::::::::::::::::::::::::::::::::::::::::");
                break;
                    }    
        } 
    }

    public void valdacion1() {
        Scanner read = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("Gracias por sus donaciones");
        System.out.println("Desea ingresar a otra seccion para seguir donando articulos?");
        System.out.println("Marque 1 para si o 2 para salir");
        this.ingreso = read.nextShort();
        if (this.ingreso == 1){
        validacion();
        }else
            System.out.println("Ha salido correctamente del programa. Lo esperamos pronto");
    
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", contacto=").append(contacto);
        sb.append(", articuloDona=").append(articuloDona);
        sb.append('}');
        return sb.toString();
    }
   
}
