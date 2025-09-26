/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5;

public class Ejercicio5 {

    public static void main(String[] args) {
        NaveEspacial  nave1 = new NaveEspacial("Voyager 1", 50);
        
        nave1.avanzar(20);
        nave1.recargarCombustible(40);
        nave1.despegar();
        nave1.avanzar(15);
        nave1.mostrarEstado();
    }
    
}
