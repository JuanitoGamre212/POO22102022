/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacion.de.codigo;

import reutilizacion.de.codigo.Polimorfismo.Animal;
import reutilizacion.de.codigo.Polimorfismo.Perro;

/**
 *
 * @author Emiliano
 */
public class ReutilizacionDeCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("---POLIMORFISMO---");
        Animal animal1=new Animal(4);
        Perro animal2=new Perro("poddle",4);
        
        animal1.hablar();
        animal2.hablar();
    }
     
         
}
