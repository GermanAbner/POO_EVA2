/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica5_ejemplo_herencia;

/**
 *
 * @author Usuario
 */
public class Empleado extends Persona {
    
    private String numeroEmpleado;
    private String puesto;
    private double salario;

    
   
    public Empleado(String numeroEmpleado, String puesto, double salario, String nombre, String ap_paterno, String ap_materno, String rfc, int edad, char genero) {
        super(nombre, ap_paterno, ap_materno, rfc, edad, genero);
        this.numeroEmpleado = numeroEmpleado ;
        this.puesto = puesto;
        this.salario = salario;
        
        this.numeroEmpleado = "";
        this.puesto = "";
        this.salario = 0;
        
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
}
