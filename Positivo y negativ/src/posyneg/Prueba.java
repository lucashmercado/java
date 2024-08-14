/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posyneg;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Prueba {
    public static void main(String[] args) {
            int num1;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un numero");
         num1 = lector.nextInt();
        PosYNeg conversor = new PosYNeg();
        System.out.println("a"+conversor.PositivoONegativo(num1));
        
                
    }
}
