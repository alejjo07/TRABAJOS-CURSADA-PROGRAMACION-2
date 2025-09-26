/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg1;

public class Estudiante {
    String nombre = "Alejo";
    String apellido = "Rosas";
    String curso = "Programacion";
    double  calificacion = 8;
    
    void mostrarInfo() {
        System.out.println("El nombre del estudiante es: " + nombre);
        System.out.println("El apellido del estudiante es: " + apellido);
        System.out.println("El curso al que pertenece el estudiante es: " + curso);
        System.out.println("La calificacion del alumno es: " + calificacion);
    }
    
       void subirCalificacion(double puntos) {
           calificacion += puntos;
    }
       void bajarCalificacion(double puntos) {
           calificacion -= puntos;
       }
}

