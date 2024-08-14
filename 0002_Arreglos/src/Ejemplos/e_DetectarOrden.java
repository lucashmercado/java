/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class e_DetectarOrden {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean ascendente = false;
        boolean descendente = false;
        int[] vector = new int[5];
        
        //Lleno el vector con enteros
        for(int i=0; i<vector.length; i++){
            vector[i] = s.nextInt();
        }
        
        /* Comparo cada elemento con el siguiente para detectar el orden
        y uso 2 banderas*/
        for(int i=0; i<vector.length-1;i++){
            if(vector[i]<vector[i+1]){
                ascendente = true;
            }
            
            if(vector[i]>vector[i+1]){
                descendente = true;
            }
        }
        
        /* De acuerdo al valor de las banderas determino si est√°n ordenados
        o no, y como est√°n ordenados */
        if(ascendente==false && descendente==false){
            System.out.println("Todos los elementos del vector son iguales");
        }
        
        if(ascendente==true && descendente==false){
            System.out.println("El vector est·° ordenado en forma ascendente");
        }
        
        if(ascendente==false && descendente==true){
            System.out.println("El vector est· ordenado en forma descendente");
        }
        
        if(ascendente==true && descendente==true){
            System.out.println("El vector est· desordenado");
        }
    }
}
