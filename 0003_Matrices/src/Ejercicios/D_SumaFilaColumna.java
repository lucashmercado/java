/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author EXO
 */
public class D_SumaFilaColumna {
  public static void main(String[] args) {
    int sumaFila=0, sumaColumna=0;
    
    int[][] matriz = {
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };
    
    for(int i=0; i<matriz.length; i++){
      for(int j=0; j<matriz[i].length; j++){
        sumaFila += matriz[i][j];
      }
      System.out.println("Total Fila "+i+": "+sumaFila);
      sumaFila=0;
    }
    
    for(int j=0; j<matriz[0].length; j++){
      for(int i=0; i<matriz.length; i++){
        sumaColumna += matriz[i][j];
      }
      System.out.println("Total Columna "+j+": "+sumaColumna);
      sumaColumna=0;
    }
  }
}
