/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        // Se crea un "libro" vacio
        Libro a = new Libro ();
        
        a.setTitulo("Las ruinas circulares");
        a.setAutor ("Jorge Luis Borges");
        
        a.setAñoPublicacion(-200);
        a.setAñoPublicacion(1940);
        
        a.mostrarDatos();
    }
    
}
