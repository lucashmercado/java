/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareatp1;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class TareaTp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("***BIENVENIDO AL PROGRAMA***");
        System.out.print("Ingrese su Monto: ");
       int saldo = leer.nextInt();
        System.out.println("Importe total de la compra: "+saldo);
        System.out.println("IVA: "+.21*saldo);
        System.out.println("Importe total a pagar: "+1.21*saldo);
    }
    
}
