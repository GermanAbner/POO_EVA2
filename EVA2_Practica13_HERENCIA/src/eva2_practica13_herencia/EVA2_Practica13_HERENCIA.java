/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica13_herencia;

/**
 *
 * @author Usuario
 */
public class EVA2_Practica13_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
interface Prueba{
    void mostrarMensaje();
}

interface OtraPrueba extends Prueba{
    void mostrarSaludo(String mensaje);
}

class Demostracion implements OtraPrueba{

    @Override
    public void mostrarSaludo(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Hola Mundo!!");
    }
    
}