/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();
        
        System.out.print("Ingrese el peso del paquete: ");
        double pesoPaquete = input.nextDouble();
        
        input.nextLine(); 
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = input.nextLine();
        
        double costoEnvio = calcularCostoEnvio(pesoPaquete, zona);
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envio es de " + costoEnvio);
        System.out.println("El total de la compra es de " + totalCompra);
    }
    
        public static double calcularCostoEnvio(double peso, String zona) {
            if (zona.equalsIgnoreCase("Nacional")) {
                return 5 * peso;
            } else if (zona.equalsIgnoreCase("Internacional")) {
                return 10 * peso;
            } else {
                System.out.println("Zona invalida, se tomara como Nacional");
                return 5 * peso;
            }
        }
    
        public static double calcularTotalCompra(double precioProducto, double precioEnvio) {
            return precioProducto + precioEnvio;
    }
}
