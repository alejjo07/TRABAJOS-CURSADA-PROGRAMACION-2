/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg10;

import java.util.Scanner;

public class Ejercicio10 {
    
 
    public static int actualizarStock(int stockProducto, int cantVendida, int cantRecibida) {
        int nuevoStock = stockProducto - cantVendida + cantRecibida;
        return nuevoStock;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Ingrese el stock actual del producto: ");
        int stockProducto = input.nextInt();
        
        System.out.print("Ingrese la cantidad vendida: ");
        int cantVendida = input.nextInt();
        
        System.out.print("Ingrese la cantidad recibida: ");
        int cantRecibida = input.nextInt();
        
        int nuevoStock = actualizarStock(stockProducto, cantVendida, cantRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
}
