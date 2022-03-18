/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.libros;

import ico.fes.ficha.Autor;
import ico.fes.ficha.Editorial;

/**
 *
 * @author Emiliano
 */
public class Libro {
    String titulo;
    String idioma;
    Autor autor;
    Editorial editor;

    public Libro() {
    }

    public Libro(String titulo, String idioma, Autor autor, Editorial editor) {
        this.titulo = titulo;
        this.idioma = idioma;
        this.autor = autor;
        this.editor = editor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditor() {
        return editor;
    }

    public void setEditor(Editorial editor) {
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", idioma=" + idioma + ", autor=" + autor + ", editor=" + editor + '}';
    }
    
    
}
