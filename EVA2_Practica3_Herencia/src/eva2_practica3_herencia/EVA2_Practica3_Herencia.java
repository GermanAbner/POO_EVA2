/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica3_herencia;

/**
 *
 * @author Usuario
 */
public class EVA2_Practica3_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("------CLASE ANIMAL--------");
        Animal animal = new Animal();
        animal.comer();
        System.out.println("------CLASE MAMIFERO--------");
        Mamifero mamifero = new Mamifero();
        mamifero.tenerPelo();
        System.out.println("------CLASE PERSONA--------");
        Persona persona = new Persona();
        persona.comer();
        persona.tenerPelo();
        persona.pensar();
        
    }
    
}
class Animal{ // CLASE BASE, SUPERCLASE, CLASE PADRE
    public Animal(){
        System.out.println("Clase Animal");
        
    }
    public void comer(){
        System.out.println("Animal : Comer!!");
    }
}
class Mamifero extends Animal{//CLASE DERIBADA, SUBCLASE, HIJO
    public Mamifero(){
        System.out.println("Clase Mamifero");
    }
        public void tenerPelo(){
            System.out.println("Tener Pelo!!");
        }
        
    }
class Persona extends Mamifero {
    public Persona(){
        System.out.println("Clase Persona");
    }
    public void pensar(){
        System.out.println("Piensa!!");
    }
    
}