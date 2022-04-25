/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reutilizacion.de.codigo.Polimorfismo;

/**
 *
 * @author Emiliano
 */
public class Animal {
    int numeroPatas;

    public Animal(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + '}';
    }
    public void hablar(){
        System.out.println("El animal esta emitiendo un sonido");
    }
    
}
