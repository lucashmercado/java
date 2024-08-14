/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas;

import java.util.Scanner;

/**
 * Imprimir una X en la matriz
 * @author EXO
 */
public class MatrizX {
  public static void main(String[] args) {
    String[][] matriz;
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese la dimensión de la matriz cuadrada: ");
    int n = sc.nextInt();
    matriz = new String[n][n];
    
    if(n==0){
      System.out.println("ERROR");
    }
    else{
      //Completo en principio la matriz con guiones bajos
      for(int i=0; i<matriz.length; i++){
        for(int j=0; j<matriz[i].length; j++){
          matriz[i][j] = "_";
        }
      }
    
      //Ahora coloco las X
      for(int i=0; i<matriz.length; i++){
        matriz[i][i] = "X";
        matriz[i][matriz[i].length-i-1] = "X";
      }
    
      //Dibujo la matriz
      for(int i=0; i<matriz.length; i++){
        for(int j=0; j<matriz[i].length; j++){
          System.out.print(matriz[i][j]);
        }
        System.out.println("");
      }
      }
    
    
  }
}
