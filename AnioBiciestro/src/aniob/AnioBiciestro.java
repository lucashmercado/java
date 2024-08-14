/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aniob;

/**
 *
 * @author Administrador
 */
public class AnioBiciestro {
    
    static int anio (int num){
        if ( int num%4 ||(int num%100 && int num%400)){
            return 1;
        }
        return 0;
    }
}
