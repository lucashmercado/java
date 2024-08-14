/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 * Ejemplo: Convertir una matriz en su traspuesta
 * @author Luis
 */
public class B_MatrizCuadradaTraspuesta {
  public static void main(String[] args) {
    int[][] matriz = {
      {1,2,3,4},
      {5,6,7,8},
      {9,10,11,12},
      {13,14,15,16}
    };
    
    //Muestro la matriz original
    System.out.println("Matriz Original");
    for(int i=0; i<matriz.length; i++){
      for(int j=0; j<matriz[i].length; j++){
        System.out.print(matriz[i][j]+"\t");
      }
      System.out.println("");
    }
    
    //La convierto en su traspuesta
    //Recorro la matriz solo debajo de la diagonal 
    int aux;
    for(int i=0; i<matriz.length; i++){
      for(int j=0; j<i; j++){
        aux = matriz[i][j];
        matriz[i][j] = matriz[j][i];
        matriz[j][i] = aux;
      }
    }
    
    //Muestro la matriz traspuesta
    System.out.println("\nMatriz Traspuesta");
    for(int i=0; i<matriz.length; i++){
      for(int j=0; j<matriz[i].length; j++){
        System.out.print(matriz[i][j]+"\t");
      }
      System.out.println("");
    }
  }
}
