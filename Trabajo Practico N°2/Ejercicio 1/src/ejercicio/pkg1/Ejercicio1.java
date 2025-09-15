/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
                
        System.out.println("Ingrese el año: ");
           int anio = input.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }
    
}
