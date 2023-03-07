/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donacio;

import Clases.Juguetes;
import Clases.Libros;
import Clases.Persona;
import Clases.Prendas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Donacio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Persona personita = new Persona();
        personita.validacion();
        
      
     
    }

    public static void Juguetes(){
        Juguetes juguetico = new Juguetes();
        ArrayList<Persona>lista = new ArrayList<>();
        ArrayList<Persona>lista1 = new ArrayList<>();
        juguetico.registroInfo(lista);
        juguetico.registroDonacion(lista1);
        juguetico.impresionRegistro(lista);
        juguetico.impresionDonacion(lista1);
        juguetico.valdacion1();
        
    }
    public static void Prendas(){
        Prendas prenda = new Prendas();
        ArrayList<Persona>lista = new ArrayList<>();
        ArrayList<Persona>lista1 = new ArrayList<>();
        prenda.registroInfo(lista);
        prenda.registroDonacion(lista1);
        prenda.impresionRegistro(lista);
        prenda.impresionDonacion(lista1);
        prenda.valdacion1();
    }
    public static void Libros(){
        Libros libro = new Libros();
        ArrayList<Persona>lista = new ArrayList<>();
        ArrayList<Persona>lista1 = new ArrayList<>();
        libro.registroInfo(lista);
        libro.registroDonacion(lista1);
        libro.impresionRegistro(lista);
        libro.impresionDonacion(lista1);
        libro.valdacion1();
    }
}
