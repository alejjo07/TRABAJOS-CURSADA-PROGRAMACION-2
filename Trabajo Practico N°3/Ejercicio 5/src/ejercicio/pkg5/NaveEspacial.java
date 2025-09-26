/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg5;


public class NaveEspacial {
// Se le asignan atributos a la clase NaveEspacial    
    String nombre;
    double combustible;
    final double capacidad_max = 100;
    
// Se asignan metodos
public NaveEspacial (String n, double c) {
    nombre = n;
    combustible = c;
}
// Este metodo tiene un condicional que haceque si tiene como minimo
// 10 de combustible puede despegar, en caso de tener menos no va a poder
public void despegar (){
    if (combustible >= 10){
        combustible = combustible - 10;
        System.out.println(nombre + " ha despegado.");
    } else {
        System.out.println("No hay suficiente combustible para despegar");
    }
}
// Este metodo calcula cuantas unidades de combustible se necesitan para
// si hay lo suficiente lo descuenta y muestra un mensaje en caso de que no
// imprime un mensaje de que no hay suficiente y no se puede avanzar
public void avanzar(double distancia) {
double consumo = distancia * 2;
if (combustible >= consumo) {
    combustible = combustible - consumo;
    System.out.println(nombre + " avanzo " + distancia + " km. ");
} else {
    System.out.println("No hay suficiente combustible para avanzar  " + distancia + " km. ");
}
}
public void recargarCombustible(double cantidad){
    if (combustible + cantidad > capacidad_max) {
        combustible = capacidad_max;
        System.out.println("Combustible al maximo.");
    } else {
        combustible = combustible + cantidad;
        System.out.println("Se recargaron " + cantidad + " unidad de combustible.");        
    }
}
public void mostrarEstado() {
    System.out.println("Nave: " + nombre);
    System.out.println("Combustible actual: " + combustible );
}
}
