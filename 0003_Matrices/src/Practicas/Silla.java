/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas;

import java.util.Scanner;

/**
 * Escribir un programa para una matriz de n x n e imprima en ella una silla 
 * (o letra h minúscula) construida a base del numero 1 y utilizar el numero 0 
 * como espacio. El tamaño de la silla se basa en una variable n que indicará 
 * el tamaño de la figura a imprimir en una matriz de n x n.
 * @author EXO
 */
public class Silla {
  public static void main(String[] args) {
    int[][] silla;
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese la dimensión de la matriz cuadrada: ");
    int n = sc.nextInt();
    silla = new int[n][n];
    
    if(n==0){
      System.out.println("ERROR");
    }
    else{ //Armo la silla
      for(int i=0; i<silla.length; i++){
        for(int j=0; j<silla[i].length; j++){
          silla[i][j]=0;
          
          if(i<(silla.length/2) && j==0){
            silla[i][j] = 1;
          }
          if(i==(silla.length/2)){
            silla[i][j]=1;
          }
          if(i>(silla.length/2) && (j==0 || j==silla[i].length-1)){
            silla[i][j]=1;
          }
        }
        
      }
    } 
    //Muestro la matriz
    for(int i=0; i<silla.length; i++){
      for(int j=0; j<silla[i].length; j++){
        System.out.print(silla[i][j]);
      }
      System.out.println("");
    }
  }
}  
    
      
    
      
    
    
  

