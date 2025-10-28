/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg8;

public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario; // Agregacion 
    
    public FirmaDigital (String codigoHash, String fecha, Usuario usuario) {
        this.fecha = fecha;
        this.codigoHash = codigoHash;
        this.usuario = usuario;
    }
    
    public String getCodigoHash() {
        return codigoHash;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
}
