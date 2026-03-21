/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica6_herencia;

/**
 *
 * @author Usuario
 */
public class EVA2_Practica6_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Empleado empleado = new Empleado ("German Abner", "Rangel Luna" ,"waos", 100);
        System.out.println(empleado);
        EmpleadoBase empleadoBase = new EmpleadoBase(1980,"German Abner", "Rangel Luna" ,"waos", 100);
        System.out.println(empleadoBase);
        EmpleadoHonorarios empleadoHonorarios = new EmpleadoHonorarios(1980,"German Abner", "Rangel Luna" ,"waos", 100);
        System.out.println(empleadoHonorarios);
    }
    
}
