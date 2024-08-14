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
public class Jugador {
    ImageIcon foto;
    
    public void piedra (JLabel jugador1){
        
        foto = new ImageIcon(getClass().getResource("piedra.jpg"));
                jugador1.setIcon(foto);
    }
    public void papel (JLabel jugador1){
        
        foto = new ImageIcon(getClass().getResource("papel.jpg"));
                jugador1.setIcon(foto);
    }
    public void tijera (JLabel jugador1){
        
        foto = new ImageIcon(getClass().getResource("tijera.jpg"));
                jugador1.setIcon(foto);
    }
    
}
