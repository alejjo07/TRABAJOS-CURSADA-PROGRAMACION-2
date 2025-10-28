/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg2;

public class Usuario {
    private String nombre;
    private int dni; 
    private Celular celular; //Es una asociacion bidireccional
    
    public Usuario (String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setCelular (Celular celular) {
        this.celular = celular;
    } 
    
    public Celular getCelular () {
        return celular;
    }
    
    public String getNombre () {
        return nombre;
    }
    
    public int getDni () {
        return dni;
    }
}
