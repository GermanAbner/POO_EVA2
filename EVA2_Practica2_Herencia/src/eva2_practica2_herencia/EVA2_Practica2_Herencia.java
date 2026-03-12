/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica2_herencia;

/**
 *
 * @author Usuario
 */
public class EVA2_Practica2_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Empleado empleado = new Empleado();
    
    Cliente cliente = new Cliente();
    cliente.setNombre("zzddfadfad");
    cliente.getNombre();
    
    }
    
}
class Persona {
    private String Nombre;
    private String Apellido;
    private int edad;
    
    public Persona(){
        Nombre = "";
        Apellido = "";
        edad = 0;
    }

    public Persona(String Nombre, String Apellido, int edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    
}

class Empleado extends Persona{
    private int no_empleado;
    private double salario;

    public int getNo_empleado() {
        return no_empleado;
    }

    public void setNo_empleado(int no_empleado) {
        this.no_empleado = no_empleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
        
}

class Cliente extends Persona{
    
}