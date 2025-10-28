/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

public class Ejercicio1 {

    public static void main(String[] args) {
        Titular t1 = new Titular ("Juan Perez", "35861429");
        Pasaporte p1 = new Pasaporte("A12345", "2024-05-10", "JPG", "foto_juan.jpg", t1);
        
        System.out.println("Titular: " + t1.getNombre());
        System.out.println("Pasaporte n°: " + p1.getNumero());
        System.out.println("Formato foto: " + p1.getFoto().getFormato());
        System.out.println("Verificacion bidireccional: " + t1.getPasaporte().getNumero());
    }
}
