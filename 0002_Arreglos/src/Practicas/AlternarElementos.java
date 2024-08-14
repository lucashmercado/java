/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas;

import java.util.Scanner;

/**
 * Leer 10 n�meros enteros desde el teclado para llenar un arreglo de 10 
 * elementos. Luego debemos mostrarlos en el siguiente orden: el �ltimo, el 
 * primero, el pen�ltimo, el segundo, el antepen�ltimo, el tercero, y as� 
 * sucesivamente.
 * @author Luis
 */
public class AlternarElementos {
  public static void main(String[] args) {
    //Declarar y dimensionar arreglo
    int[] vector = new int[10];
    
    Scanner sc = new Scanner(System.in);
    //Leer elementos del arreglo del teclado
    for(int i=0; i<vector.length; i++){
      System.out.print("Ingrese un valor para la posici�n "+i+": ");
      vector[i] = sc.nextInt();
    }
    System.out.println("");
    
    //Los muestro en el orden establecido
    for(int i=vector.length-1; i>=(vector.length/2); i--){
      System.out.print(vector[i]+" "+vector[9-i]+" ");
    }
    System.out.println("");
  }
}
