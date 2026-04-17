/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica18_composicion;

/**
 *
 * @author Usuario
 */
           //Persona   es una Direccion
public class Persona /*extends Direccion*/{
   private String nombre;
   private String apellido;
   private int edad;
   private Direccion direccion; //un atributo  de tipo objeto
    
    //CONSTRUCTORES

    public Persona(String nombre, String apellido, int edad, String direccion, int numero, String colonia, String ciudad, String cp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = new Direccion(direccion,numero,colonia,ciudad,cp);
    }
    public Persona() {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = new Direccion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }   
}