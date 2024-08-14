/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Circulo extends Figura {
    private double radio;
    final double PI=3.141592;
    
    //constructor
    public Circulo (double radio){
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double perimetro(){
        return(2*PI*radio);
    }
    @Override
    public double area(){
        return (PI*radio*radio);
    }
}
