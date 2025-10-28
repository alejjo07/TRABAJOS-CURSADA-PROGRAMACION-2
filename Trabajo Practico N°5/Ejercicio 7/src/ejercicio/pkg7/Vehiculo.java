/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg7;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;
    
    public Vehiculo (String patente, String modelo, Motor motor, Conductor conductor) {
        this.modelo = modelo;
        this.patente = patente;
        this.motor = motor;
        this.conductor = conductor;
        conductor.setVehiculo(this); // Vinculo Bidireccional
    }
    
    public String getPatente() {
        return patente;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public Motor getMotor() {
        return motor;
    }
    
    public Conductor getConductor() {
        return conductor;
    }
}
