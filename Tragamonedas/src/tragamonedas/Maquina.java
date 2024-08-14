/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tragamonedas;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Administrador
 */
public class Maquina {
    private int slot1,slot2,slot3;

    public int getContManzanas() {
        return contManzanas;
    }

    public void setContManzanas(int contManzanas) {
        this.contManzanas = contManzanas;
    }

    public int getContNaranjas() {
        return contNaranjas;
    }

    public void setContNaranjas(int contNaranjas) {
        this.contNaranjas = contNaranjas;
    }

    public int getContFresas() {
        return contFresas;
    }

    public void setContFresas(int contFresas) {
        this.contFresas = contFresas;
    }

    public int getContCerezas() {
        return contCerezas;
    }

    public void setContCerezas(int contCerezas) {
        this.contCerezas = contCerezas;
    }

    public int getContLimones() {
        return contLimones;
    }

    public void setContLimones(int contLimones) {
        this.contLimones = contLimones;
    }

    public int getContSandias() {
        return contSandias;
    }

    public void setContSandias(int contSandias) {
        this.contSandias = contSandias;
    }
    
    private int contManzanas,contNaranjas,contFresas,contCerezas,contLimones,contSandias;

    public int getSlot1() {
        return slot1;
    }

    public void setSlot1(int slot1) {
        this.slot1 = slot1;
    }

    public int getSlot2() {
        return slot2;
    }

    public void setSlot2(int slot2) {
        this.slot2 = slot2;
    }

    public int getSlot3() {
        return slot3;
    }

    public void setSlot3(int slot3) {
        this.slot3 = slot3;
    }
    
    public void jugada(int numAzar,JLabel slot){
        switch(numAzar){
            case 1:
                ImageIcon icono=new ImageIcon (getClass().getResource("manzana.png"));
                slot.setIcon(icono);
                contManzanas++;
                break;
        
        case 2:
        ImageIcon icono2=new ImageIcon (getClass().getResource("limon.png"));
        slot.setIcon(icono2);
        contLimones++;
        break;
        
        case 3:
        ImageIcon icono3=new ImageIcon (getClass().getResource("cereza.png"));
        slot.setIcon(icono3);
        contCerezas++;
        break;
        
        case 4:
        ImageIcon icono4=new ImageIcon (getClass().getResource("naranja.png"));
        slot.setIcon(icono4);
        contNaranjas++;
        break;
        
        case 5:
        ImageIcon icono5=new ImageIcon (getClass().getResource("frutilla.png"));
        slot.setIcon(icono5);
        contFresas++;
        break;
        
        case 6:
        ImageIcon icono6=new ImageIcon (getClass().getResource("sandia.png"));
        slot.setIcon(icono6);
        contSandias++;
        break;
        
        }
    }
    public double pagos(double vSaldo, JLabel cartel){
        
        vSaldo -= 0.5;
       
        if(contNaranjas>1 || contManzanas>1 || contLimones>1 || contFresas>1||contSandias>1 ||contCerezas>1){
            if (contCerezas==3){
            vSaldo+=30;
            cartel.setText("Ganó 30 Euros");
        }else if (contCerezas==2){
            vSaldo +=3;
            cartel.setText("Gano 3 Euros");
        }     
        
        if (contSandias==3){
            vSaldo+=20;
            cartel.setText("Gano 20 Euros");
        }else if (contSandias==2){
            vSaldo +=2;
            cartel.setText("Gano 2 Euros");
        }
        if (contFresas==3){
            vSaldo+=10;
            cartel.setText("Gano 10 Euros");
        }
        if (contNaranjas==3 || contManzanas==3 || contLimones ==3){
            vSaldo+=5;
            cartel.setText("Gano 5 Euros");
        }else if (contNaranjas==2 || contManzanas==2 || contLimones ==2 || contFresas==2){
            vSaldo +=1;
            cartel.setText("Gano 1 Euros");
        }
            
        }else{
            cartel.setText("Perdio 0.5 euro");
        }
        
        contManzanas=0;
        contNaranjas=0;
        contLimones=0;
        contFresas=0;
        contSandias=0;
        contCerezas=0;
        
        return vSaldo;
    }
}
