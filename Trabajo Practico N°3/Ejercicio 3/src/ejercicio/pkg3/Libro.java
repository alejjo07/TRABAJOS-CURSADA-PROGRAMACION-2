/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg3;

public class Libro {
// Se crean atributos privados
// Para asignarle valores privados a los atributos se debe póner "private" al comienzo de estos
   private String titulo;
   private String autor;
   private int añoPublicacion;
    
// Aca se ponen los Getters los cuales son publicos, su funcion es que permiten leer 
// valores de los atributos privados que creamos anteriormente
   public String getTitulo() {
       return titulo;
   }
   public String getAutor() {
       return autor;
   }
   public int getAñoPublicacion() {
       return añoPublicacion;
   }
    
   // Aca se ponen los Setters para poder asignarle un nuevo valor a los atributos 
   public void setTitulo(String nuevoTitulo) {
       titulo = nuevoTitulo;
   }
   public void setAutor(String nuevoAutor){
       autor = nuevoAutor;
   }
   // En este Setter es lo mismo solo que se le agrega una validacion 
   public void setAñoPublicacion(int nuevoAño) {
       if (nuevoAño > 0 && nuevoAño <= 2025) {
           añoPublicacion = nuevoAño;
       } else {
           System.out.println("Anio de publicacion invalido: " + nuevoAño);
       }
       
   } 
    public void mostrarDatos() {
    System.out.println("Titulo: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Anio de publicacion: " + añoPublicacion);
    }
}


