/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica6_herencia;

/**
 *
 * @author Usuario
 */
public class Empleado {
   
    private String nombre;
    private String apellido;
    private String claveEmpleado;
    private double salario;

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

    public String getClaveEmpleado() {
        return claveEmpleado;
    }

    public void setClaveEmpleado(String claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public Empleado(String nombre, String apellido, String claveEmpleado, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.claveEmpleado = claveEmpleado;
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        String resu = "Clave Empleado: " + claveEmpleado + "\n" + 
                        "Nombre: " + nombre + "\n" + 
                        "Apellidos: " + apellido + "\n" +
                        "Salario: " + salario + "\n";
        return resu;
    }
    
    public double calcularSalario(){
        return salario;
    }
    
}
