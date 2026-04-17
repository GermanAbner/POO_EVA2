/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica18_composicion;

import java.util.HashSet;

/**
 *
 * @author Usuario
 */
public class EVA2_Practica18_COMPOSICION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona("Juan","Perez",50,"Universidad",
                                      100,"Centro","Chihuahua","31000");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Calle: " + persona.getDireccion().getdireccion());
        System.out.println("Numero: " + persona.getDireccion().getNumero());
        System.out.println("Colonia: " + persona.getDireccion().getColonia());
        System.out.println("CP: " + persona.getDireccion().getCp());
        System.out.println("Ciudad: " + persona.getDireccion().getCiudad());
        //SE CAMBIA LA DIRECCION DE LA PERSONA:
        
        Direccion direccion = new Direccion("Tecnologico",100,"Santo Nino","Chihuahua","31000");
        persona.setDireccion(direccion);
        
        
        
    }
    
}
