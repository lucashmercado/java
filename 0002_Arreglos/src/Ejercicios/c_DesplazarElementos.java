/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 * En este ejercicio vamos a desplazar una posición todos los elementos de
 * un arreglo (el último pasaría al primer lugar)
 * @author Luis
 */
public class c_DesplazarElementos {
  public static void main(String[] args) {
    int[] vector = {1,2,3,4,5,6,7,8,9,10};
    //Resguardo el valor del último elemento
    int ultimo = vector[vector.length-1];
    
    //Recorro el vector de abajo hacia arriba y voy desplazando
    for(int i=(vector.length-2); i>=0; i--){
      vector[i+1] = vector[i];
    }
    //Coloco el elemento resguardado en el primer lugar del arreglo
    vector[0] = ultimo;
    
    //Muestro
    for(int i=0; i<vector.length; i++){
      System.out.print(vector[i] + " ");
    }
    System.out.println("");
    
    
  }
}
