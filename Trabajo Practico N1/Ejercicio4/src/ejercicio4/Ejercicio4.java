/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

 
    public static void main(String[] args) {
   
        
        
    Scanner input = new Scanner (System.in);
  
    System.out.print("Ingrese su nombre: ");
    String nombre = input.nextLine();
    
    System.out.print("Ingrese su edad: ");
    int edad = input.nextInt();
    
    System.out.println("Hola mi nombre es " + nombre + " y tengo " + edad + " anios.");
    
  }
}