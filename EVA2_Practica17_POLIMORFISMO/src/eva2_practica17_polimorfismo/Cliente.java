/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica17_polimorfismo;

/**
 *
 * @author Usuario
 */        //Cliente es una Persona
public class Cliente extends Persona{
    private String rfc;
    private double credito;

    public Cliente(String rfc, double credito, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.rfc = rfc;
        this.credito = credito;
    }

    public Cliente(String rfc, double credito) {
        this.rfc = rfc;
        this.credito = credito;
    }
    public Cliente() {
        this.rfc = "";
        this.credito = 0;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public String generarDatos() {
        return super.generarDatos() + "\n" + 
                "RFC: " + rfc + "\n" + 
                "Credito: " + credito ;
    }
    
    
    
    
}
