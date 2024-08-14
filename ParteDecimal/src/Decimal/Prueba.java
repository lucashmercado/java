/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decimal;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Prueba {
    public static void main(String[] args) {
        double num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingerse un numero : ");
        num = leer.nextDouble();
        if(num==Math.round(num)){
            System.out.println("No tiene fraccionaria");
        }else {
            System.out.println("Tiene fraccionaria");
        }
    }
}
