/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Administrador
 */
public abstract class Vehiculo {
    
    
    protected String marca;
    protected String modelo;
    protected int anio;
    
    //creo un constructor
    public Vehiculo(String marca,String modelo,int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    //creo un metodo abstracto
    
    public abstract String conducir();
  
}
