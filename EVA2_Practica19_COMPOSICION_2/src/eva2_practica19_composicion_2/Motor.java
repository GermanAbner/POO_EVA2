/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica19_composicion_2;

/**
 *
 * @author Usuario
 */
public class Motor {
    private String cilindros;
    private char combustible;
                private              double                     capacidad            ;

    public Motor(String cilindros, char combustible, double capacidad) {
        this.cilindros = cilindros;
        this.combustible = combustible;
        this.capacidad = capacidad;
    }

    public String getCilindros() {
        return cilindros;
    }

    public void setCilindros(String cilindros) {
        this.cilindros = cilindros;
    }

    public char getCombustible() {
        return combustible;
    }

    public void setCombustible(char combustible) {
        this.combustible = combustible;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    @Override
    public String toString() {
        return "Motor: " + "\n" +
               "Cilindros: "+ cilindros + "\n" + 
               "Combustible: " + combustible + "\n" +
               "Capacidad: " + capacidad;
    }
}
