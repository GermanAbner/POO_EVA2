/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica8_asbtract;

/**
 *
 * @author a
 */
public class Circulo extends Figuras{
    
    private double radio;

    public Circulo() {
        radio = 0;
    }
    
    

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * (radio * radio);
    }
    
    @Override
    public String toString() {
        return "Bienvenido a la calculadora de areas y perimetros del CIRCULO" + "\n" +
                "CIRCULO\n" + 
                "Radio: " + radio + "\n" + 
                "Area: " + calcularArea() + "\n" +
                "Perimetro: " + calcularPerimetro();
    }
    
}
