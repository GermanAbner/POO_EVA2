/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica7_ejercicio;

/**
 *
 * @author Usuario
 */
public class EVA2_Practica7_EJERCICIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Triangulo triangulo = new Triangulo(10,5,6,7,8);
        Circulo circulo = new Circulo(4);
        System.out.println("******************************************");
        System.out.println(triangulo.toString());
        System.out.println("******************************************");
        System.out.println(circulo.toString());
        System.out.println("******************************************");   
    }
    
}

class Figuras{
   
    //Metodos que seran sobreescrts omggggggg
    public double calcularArea(){
            return 0;
    }
    public double calcularPerimetro(){
        return 0;
    }
    
    
    public double calcularSalario(){
        return 0;
    }
}

class Triangulo extends Figuras{
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    //Area
    @Override 
    public double calcularArea(){
        return (base * altura)/2;
    }
    
    @Override
    public double calcularPerimetro(){
        return (lado1 + lado2 + lado3);
    }

    @Override
    public String toString() {
        return "Bienvenido a la calculadora de areas y perimetros del TRIANGULO" + "\n" +
                "TRIANGULO\n" +
                "Base: " + base + "\n" + 
                "Altura :" + altura + "\n" + 
                "Area: " + calcularArea() + "\n" +
                "Perimetro: " + calcularPerimetro();
                }    
}

class Circulo extends Figuras{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI * radio; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio*radio;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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