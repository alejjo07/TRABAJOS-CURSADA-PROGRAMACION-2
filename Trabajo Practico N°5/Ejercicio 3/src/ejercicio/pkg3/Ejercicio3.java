/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3;

public class Ejercicio3 {

    public static void main(String[] args) {
        Autor autor1 = new Autor ("Gabriel Garcia Marquez", "Colombiana");
        Editorial editorial1 = new Editorial ("Editorial Sudamericana", "Buenos Aires, Argentina");
        Libro libro1 = new Libro ("Cien anios de soledad", 978-950-07-5405-5 , autor1, editorial1);
        
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("ISBN: " + libro1.getIsbn());
        System.out.println("Autor: " + libro1.getAutor().getNombre());
        System.out.println("Nacionalidad: " + libro1.getAutor().getNacionalidad());
        System.out.println("Editorial: " + libro1.getEditorial().getNombre());
        System.out.println("Direccion editorial: " + libro1.getEditorial().getDireccion());
    }
    
        
}
