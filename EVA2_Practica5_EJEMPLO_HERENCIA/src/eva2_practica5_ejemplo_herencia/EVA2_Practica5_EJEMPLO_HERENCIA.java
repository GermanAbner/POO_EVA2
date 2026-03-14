/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica5_ejemplo_herencia;

/**
 *
 * @author Usuario
 */
public class EVA2_Practica5_EJEMPLO_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona("German Abner ", "Rangel ", "Luna","RALG050607", 18, 'H');
        persona.imprimirDatos();
        Empleado empleado = new Empleado("1", "wasd", 10000, "German Abner ", "Rangel ", "Luna ","RALG050607", 18, 'H');
        empleado.imprimirDatos();
    }
    
}
