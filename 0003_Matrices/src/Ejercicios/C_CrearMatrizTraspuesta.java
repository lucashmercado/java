/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 * A partir de una matriz original, crear una matriz traspuesta
 * @author EXO
 */
public class C_CrearMatrizTraspuesta {
  public static void main(String[] args) {
    int[][] matrizOriginal = new int[8][4];
    int[][] matrizTraspuesta = new int[4][8];
    
    //Armo la matriz original
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<matrizOriginal.length; i++){
      for(int j=0; j<matrizOriginal[i].length; j++){
        System.out.print("Fila:"+i+ " Columna:"+j+" ");
        matrizOriginal[i][j] = sc.nextInt();
      }  
      System.out.println("");
    }
    
    //Muestro la matriz original
    System.out.println("Matriz Original");
    for(int i=0; i<matrizOriginal.length; i++){
      for(int j=0; j<matrizOriginal[i].length; j++){
        System.out.print(matrizOriginal[i][j]+"\t");
      }
      System.out.println("");
    }
    
    //Armo la matriz traspuesta
    //Recorro la matriz solo debajo de la diagonal 
    for(int i=0; i<matrizOriginal.length; i++){
      for(int j=0; j<matrizOriginal[i].length; j++){
        matrizTraspuesta[j][i] = matrizOriginal[i][j];
      }
    }
    
    //Muestro la matriz traspuesta
    System.out.println("\nMatriz Traspuesta");
    for(int i=0; i<matrizTraspuesta.length; i++){
      for(int j=0; j<matrizTraspuesta[i].length; j++){
        System.out.print(matrizTraspuesta[i][j]+"\t");
      }
      System.out.println("");
    }
  }
}
