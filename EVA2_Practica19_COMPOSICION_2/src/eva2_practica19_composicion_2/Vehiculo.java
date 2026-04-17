/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica19_composicion_2;

/**
 *
 * @author Usuario
 */                     //  TIENEN PERO NO SON UN MOTOR omgomomgomgomommgomgogomgmgom
public class Vehiculo /*extends motor*/{
    private String marca;
    private String modelo;
    private int annio;
    private String color;
    private Motor motor;
    //HAY QUE CREARLOS PARA USARLOS
    //ACCESO : LOS DATOS ESTAN ENCAPSULADOS, ACCESIBLES A TRAVES DEL OBJETO

    public Vehiculo(String marca, String modelo, int annio, String color, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.annio = annio;
        this.color = color;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Vehiculo:\n" +
               "Marca: " + marca + "\n" +
            "Modelo: " + modelo + "\n" +
            "Annio: " + annio + "\n" +
            "Color: " + color + "\n" +
            "Motor: " + motor;  
    }
}
