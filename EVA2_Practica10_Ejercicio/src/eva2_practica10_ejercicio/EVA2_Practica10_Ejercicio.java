/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica10_ejercicio;

/**
 *
 * @author Usuario
 */
public class EVA2_Practica10_Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta = new cuentaAhorro("wasd",1000);
        cuenta.mostrarSaldo();
    }
    
}


abstract class Cuenta{
    
    protected String Titular;    
    protected double saldo;

    public Cuenta(String Titular, double Monto) {
        this.Titular = Titular;
        this.saldo = saldo;
    }
    abstract public void retirar(double monto);
    abstract public void mostrarSaldo();
}

class cuentaAhorro extends Cuenta {

    
    public cuentaAhorro(String Titular, double saldo) {
        super(Titular, saldo);
    }

    
    @Override
    public void retirar(double monto) {

        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    
    @Override
    public void mostrarSaldo() {
        System.out.println("Titular: " + Titular);
        System.out.println("Saldo actual: " + saldo);
    }
}