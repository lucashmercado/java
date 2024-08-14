/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author 54116
 */
public class Maquina {
   ImageIcon foto;
   private int contJugador1,contJugador2;

    public int getContJugador1() {
        return contJugador1;
    }

    public void setContJugador1(int contJugador1) {
        this.contJugador1 = contJugador1;
    }

    public int getContJugador2() {
        return contJugador2;
    }

    public void setContJugador2(int contJugador2) {
        this.contJugador2 = contJugador2;
    }
   
    public void jugada (int numAzar, JLabel jugador2){

        switch (numAzar){
            case 1 : 
                foto = new ImageIcon(getClass().getResource("piedra.jpg"));
                jugador2.setIcon(foto);
                break;
                
                case 2 : 
                foto = new ImageIcon(getClass().getResource("papel.jpg"));
                jugador2.setIcon(foto);
                break;
                
                case 3 : 
                foto = new ImageIcon(getClass().getResource("tijera.jpg"));
                jugador2.setIcon(foto);
                break;
        }
    }
  public String ganador (int numAzar,int seleccion) {
      
      
      if (numAzar==seleccion){
          return "empate";
          
      }
     if(numAzar==1 && seleccion==2){
         return "gano jugador 1";
         
     }
     if(numAzar==1 && seleccion==3){
         return "gano jugador 2";
     }
     if(numAzar==2 && seleccion==1){
         return "gano jugador 2";
     }
     if(numAzar==2 && seleccion==3){
         return "gano jugador 1";
     }
     if(numAzar==3 && seleccion==1){
         return "gano jugador 1";
     }
     if(numAzar==3 && seleccion==2){
         return "gano jugador 2";
     }
     return "empate";
  } 
  public int contadorj1(int numAzar,int seleccion){
      if (numAzar==seleccion){
          return contJugador1;
             }
      
     if(numAzar==1 && seleccion==2){
          return contJugador1++;
              }
     
     if(numAzar==2 && seleccion==3){
         return  contJugador1++;
     }
     if(numAzar==3 && seleccion==1){
         return  contJugador1++;
     }
     
   return contJugador1;  
  }
  
  public int contadorj2(int numAzar, int seleccion){
      
       if (numAzar==seleccion){
          return contJugador2;
             }
   if(numAzar==1 && seleccion==3){
         return contJugador2++;
     }
     if(numAzar==2 && seleccion==1){
         return contJugador2++;
     }  
     if(numAzar==3 && seleccion==2){
         return  contJugador2++;
     }
     return contJugador2;
  }
  
  
  
}
