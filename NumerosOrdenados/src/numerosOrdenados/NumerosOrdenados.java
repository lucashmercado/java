/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numerosOrdenados;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
         System.out.println("introduce el valor del primer numero:");
                int a = leer.nextInt();
                System.out.println("introdcue el valor del segundo numero:");
                int b = leer.nextInt();
                System.out.println("introdcue el valor del tercer numero:");
                int c = leer.nextInt();
        clases c1=new clases();
        System.out.println(""+c1.consecutivos(a, b, c));
        System.out.println(""+c1.orden(a, b, c));        
                
            
    }
}
