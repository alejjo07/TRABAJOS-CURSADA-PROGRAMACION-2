/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg11;

public class Cancion {
    private String titulo;
    private Artista artista; // Asociacion unidireccional
    
    public Cancion (String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public Artista getArtista() {
        return artista;
    }
}
