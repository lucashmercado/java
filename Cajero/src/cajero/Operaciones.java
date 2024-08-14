/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Operaciones {
    
    public static void main(String[] args) {
        Cuenta cAhorro = new Cuenta();
        CuentaCorriente cCorriente = new CuentaCorriente();
        Scanner opcion = new Scanner(System.in);
        int op,tc;
        System.out.println("1. Caja de ahorro");
        System.out.println("2. Cuenta corriente");
        System.out.println("Ingese tipo de cuenta");
        
        tc=opcion.nextInt();
        while (tc<1||tc>2){
            System.out.println("Opcion Incorrecta. Ingrese Opcion :");
            tc = opcion.nextInt();
        }
        if (tc == 2){
            Scanner desc = new Scanner (System.in);
            System.out.println("Ingrese limite descubierto");
            cCorriente.setDescubierto(desc.nextDouble());
        }
        
        
        
        do{
            System.out.println("");
            System.out.println("Operaciones bancarias");
            System.out.println("1. Ver saldo");
            System.out.println("2. Deposito");
            System.out.println("3. Extraccion");
            System.out.println("4. Salir");
            System.out.println("Ingrese opcion");
             
            op = opcion.nextInt();
        
            //validador
           
            while (op<1 || op>4){
                System.out.println("Opcion ingresada incorrecta. Ingrese opcion :");
                op = opcion.nextInt();
            }
            
            //opcion 1
            if (op ==1){
                if(tc == 1){
                    System.out.println("el saldo de la cuenta es : "+cAhorro.getSaldo());
                }
                else{
                    System.out.println("El saldo de la cuenta es : "+cCorriente.getSaldo());
                }
            }
            //opcion 2
            
            if (op == 2){
                System.out.println("Ingrese importe del deposito :");
                if (tc==1){
                    cAhorro.deposito(opcion.nextDouble());
                }
                else{
                    cCorriente.deposito(opcion.nextDouble());
                }
                System.out.println("Operacion finalizada");
            }
            
            
            //opcion 3
            
            if(op==3){
                System.out.println("ingrese el importe de extraccion :");
                if(tc==1){
                    cAhorro.extraccion(opcion.nextDouble());
                }
                else{
                    cCorriente.extraccion(opcion.nextDouble());
                }
                System.out.println("Operacion Finalizada");
            }
 
        }
        while (op!=4){
               System.out.println("gracias por utilizar nuestros servicios");
           }
    }
}
