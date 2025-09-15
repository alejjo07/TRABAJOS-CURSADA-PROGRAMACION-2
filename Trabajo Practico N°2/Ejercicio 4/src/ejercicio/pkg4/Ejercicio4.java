/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextInt();
        
        System.out.print("Ingrese la categoria en la que se encuentra: ");
        String cate = input.next();
        
        System.out.println("El precio ingresado es: " + precio);
        
        double precioFinalA = precio * 0.90;
        double precioFinalB = precio * 0.85;
        double precioFinalC = precio * 0.80;
         
        if (cate.equalsIgnoreCase ("A")) {
            System.out.println("El precio con el descuento de categoria A es: " + precioFinalA);
        } else if (cate.equalsIgnoreCase ("B")) {
            System.out.println("El precio con el descuento de categoria B es: " + precioFinalB);
        } else if (cate.equalsIgnoreCase ("C")) {
            System.out.println("El precio con el descuento de categoria C es: " + precioFinalC);
        }
    }
    
}
