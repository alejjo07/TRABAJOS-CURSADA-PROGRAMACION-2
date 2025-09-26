/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4;

// Se crea la clase Gallina
public class Gallina {
// Se definen atributos con sus correspondiente valor   
    int idGallina;
    int edad;
    int huevosPuestos;
// Aca se definen los metodos los cuales definen las acciones que reañizan
// los objetos en la clase    
    public void ponerHuevo() {
        huevosPuestos = huevosPuestos + 1;
    }
    public void envejecer() {
        edad = edad + 1;
    }
    
    public void mostrarEstado() {
        System.out.println("ID: " + idGallina);
        System.out.println("Huevos Puestos: " + huevosPuestos);
        System.out.println("Edad: " + edad);
    }
}
