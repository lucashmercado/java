/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero;

/**
 *
 * @author Administrador
 */
public class CuentaCorriente extends Cuenta{
    private double descubierto = 0;

    public double getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(double descubierto) {
        this.descubierto = descubierto;
    }
    
    //para sobre escribir
    @Override
    public void extraccion (double importe){
        if(importe > (saldo+descubierto)){
            System.out.println("saldo insuficientes");
        }
        else{
            saldo-=importe;
        }
    }
    
}
