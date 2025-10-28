/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg12;

public class Calculadora {
     public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto del contribuyente:");
        System.out.println("Nombre: " + impuesto.getContribuyente().getNombre());
        System.out.println("Cuil: " + impuesto.getContribuyente().getCuil());
        System.out.println("Monto base: $" + impuesto.getMonto());

        double total = impuesto.getMonto() * 1.10;
        System.out.println("Monto total con recargo (10%): $" + total);
    }
}
