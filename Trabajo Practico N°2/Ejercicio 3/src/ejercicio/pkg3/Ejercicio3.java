/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();
        
        if (edad <= 12 ){
            System.out.println("Eres un Ninio");
        } else if (edad >= 12 && edad <= 17 ){ 
            System.out.println("Eres un Adolescente");
    }     else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto");
    }         else if (edad >= 60){
            System.out.println("Eres un Adulto Mayor");
    }
  }
}