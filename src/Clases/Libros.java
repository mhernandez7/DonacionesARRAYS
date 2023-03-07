/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Libros extends Persona{
    
     public void registroDonacion(ArrayList<Persona>lista){
            Scanner read = new Scanner (System.in);
            Persona registro2;
            do{
                
            System.out.println("Ingrese el nombre del libro que desa donar: ");
            this.articuloDona = read.next();
            registro2 = new Persona(this.articuloDona);
            lista.add(registro2);
            System.out.println("Para salir ingrese 2. Caso contrario ingrese otro numero: ");
            this.ingreso1 = read.nextInt();
            
            }while(this.ingreso1 != 2 );
    }
    public void impresionRegistro(ArrayList<Persona>lista){
       
        for (int i = 0; i<lista.size();i++ ){
            
            System.out.println("Datos registro del Donante: Nombre: "+lista.get(i).nombre+" Contacto: "+lista.get(i).contacto);
       
        }
    
    }
    public void impresionDonacion(ArrayList<Persona>lista){
        
        for(int i=0; i<lista.size();i++){
        
         System.out.println("Articulo Donado: Libro Nombre: "+lista.get(i).articuloDona);
        }
        System.out.println("Total de articulo donado: "+lista.size());
        
    }
   
    
}
