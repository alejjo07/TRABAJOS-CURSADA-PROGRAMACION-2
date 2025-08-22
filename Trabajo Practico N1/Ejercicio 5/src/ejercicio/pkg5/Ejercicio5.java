/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5;
import java.util.Scanner;

public class Ejercicio5 {

 
    public static void main(String[] args) {
    
        Scanner input = new Scanner (System.in);
        
         System.out.print("Ingrese el 1er numero: ");
         int num1 = input.nextInt();
         
         System.out.print("Ingrese el 2do numero: ");
         int num2 = input.nextInt();
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;   
        double division = (double) num1 / num2; 
        
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);
    }
}
