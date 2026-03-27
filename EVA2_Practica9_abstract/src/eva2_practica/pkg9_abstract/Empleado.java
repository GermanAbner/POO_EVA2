/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica.pkg9_abstract;

/**
 *
 * @author Usuario
 */
public class Empleado extends Persona{
    private String claveEmpleado;
    private String puesto;
    private double salario;
    private int annio;

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public Empleado(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
    }
   
    public Empleado(String claveEmpleado, String puesto, double salario, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.claveEmpleado = claveEmpleado;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getClaveEmpleado() {
        return claveEmpleado;
    }

    public void setClaveEmpleado(String claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
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

    @Override
    public int calcularAntiguedad() {
        return (2026 - annio); 
    }
    
    
    
   public void imprimirDatos(){
       //ATRIBUTOS PROTECTED EN LA CLASE PERSONA
       System.out.println("Nombre: " + nombre);
       System.out.println("Apellidos: " + apellidos);
       System.out.println("Edad: " + edad);
       //ATRIBUTOS DE MI CLASE
       System.out.println("CLAVE EMPLEADO: " + claveEmpleado);
       System.out.println("Salario: " + salario);
       System.out.println("Puesto: " + puesto);
       System.out.println("Antiguedad: " + calcularAntiguedad());
       
   } 
    
    
}
