/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Lucas
 */
public class Coche extends Vehiculo {
    public int numerosDePuertas;

    public int getNumerosDePuertas() {
        return numerosDePuertas;
    }

    public void setNumerosDePuertas(int numerosDePuertas) {
        this.numerosDePuertas = numerosDePuertas;
    } 

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    /*public Coche (String Marca,String Modelo,int anio,int numerosDePuertas){
        super(Marca,Modelo,anio);
        this.numerosDePuertas = numerosDePuertas;
    }*/
    
   public void abrirPuertas(){
       System.out.println("Abriendo las "+numerosDePuertas +" puertas del coche");
}
   public void encender(){
       System.out.println("Encendiendo el coche "+Marca +Modelo);
   }
@Override
public void conducir(){
    System.out.println("Conduciendo el coche"+Marca +Modelo);
}

    void Marca(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void Modelo(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void anio(Double valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void numerosDePuertas(Double valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }

