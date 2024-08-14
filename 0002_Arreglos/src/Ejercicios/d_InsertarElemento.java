/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 * En este ejercicio vamos a insertar un elemento en una posición determinada
 * desplazando el resto de los elementos hacia abajo (sabiendo que el último
 * elemento se perderá)
 * @author EXO
 */
public class d_InsertarElemento {
  public static void main(String[] args) {
    int[] vector = {1,2,3,4,5,6,7,8,9,10};
    
    //Pregunto por el elemento a insertar y por la posición
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el elemento a insertar: ");
    int elemento = sc.nextInt();
    System.out.print("Ingrese la posición donde se insertará (0 a 9): ");
    int posicion = sc.nextInt();
    //valido que haya ingresado una posición válida
    while(posicion<0 || posicion>=vector.length){
      System.out.print("Posición no válida, sólo de 0 a 9: ");
      posicion = sc.nextInt();
    }
            
    //Recorro el vector de abajo hacia arriba a partir de la posición a
    //insertar y voy desplazando
    for(int i=(vector.length-2); i>=posicion; i--){
      vector[i+1] = vector[i];
    }
    //Coloco el elemento insertado en la posición deseada
    vector[posicion] = elemento;
    
    //Muestro
    for(int i=0; i<vector.length; i++){
      System.out.print(vector[i] + " ");
    }
    System.out.println("");
    
    
  }
}
