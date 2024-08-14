/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restar;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Prueba {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el primer numero a restar : ");
        num1 = leer.nextInt();
        System.out.print("Ingrese el segundo numero a restar : ");
        num2 = leer.nextInt();
        Restar r1 = new Restar ();
        System.out.println("el resultado es : "+r1.cal(num1, num2));
    }
}
