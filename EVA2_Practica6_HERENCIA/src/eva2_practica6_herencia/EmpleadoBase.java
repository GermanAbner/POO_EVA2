/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica6_herencia;

/**
 *
 * @author Usuario
 */
public class EmpleadoBase extends Empleado {
    
    private int annioIngreso;

    public EmpleadoBase(String nombre, String apellido, String claveEmpleado, double salario) {
        super(nombre, apellido, claveEmpleado, salario);
    }

    public int getAnnioIngreso() {
        return annioIngreso;
    }

    public void setAnnioIngreso(int annioIngreso) {
        this.annioIngreso = annioIngreso;
    }

    public EmpleadoBase(int annioIngreso, String nombre, String apellido, String claveEmpleado, double salario) {
        super(nombre, apellido, claveEmpleado, salario);
        this.annioIngreso = annioIngreso;
    }
 public int antiguedad(){
     int anti = 2026 - annioIngreso;
     int quin = anti/5;
     return quin;
 }       

    @Override
    public double calcularSalario() {
        //POR CADA QUINQUENIO, AUMENTAMOS UN 10%
        return getSalario() *((1+ antiguedad()*.1));
    }
 
 
 
}
