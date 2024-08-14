/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Administrador
 */
public class Coche extends Vehiculo {
    private int numeroPuertas;
    
    public Coche(String marca,String modelo,int anio,int numeroPuertas){
        super(marca,modelo,anio);
        this.numeroPuertas = numeroPuertas;
    }
    
    public String abrirPuertas(){
        return ("Abriendo las " +numeroPuertas +" puertas del coche");
    }
    public String encender (){
        return("Encendiendo el coche "+marca + " "+modelo);
    }
    
    @Override
    public String conducir(){
        return ("Conduciendo el coche "+marca +  " "+modelo);
    }
}
