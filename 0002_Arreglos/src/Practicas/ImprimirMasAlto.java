/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas;

import java.util.Random;

/**
 * Escriba un programa que imprima el número más alto de un arreglo de 7 
 * elementos (de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43}, 
 * si se repite un valor considerar uno solo.
 * @author Luis
 */
public class ImprimirMasAlto {
  public static void main(String[] args) {
    //Declaro e inicializo el arreglo
    int[] vector = new int[7];
    int mayor=0;
    
    //Lleno el arreglo con números al azar entre 11 y 99
    Random random = new Random();
    for(int i=0; i<vector.length; i++){
      vector[i] = random.nextInt(90)+11;
      //Verifico si es el mayor de los ya ingresados y si lo es, lo guardo
      if(vector[i]>mayor){
        mayor = vector[i];
      }
      //Muestro el elemento en pantalla
      System.out.print(vector[i]+" ");
    }
    System.out.println("");
    //Muestro el número mayor
    System.out.println("El número mayor es: " + mayor);
  }
}
