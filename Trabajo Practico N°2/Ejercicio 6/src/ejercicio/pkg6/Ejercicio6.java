/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       int positivos = 0;
       int negativos = 0;
       int ceros = 0;
      
       for (int i = 1; i <= 10; i++) {
    System.out.print("Ingresa el número " + i + ": ");
    int num = input.nextInt();
    
    if (num > 0 ) {
        positivos ++;
        } else if (num < 0 ){
            negativos ++;
        } else {
            ceros ++;
        }
       } 
    System.out.println("Cantidad de numeros positivos:  " + positivos);
    System.out.println("Cantidad de numeros negativos:  " + negativos);
    System.out.println("Cantidad de ceros:  " + ceros);
    }
}

    
