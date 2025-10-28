/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg14;

public class EditorVideo {
    public void exportar (String formato, Proyecto proyecto) {
        Render render = new Render (formato, proyecto);
        
        System.out.println("Exportando proyecto.");
        System.out.println("Proyecto: " + render.getProyecto().getNombre());
        System.out.println("Duracion: " + render.getProyecto().getDuracionMin() + " minutos");
        System.out.println("Formato de exportacion: " + render.getFormato());
        System.out.println("Exportacion finalizada con exito.");
    }
}
