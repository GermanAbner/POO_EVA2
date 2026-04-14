/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica15_final;

/**
 *
 * @author Usuario
 */
public class EVA2_Practica15_FINAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Empleado empleado = new Empleado(); 
    }
    
}
class Persona{
    private String nombre;
    public Persona(){
        nombre = "";
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}

final class Empleado extends Persona{ // ya no se puede heredar de Empleado
    private String puesto;
        public Empleado(){
            puesto = "";
    }

    public Empleado(String puesto) {
        this.puesto = puesto;
    }

    public Empleado(String puesto, String nombre) {
        super(nombre);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
        
}

//class CEO extends Empleado{ //FINAL LIMTA LA HERENCIA
    
//}