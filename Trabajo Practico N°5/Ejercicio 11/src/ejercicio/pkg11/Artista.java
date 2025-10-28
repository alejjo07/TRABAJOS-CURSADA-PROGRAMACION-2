/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg11;

public class Artista {
    private String nombre;
    private String genero; 
    
    public Artista (String nombre, String genero) {
        this.genero = genero;
        this.nombre = nombre;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public String getNombre() {
        return nombre;
    }
}
