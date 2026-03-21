/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica6_herencia;

/**
 *
 * @author Usuario
 */
public class EmpleadoHonorarios extends EmpleadoBase {
    private int horas;

    public EmpleadoHonorarios(String nombre, String apellido, String claveEmpleado, double salario) {
        super(nombre, apellido, claveEmpleado, salario);
    }

    public EmpleadoHonorarios(int horas, String nombre, String apellido, String claveEmpleado, double salario) {
        super(nombre, apellido, claveEmpleado, salario);
        this.horas = horas;
    }
    
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public double calcularSalario() {
        return getSalario() * (1+(antiguedad() * 0.1));
    }

    @Override
    public String toString() {
        String resu = super.toString() + "\n" +
                "Horas: " + horas + "\n" +
                "Antiguedad: " + antiguedad() + "\n" + 
                "Salario: " + calcularSalario();
        return resu;
    }
    
       
    
}
