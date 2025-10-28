/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg8;

public class Ejercicio8 {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Carla Gomez", "carla.gomez@email.com");
        Documento documento1 = new Documento ("Contrato Laboral", 
                "Este documento certifica la relacion laboral entre las partes.", 
                "HASH-XYZ123", "2025-10-24", usuario1);
        
        System.out.println("Documento: " + documento1.getTitulo());
        System.out.println("Contenido: " + documento1.getContenido());
        System.out.println("Codigo Hash: " + documento1.getFirmaDigital().getCodigoHash());
        System.out.println("Fecha de Firma: " + documento1.getFirmaDigital().getFecha());
        System.out.println("Usuario firmante: " + documento1.getFirmaDigital().getUsuario().getNombre());
        System.out.println("Email del usuario: " + documento1.getFirmaDigital().getUsuario().getEmail());
    }
    
}
