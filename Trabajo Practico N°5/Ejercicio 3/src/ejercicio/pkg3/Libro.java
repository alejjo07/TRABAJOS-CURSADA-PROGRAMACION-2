/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg3;

public class Libro {
    private String titulo;
    private int isbn;
    private Autor autor; // Asociacion unidireccinal
    private Editorial editorial; // Agregacion
    
    public Libro (String titulo, int isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial; 
    }
    
    public String getTitulo () {
        return titulo;
    }
    
    public int getIsbn () {
        return isbn;
    }
    
    public Autor getAutor () {
        return autor;   
    }
    
    public Editorial getEditorial () {
        return editorial;
    }
}
