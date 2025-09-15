/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int numero;
        int suma = 0;
             
        while (true) {
            System.out.print("Ingrese algun numero: ");
                    numero = input.nextInt();
                    
                    if (numero == 0) {
                        break;
                    }
                    
                    if (numero % 2 == 0) {
                        suma += numero;
                    }
                }
        System.out.println("La suma de los numeros pares es: " + suma);
    }
}