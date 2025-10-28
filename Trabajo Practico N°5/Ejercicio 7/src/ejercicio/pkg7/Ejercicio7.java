/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7;

public class Ejercicio7 {

    public static void main(String[] args) {
        Conductor conductor1 = new Conductor ("Pedro Ramirez", "L-123456");
        Motor motor1 = new Motor ("Nafta", "MTR-998877");
        Vehiculo vehiculo1 = new Vehiculo ("ABC-123", "Toyota Corolla", motor1, conductor1);
       
        System.out.println("Vehiculo: ");
        System.out.println("Patente: " + vehiculo1.getPatente());
        System.out.println("Modelo: " + vehiculo1.getModelo());
        System.out.println("Motor: " + vehiculo1.getMotor().getTipo());
        System.out.println("Numero de Serie de Motor: " + vehiculo1.getMotor().getNumeroSerie());
        System.out.println("/nConductor: ");
        System.out.println("Nombre: " + conductor1.getNombre());
        System.out.println("Licencia: " + conductor1.getLicencia());
        System.out.println("Verificacion Bidireccional (vehiculo del conductor): " + conductor1.getVehiculo().getPatente());
    }
    
}
