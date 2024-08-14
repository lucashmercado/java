/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Administrador
 */
public class Moto extends Vehiculo{
    
    private boolean tieneCasco;
    
    //Constructor
    public Moto (String marca,String modelo,int anio,boolean tieneCasco){
        super(marca,modelo,anio);
        this.tieneCasco = tieneCasco;
    }
    
    public String encender (){
       return ("Encendiendo la moto"+marca +" " + modelo);
    }
    @Override 
    public String conducir(){
        if(tieneCasco){
            return ("Conduciendo la moto "+marca+" "+modelo);
        }
        else {
            return("Antes de conducir pongase el casco");
        }
    }
}
