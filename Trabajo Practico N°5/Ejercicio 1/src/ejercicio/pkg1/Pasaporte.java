/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg1;

class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;
    
    public Pasaporte (String numero, String fechaEmision, String formato, String imagen, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto (imagen, formato);
        this.titular = titular;
        titular.setPasaporte(this);
    }
    public String getNumero() {
        return numero;
    }
    public String getFechaEmision() {
      return fechaEmision;
  } 
    public Foto getFoto() {
        return foto;
    }
    public Titular getTitular() {
        return titular;
    }
}

