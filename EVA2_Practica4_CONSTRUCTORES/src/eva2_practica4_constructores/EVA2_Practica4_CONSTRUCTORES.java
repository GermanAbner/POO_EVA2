/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica4_constructores;

/**
 *
 * @author Usuario
 */
public class EVA2_Practica4_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Empleado empleado1 = new Empleado(123);
        
    }
    
}
class Persona{ // BASE, SUPER CLASE, PADRE
    public Persona(){
        System.out.println("Clase Persona");
    }
    public Persona(String mensaje){
        mensaje = "oals";
        System.out.println(mensaje);
    }
}
class Empleado extends Persona{ // DERIVADA, SUBCLASE, HIJO
    //SUPER --> ACCESO A LO PUBLICO O PROTEGIDO DE LA SUPERCLASE
    public Empleado(){
        /*SUPER SIGNIFICA SUPER CLASE OSEA QUE VA A AGARRAR LA CLASE BASE/PADRE OMG*/super(); //CONSTRUCTOR DE LA SUPER CLASE
        }
    public Empleado(int salario){
        System.out.println("Empleado: Constructor con argumentos");
    }
    public Empleado(String mensaje){
        super(mensaje);
    }
}