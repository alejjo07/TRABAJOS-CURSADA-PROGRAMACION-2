/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg5;

public class Propietario {
    private String nombre;
    private int dni;
    private Computadora computadora; // Asociacion Bidireccional
    
    public Propietario (String nombre, int dni) {
            this.nombre = nombre;
            this.dni = dni;
    }
           
    public String getNombre() {
        return nombre;
    }
    
    public int getDni() {
        return dni;
    }
    
    public Computadora getComputadora() {
        return computadora;
    }
    
    public void setComputadora (Computadora computadora) {
        this.computadora = computadora;
    }
}
