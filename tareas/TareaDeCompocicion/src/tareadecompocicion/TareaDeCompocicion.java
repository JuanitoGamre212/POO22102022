/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareadecompocicion;

import ico.fes.ficha.Autor;
import ico.fes.ficha.Editorial;
import ico.fes.libros.Libro;

/**
 *
 * @author Emiliano
 */
public class TareaDeCompocicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Libro lib =new Libro();
    lib.setTitulo("Alicia en el pais de las maravillas");
    lib.setIdioma("Ingles");
    lib.setAutor(new Autor("Lewis Carroll", "Reino Unido", false));
    lib.setEditor(new Editorial("Macmillan Publishers", "Nueva York", 1865, 208));
        System.out.println(lib);
    
    }
    
}
