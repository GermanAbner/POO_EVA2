/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_practica18_composicion;

/**
 *
 * @author Usuario
 */
public class Direccion {
   private String direccion;
   private int numero;
   private String colonia;
   private String ciudad;
   private String cp;

    public Direccion() {
        this.direccion = "";
        this.numero = 0;
        this.colonia = "";
        this.ciudad = "";
        this.cp = "";
    }
    public Direccion(String Direccion, int numero, String colonia, String ciudad, String cp) {
        this.direccion = Direccion;
        this.numero = numero;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.cp = cp;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
}
