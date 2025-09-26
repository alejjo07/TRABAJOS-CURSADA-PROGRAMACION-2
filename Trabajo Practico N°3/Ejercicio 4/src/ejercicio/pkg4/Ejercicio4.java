/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4;

public class Ejercicio4 {

    public static void main(String[] args) {
        Gallina a = new Gallina();
        a.idGallina = 1;
        a.huevosPuestos = 2;
        a.edad = 5;
        
        Gallina b = new Gallina();
        b.idGallina = 2;
        b.huevosPuestos = 5;
        b.edad = 1;
        
// A continuacion se llaman a los metodos con los cuales tienen
// tienen actualizados los atributos 
        a.envejecer();
        a.ponerHuevo();
        a.ponerHuevo();

        b.envejecer();
        b.ponerHuevo();
        
// Luego se muestran los estados finales de cada objeto       
        a.mostrarEstado();
        b.mostrarEstado();
    }
    
}
