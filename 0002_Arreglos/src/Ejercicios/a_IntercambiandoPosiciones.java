/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 * Armar 2 vectores. Uno con números del 1 al 10 y otro con esos números pero
 * intercalados: 1°-10°-2°-9°-3°-8°....etc.
 * @author EXO
 */
public class a_IntercambiandoPosiciones {
  public static void main(String[] args) {
    int[] numeros1 = new int[10];
    int[] numeros2 = new int[10];
  
    //Cargo el 1° vector
    for(int i=0; i<numeros1.length; i++){
      numeros1[i] = i+1;
    }
    
    //Cargo el 2° vector
    int j=0;
    for(int i=0; i<numeros1.length/2; i++){
      numeros2[j++] = numeros1[i];
      numeros2[j++] = numeros1[numeros1.length-1-i];
    }
    
    //Muestro el vector resultado
    for(int i=0; i<numeros2.length; i++){
      System.out.println(numeros2[i]);
    }  
  }
}
  
  


