/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica14_clases_anonimas;

/**
 *
 * @author Usuario
 */
public class EVA2_Practica14_CLASES_ANONIMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Prueba prueba = new Prueba();
        //CLASE ANONIMA --> CLASE SIN NOMBRE
        //POLIMORFISMO --> HACER QUE ALGO SE COMPORTE COMO ALGO DISTINTO
        Prueba prueba = new Prueba() {
            @Override
            public void mostrarMensaje() {
                System.out.println("Hola mundo!!");
            }
        };
        
        prueba.mostrarMensaje();
    }
    //class UsarPrueba implements Prueba{
    
}
interface Prueba{
    public void mostrarMensaje();
            
}