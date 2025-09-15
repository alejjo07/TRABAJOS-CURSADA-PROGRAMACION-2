 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg8;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = input.nextDouble();
        
        System.out.print("Ingrese el impuesto en porcentaje: ");
        double impuesto = input.nextDouble();
        
        System.out.print("Ingrese el descuento en porcentaje: ");
        double descuento = input.nextDouble();
               
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);        
                
        System.out.println("El precio final del producto es: " + precioFinal);
        
    }

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioConImpuesto = precioBase + (precioBase * impuesto / 100);
        double precioFinal = precioConImpuesto - (precioBase * descuento / 100);
        return precioFinal;
    }
}

