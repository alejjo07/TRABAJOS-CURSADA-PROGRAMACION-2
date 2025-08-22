/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
       
        System.out.print("Ingrese su nombre y apellido: ");
        String nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();
        input.nextLine();
        
        System.out.print("Ingrese su direccion: ");
        String direccion =  input.nextLine();
        
        System.out.println("Nombre: \t" + nombre);
        System.out.println("Edad: \t " + edad);
        System.out.println("Direccion: \"" + direccion + "\"");
               
    }
    
}
