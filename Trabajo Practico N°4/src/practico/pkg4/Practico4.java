/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico.pkg4;

public class Practico4 {

    public static void main(String[] args) {
       Empleado empleado1 = new Empleado(1, "Juan Perez", "Gerente", 250000);
        Empleado empleado2 = new Empleado("Ana Lopez", "Secretaria");
        Empleado empleado3 = new Empleado("Carlos Gomez", "Tecnico");
        
        empleado1.actualizarSalario(10);    
        empleado2.actualizarSalario(5000);  
        empleado3.actualizarSalario(15);     
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        
         System.out.println("\nTotal de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
