
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int num,i,j;
        Scanner asterisco  = new Scanner(System.in);
        System.out.println("Ingrese cantidad de filas: ");
        num = asterisco.nextInt();
        for(i=0;i<num;i++){
            for(j=0;j<num;j++){
            System.out.print("*");
                        }
            System.out.println("");    
    }
}
    
}
