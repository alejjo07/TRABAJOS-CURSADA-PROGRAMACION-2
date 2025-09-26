/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg2;

public class Mascota {
    String nombre = "Merlin";
    String especie = "Ave";
    int edad = 2;
    
    void mostrarInfo() {
        System.out.println("El nombre de la mascota es: " + nombre);
        System.out.println("La especie de la mascota es: " + especie);
        System.out.println("La edad de la mascota es de " + edad + " anios.");
    }
    
    void cumplirAnios(){
        edad += 2;  
        System.out.println("El nombre de la mascota es: " + nombre);
        System.out.println("La especie de la mascota es: " + especie);
        System.out.println("La edad de la mascota despues de 2 anios es: " + edad);
    }
    
}

