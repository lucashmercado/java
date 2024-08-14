
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author L64-03
 */
public class prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("hola ingresa 1 para abrir : ");
        i = sc.nextInt();
        if(i==1){
             Estadistica estadistica = new Estadistica();
        estadistica.setVisible(true);
        }else {
            System.out.println("no abriste nada");
        }
          
    }
}
