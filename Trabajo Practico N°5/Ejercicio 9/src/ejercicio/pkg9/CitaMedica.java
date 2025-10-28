/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg9;

public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente; // Asociacion unidireccional
    private Profesional profesional; // Asociacion unidireccional
    
    public CitaMedica (String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.hora = hora;
        this.fecha = fecha;
        this.paciente = paciente; 
        this.profesional = profesional;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public String getHora () {
        return hora;
    }
    
    public Paciente getPaciente() {
        return paciente; 
    }
    
    public Profesional getProfesional() {
        return profesional;
    }
}
