/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reutilizacion.de.codigo.Polimorfismo;

/**
 *
 * @author Emiliano
 */
   public class Perro extends Animal{
    private String raza;

    public Perro() {
        super(0);
    }

    public Perro(String raza, int numeroPatas) {
        super(numeroPatas);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + "raza=" + raza + '}';
    }
    
    @Override
    public void hablar(){
        System.out.println("El perro de raza " + this.raza + "Esta ladrando");
            System.out.println("Guau guau!!!");
    }
    
    
    //Polimorfismo por el concepto de sobrecarga de método
    public void hablar(int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println("Guau ");
            
        }
        System.out.println("!!!");
    }
    
}
    
    

