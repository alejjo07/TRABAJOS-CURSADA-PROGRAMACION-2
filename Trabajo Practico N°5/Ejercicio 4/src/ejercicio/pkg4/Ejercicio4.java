/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4;

public class Ejercicio4 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Martín López", 40123456);
        Banco banco1 = new Banco("Banco Nación", "30-50000000-9");

        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("1234-5678-9876-5432", "12/28", cliente1, banco1);

        System.out.println("Cliente: " + cliente1.getNombre());
        System.out.println("DNI: " + cliente1.getDni());
        System.out.println("Tarjeta Nº: " + tarjeta1.getNumero());
        System.out.println("Vencimiento: " + tarjeta1.getFechaVencimiento());
        System.out.println("Banco: " + tarjeta1.getBanco().getNombre());
        System.out.println("CUIT Banco: " + tarjeta1.getBanco().getCuit());
        System.out.println("Verificación bidireccional: " + cliente1.getTarjeta().getNumero());
    }
}
