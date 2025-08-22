/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7;

import java.util.Scanner;

public class Ejercicio8 {
 
    public static void main(String[] args) {
   
        Scanner input = new Scanner (System.in);
        
        double division;
        
        System.out.print("Ingrese el 1er numero: ");
        int num1 = input.nextInt();
        
        System.out.print("Ingrese el 2do numero: ");
        int num2 = input.nextInt();
        
        division = num1 / num2;
        
           System.out.println("El resultado de la division es de:  " + division);
        
        
    }
    
}
