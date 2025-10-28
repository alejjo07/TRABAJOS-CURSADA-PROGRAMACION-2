/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg10;

public class Ejercicio10 {

    public static void main(String[] args) {
        Titular titular1 = new Titular("Carlos Gomez", 38123456);
        CuentaBancaria cuenta1 = new CuentaBancaria("1234567890123456789012", 150000.75, "ABC123", "2025-10-20", titular1);

        System.out.println("Titular: " + titular1.getNombre());
        System.out.println("DNI: " + titular1.getDni());
        System.out.println("CBU: " + cuenta1.getCbu());
        System.out.println("Saldo: $" + cuenta1.getSaldo());
        System.out.println("Codigo de seguridad: " + cuenta1.getClaveSeguridad().getCodigo());
        System.out.println("Ultima modificacion: " + cuenta1.getClaveSeguridad().getUltimaModificacion());
        System.out.println("Verificacion bidireccional (CBU del titular): " + titular1.getCuenta().getCbu());
    }
}
