/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Administrador
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int[] num = new int[7];
        int mayor=0;
        
        num[0] = 22 ;
        num[1] = 17 ;
        num[2] = 33;
        num[3] = 10 ;
        num[4] = 11 ;
        num[5] = 100 ;
        num[6] = 26 ;

        for (int i=0; i<num.length; i++){
            if(num[i]>mayor){
                mayor=num[i];
            }
        }
        System.out.println("el num mayor es : "+mayor);
    }
}
