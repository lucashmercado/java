/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distancia;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Prueba2 {
    public static void main(String[] args) {
        double millasUs;
        System.out.print("Ingrese la cantidad de millas a convertir : ");
        Scanner leer = new Scanner(System.in);
        millasUs=leer.nextDouble();
        
        Distancia d1 = new Distancia();
        System.out.println("la distancia en mts es : " +d1.millasAMts(millasUs));
        System.out.println("La distancia en km es : "+d1.millasAKm(millasUs));
    }
}
