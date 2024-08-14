/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Calculos {
    public static void main(String[] args) {
        Circulo circ =new Circulo(3.5);
        Cuadrado cuad = new Cuadrado(10.2);
        System.out.println("El perimetro del circulo es : "+circ.perimetro());
        System.out.println("El perimetro del cuadrado es: "+cuad.perimetro());
        System.out.println("El area del circulo es: "+circ.area());
        System.out.println("El area del cuadrado es: "+cuad.area());
    }
}
