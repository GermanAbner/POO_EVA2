/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica17_polimorfismo;

/**
 *
 * @author Usuario
 */
public class EVA2_Practica17_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cliente cliente = new Cliente("ASDF31545",10000,"Restaurante La Cucaracha Crocante","",50);
        System.out.println(cliente.generarDatos());
        System.out.println("");
        Empleado empleado = new Empleado("Gerente",10000,"Restaurante La Cucaracha Crocante","",20);
        System.out.println(empleado.generarDatos());
        System.out.println("");
        //CLIENTE Y EMPLEADO SON PERSONAS (SE DERIVAN DE LA CLASE PERSONA)
       Persona persona;
       persona = cliente;
       Persona persona2;
       persona2= empleado;
        System.out.println(persona.generarDatos());
       //int x = "Hola";
        System.out.println("EMPLEADO EN UNA VARIABLE DE TIPO PERSONA");
        System.out.println(persona2.generarDatos());
       imprimirDatos(cliente);
       imprimirDatos(empleado);
       
       Persona perso = new Persona("Pedro","",2020);
       imprimirDatos(perso);
       //CASTING 
       //REGRESAR LAS VARIABLES DE TIPO PERSONA A SU CLASE ORIGINAL
       Cliente clienteOriginal;
       clienteOriginal = (Cliente)persona; //DENTRO DE PERSONA HAY UN OBJETO DE TIPO CLIENTE POR ESO SE PUEDE HACER EL CASTING  
       //en caso de que no sepas saber que es el cast usa instanceof asi de pelada papa
       
       
       
    }//ES UN DISFRAZ ASIQ LE TIRA UN PARO AUNQUE NO SEA oomgmogmogmogmgogmog
    public static void imprimirDatos(Persona perso){
        System.out.println(perso.generarDatos());
        if (perso instanceof Cliente) {
            System.out.println("Cliente");}
        else if(perso instanceof Empleado) {
                    System.out.println("Empleado");}
        else if(perso instanceof Persona){
            System.out.println("Persona");}
   
}
        }
    

