
import javax.swing.ImageIcon;
import javax.swing.JLabel;



/**
 *
 * @author EXO
 */
public class Maquina {
    private int slot1, slot2, slot3;
    private int contManzanas=0, contNaranjas=0, contFresas=0, contCerezas=0, contLimones=0, contSandias=0;

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
    
    public void jugada(int numAzar, JLabel slot){
        switch (numAzar){
            case 1:
                ImageIcon icono = new ImageIcon(getClass().getResource("manzana.png"));
                slot.setIcon(icono);
                contManzanas++;
                break;
            case 2:
                ImageIcon icono2 = new ImageIcon(getClass().getResource("naranja.png"));
                slot.setIcon(icono2);
                contNaranjas++;
                break;
            case 3:
                ImageIcon icono3 = new ImageIcon(getClass().getResource("fresa.png"));
                slot.setIcon(icono3);
                contFresas++;
                break;
            case 4:
                ImageIcon icono4 = new ImageIcon(getClass().getResource("cereza.png"));
                slot.setIcon(icono4);
                contCerezas++;
                break;
            case 5:
                ImageIcon icono5 = new ImageIcon(getClass().getResource("limon.png"));
                slot.setIcon(icono5);
                contLimones++;
                break;
            case 6:
                ImageIcon icono6 = new ImageIcon(getClass().getResource("sandia.png"));
                slot.setIcon(icono6);
                contSandias++;
                break;
        }
    }
    
    public double pagos(double saldo, JLabel resultado){
        saldo-=0.5;
        if (contCerezas==2){
            saldo+=3;
            resultado.setText("Ganó 3 euros");
        }
        else if (contSandias==2){
            saldo+=2;
            resultado.setText("Ganó 2 euros");
        }
        else if (contManzanas==2 || contNaranjas==2 || contFresas==2 || contLimones==2){
            saldo++;
            resultado.setText("Ganó 1 euro");
        }
        else if (contCerezas==3){
            saldo+=30;
            resultado.setText("Ganó 30 euros");
        }
        else if(contSandias==3){
            saldo+=20;
            resultado.setText("Ganó 20 euros");
        }
        else if(contFresas==3){
            saldo+=10;
            resultado.setText("Ganó 10 euros");
        }
        else if(contManzanas==3 || contNaranjas==3 || contLimones==3){
           saldo+=5;
           resultado.setText("Ganó 5 euros");
        }
        else{
            resultado.setText("Perdió 0.5 euros");
        }
        contManzanas=0; contNaranjas=0; contFresas=0; contCerezas=0; contLimones=0; contSandias=0;
        return saldo;
    }
}
