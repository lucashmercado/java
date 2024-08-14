/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero;

/**
 *
 * @author Administrador
 */
public class Cuenta {
    
    protected double saldo =0;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
   public void deposito (double importe) {
       saldo += importe;
   }
   
   
    public void extraccion (double importe){
        if (importe>saldo){
            System.out.println("No tiene fondos suficientes");
        }
        else {
            saldo -= importe;
        }
    }
    
}
