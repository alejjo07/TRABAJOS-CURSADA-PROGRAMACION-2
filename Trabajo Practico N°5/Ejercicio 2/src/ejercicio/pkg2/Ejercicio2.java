/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;

public class Ejercicio2 {

    public static void main(String[] args) {
        Usuario u1 = new Usuario ("Laura Gomez", 40234123);
        Bateria b1 = new Bateria ("Samsung-BA500", 4000);
        Celular c1 = new Celular ("351654987321456", "Samsung", "Galaxy A15", b1, u1);
        
        System.out.println("Usuario: " + u1.getNombre());
        System.out.println("Celular Imei: " + c1.getImei());
        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Modelo bateria: " + c1.getBateria().getModelo());
        System.out.println("Verificacion bidireccional: " + u1.getCelular().getMarca());
    }
    
}
