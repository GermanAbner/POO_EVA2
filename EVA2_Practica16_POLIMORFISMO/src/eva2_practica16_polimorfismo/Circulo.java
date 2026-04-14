/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica16_polimorfismo;

/**
 *
 * @author Usuario
 */

            //CIRCULO ES un(a) figura
public class Circulo implements FIguras{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    public Circulo() {
        this.radio = 0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return (Math.PI * radio*radio);
        
    }

    @Override
    public double calcularPerimetro() {
        return (Math.PI );
    }
    
}
