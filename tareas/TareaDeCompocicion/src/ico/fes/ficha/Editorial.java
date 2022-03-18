/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.ficha;

/**
 *
 * @author Emiliano
 */
public class Editorial {
    String titulo;
    String ciudad;
    int añoPublicacion;
    int nomPaginas;

    public Editorial() {
    }

    public Editorial(String titulo, String ciudad, int añoPublicacion, int nomPaginas) {
        this.titulo = titulo;
        this.ciudad = ciudad;
        this.añoPublicacion = añoPublicacion;
        this.nomPaginas = nomPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public int getNomPaginas() {
        return nomPaginas;
    }

    public void setNomPaginas(int nomPaginas) {
        this.nomPaginas = nomPaginas;
    }

    @Override
    public String toString() {
        return "Editorial{" + "titulo=" + titulo + ", ciudad=" + ciudad + ", a\u00f1oPublicacion=" + añoPublicacion + ", nomPaginas=" + nomPaginas + '}';
    }
    
    
}
