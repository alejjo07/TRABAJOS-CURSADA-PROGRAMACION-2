/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg9;

public class Ejercicio9 {

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente ("Maria Lopez" , "OSDE");
        Profesional profesional1 = new Profesional ("Dr. Ricardo Perez", "Cardiologia");
        CitaMedica cita1 = new CitaMedica ("2025 - 11 - 02", "10:30" , paciente1, profesional1);
        
        System.out.println("Cita medica: ");
        System.out.println("Fecha: " + cita1.getFecha());
        System.out.println("Hora: " + cita1.getHora());
        System.out.println("\nPACIENTE:");
        System.out.println("Nombre: " + cita1.getPaciente().getNombre());
        System.out.println("Obra Social: " + cita1.getPaciente().getObraSocial());
        System.out.println("\nPROFESIONAL:");
        System.out.println("Nombre: " + cita1.getProfesional().getNombre());
        System.out.println("Especialidad: " + cita1.getProfesional().getEspecialidad());
   
    }
    
}
