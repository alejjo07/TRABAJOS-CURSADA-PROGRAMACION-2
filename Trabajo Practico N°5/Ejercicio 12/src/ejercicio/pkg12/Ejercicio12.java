/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg12;

public class Ejercicio12 {

    public static void main(String[] args) {
       Contribuyente contribuyente1 = new Contribuyente("Maria Lopez", "27-38123456-9");
        Impuesto impuesto1 = new Impuesto(125000.50, contribuyente1);

        Calculadora calculadora1 = new Calculadora();
        calculadora1.calcular(impuesto1);
    }    
}
