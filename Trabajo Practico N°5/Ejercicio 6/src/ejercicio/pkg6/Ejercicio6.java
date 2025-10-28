/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6;

public class Ejercicio6 {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente ("Sofia Gomez", 1123456789 );
        Mesa mesa1 = new Mesa (12,4);
        Reserva reserva1 = new Reserva ("2025-10-20", "21:30", cliente1, mesa1);
        
        System.out.println("Reserva realizada:");
        System.out.println("Fecha: " + reserva1.getFecha());
        System.out.println("Hora: " + reserva1.getHora());
        System.out.println("Cliente: " + reserva1.getCliente().getNombre());
        System.out.println("Telefono: " + reserva1.getCliente().getTelefono());
        System.out.println("Mesa Numero: " + reserva1.getMesa().getNumero());
        System.out.println("Capacidad: " + reserva1.getMesa().getCapacidad());
    }
    
}
