/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 * Eliminamos un elemento del arreglo y acomodamos todas las posiciones
 * Creamos un nuevo arreglo con las posiciones acomodadas
 * @author EXO
 */
public class f_EliminarElementoYMoverPosiciones {
  public static void main(String[] args) {
    int[] vector = {1,2,3,4,5,6,7,8,9,10};
    System.out.print("Ingrese la posición del elemento a eliminar (0-9): ");
    Scanner sc = new Scanner(System.in);
    int posicion = sc.nextInt();
    
    //Comienzo a mover los elementos "hacia arriba" a partir de la posición con
    //el elemento a eliminar
    for(int i=posicion; i<vector.length-1; i++){
      vector[i] = vector[i+1];
    }
    
    //Pongo en cero la última posición
    vector[vector.length-1] =0;
    
    //Genero un nuevo vector con una posición menos y copio todos los valores
    int[] vector2 = new int[vector.length-1];
    System.arraycopy(vector, 0, vector2, 0, vector2.length);
    
    //Podría finalizar "reconstruyendo" el vector original como una copia del
    //segundo vector
    vector = vector2;
    
    //Ahora muestro el vector "reconstruido"
    for(int i=0; i<vector.length; i++){
      System.out.println(i + "=> " + vector[i]);
    }
  }
}
