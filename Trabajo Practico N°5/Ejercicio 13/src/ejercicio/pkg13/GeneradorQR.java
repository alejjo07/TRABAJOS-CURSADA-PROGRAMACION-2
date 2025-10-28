/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg13;

public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR (valor, usuario);
               
        System.out.println("QR generado correctamente.");
        System.out.println("Valor del codigo: " + codigo.getValor());
        System.out.println("Asignado al usuario: " + codigo.getUsuario().getNombre());
        System.out.println("Email: " + codigo.getUsuario().getEmail());
    }
}
