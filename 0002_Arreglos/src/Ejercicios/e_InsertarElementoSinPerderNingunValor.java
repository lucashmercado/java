/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author EXO
 */
public class e_InsertarElementoSinPerderNingunValor {
  public static void main(String[] args) {
    int[] vector = {1,2,3,4,5,6,7,8,9,10};
    
    System.out.print("Ingrese el elemento a insertar: ");
    Scanner sc = new Scanner(System.in);
    int nuevoValor = sc.nextInt();
    System.out.print("Ingrese la posición a insertar: ");
    int posicion = sc.nextInt();
    
    //Respaldo el último elemento antes de perderlo
    int ultimoElemento = vector[vector.length-1];
    
    //Muevo los elementos a partir de la posición a insertar
    for(int i=vector.length-2; i>=posicion; i--){
      vector[i+1] = vector[i]; 
    }
    //Coloco el valor nuevo en la posicion
    vector[posicion] = nuevoValor;
    //Declaro un nuevo vector con una posición más
    int[] vector2 = new int[vector.length+1];
    //Copio los elementos de un vector a otro, dejando libre la última posición
    System.arraycopy(vector, 0, vector2, 0, vector.length);
    //Agrego el último elemento (estaba respaldado)
    vector2[vector2.length-1] = ultimoElemento;
    //Muestro el vector más grande
    for(int i=0; i<vector2.length; i++){
      System.out.println(i + "=> " + vector2[i]);
    }
  }
}
