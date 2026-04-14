/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica16_polimorfismo;

/**
 *
 * @author Usuario
 */
public class EVA2_Practica16_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("CIRCULO");
        Circulo circulo = new Circulo(150);
        imprimir(circulo);
        System.out.println("Rectangulo");
        Rectangulo rectangulo = new Rectangulo(20,30);
        imprimir(rectangulo);
        //ARREGLO DE FIGURAS
        FIguras[] figuras = new FIguras[10];
        //Figuras[0] = new FIguras(); MAAALLLL
        figuras [0] = new Circulo(10);
        figuras [1] = new Rectangulo(10,20);
        figuras [2] = new Circulo(30);
        figuras [3] = new Rectangulo(10,20);
        figuras [4] = new Rectangulo(10,20);
        System.out.println("ARREGLO DE FIGURAS: ");
        
        for (int i = 0; i < figuras.length; i++) {
            imprimir(figuras[i]);
        }
    }
    

public static void imprimir(FIguras figura){
    System.out.println("Area: " + figura.calcularArea());
    System.out.println("Perimetro: " + figura.calcularPerimetro());
    
}
}