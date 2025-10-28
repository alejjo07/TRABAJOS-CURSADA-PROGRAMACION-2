/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg13;

public class Ejercicio13 {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Pedro Fernandez", "pedro@mail.com");

        GeneradorQR generador = new GeneradorQR();
        generador.generar("ABC123XYZ", usuario1);
    }   
}
