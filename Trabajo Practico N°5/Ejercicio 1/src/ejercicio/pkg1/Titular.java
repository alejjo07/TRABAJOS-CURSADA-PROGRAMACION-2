/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg1;

public class Titular {
        private String nombre;
        private String dni;
        private Pasaporte pasaporte; 
        
        public Titular (String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }        
        public void setPasaporte (Pasaporte pasaporte) {
            this.pasaporte = pasaporte;
        }
        public Pasaporte getPasaporte() {
            return pasaporte;
        }
        public String getNombre() {
            return nombre;
        }
        public String getDni() {
            return dni;
        }
}
