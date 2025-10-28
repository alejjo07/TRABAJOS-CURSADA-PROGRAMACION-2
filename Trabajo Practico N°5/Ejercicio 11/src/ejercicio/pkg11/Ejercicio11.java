/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg11;

public class Ejercicio11 {

    public static void main(String[] args) {
        Artista artista1 = new Artista("Gustavo Cerati", "Rock Alternativo");
        Cancion cancion1 = new Cancion("Crimen", artista1);

        Reproductor reproductor1 = new Reproductor();
        reproductor1.reproducir(cancion1);
    
    }
    
}
