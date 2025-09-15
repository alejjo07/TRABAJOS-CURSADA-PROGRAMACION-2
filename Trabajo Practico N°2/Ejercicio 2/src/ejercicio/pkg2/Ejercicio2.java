/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
        System.out.print("Ingrese el 1er numero entero: ");
           int num1  = input.nextInt();
           
         System.out.print("Ingrese el 2do numero entero: ");
           int num2 = input.nextInt();
           
         System.out.print("Ingrese el 3er numero entero: ");
           int num3 = input.nextInt();
       
           
        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero mayor es: " + num2);
        } else {
            System.out.println("El numero mayor es: " + num3);
        }
           
    }
    
}
