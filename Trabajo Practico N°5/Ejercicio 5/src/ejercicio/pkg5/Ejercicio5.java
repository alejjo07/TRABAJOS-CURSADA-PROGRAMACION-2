/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5;

public class Ejercicio5 {

    public static void main(String[] args) {
         Propietario propietario1 = new Propietario("Laura Fernandez", 38900234);
         Computadora computadora1 = new Computadora("ASUS", "SN-998877", "ROG STRIX B550-F", "AMD B550", propietario1);

        System.out.println("Propietario: " + propietario1.getNombre());
        System.out.println("DNI: " + propietario1.getDni());
        System.out.println("Computadora: " + computadora1.getMarca());
        System.out.println("Numero de serie: " + computadora1.getNumeroSerie());
        System.out.println("Placa Madre: " + computadora1.getPlacaMadre().getModelo());
        System.out.println("Chipset: " + computadora1.getPlacaMadre().getChipset());
        System.out.println("Verificacion bidireccional: " + propietario1.getComputadora().getMarca());
    }
  
}
  
