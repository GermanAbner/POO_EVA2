/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica19_composicion_2;

/**
 *
 * @author Usuario
 */
public class EVA2_Practica19_COMPOSICION_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motor = new Motor("5",'G',1.5);
        Vehiculo vehiculo = new Vehiculo("Ford","Mustang",1970,"Azul",motor);
        System.out.println(vehiculo);
    }
    
}
