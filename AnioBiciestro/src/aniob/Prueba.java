/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aniob;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Prueba {
    public static void main(String[] args) {
        int num;
    Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el año para saber si es biciestro : ");
        num=leer.nextInt();
        AnioBiciestro a1 = new AnioBiciestro();
        if (a1.anio(num)==1){
            System.out.println("El año es biciestro");
        }else{
            System.out.println("El año no lo es");
        }
    
   
}
}
