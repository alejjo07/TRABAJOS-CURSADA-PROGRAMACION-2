/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg8;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // Composicion
    
    public Documento (String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        // La composicion se crea dentro del documento
        this.firmaDigital = new FirmaDigital (codigoHash, fecha, usuario);
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getContenido() {
        return contenido;
    }
    
    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }
}   
