/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg14;

public class Ejercicio14 {

    public static void main(String[] args) {
       Proyecto proyecto1 = new Proyecto ("Video promocional", 5);
       EditorVideo editor = new EditorVideo ();

       editor.exportar("MP4",proyecto1);
    }
    
}
