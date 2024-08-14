/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 * Matrices con cantidad fija de filas pero variable de columnas
 * @author EXO
 */
public class B_ColumnasVariables {
  public static void main(String[] args) {
    int[][] matriz = new int[3][];
    
    //Instancio las columnas de cada fila
    matriz[0] = new int[2];
    matriz[1] = new int[3];
    matriz[2] = new int[4];
    
    //Muestro las dimensiones de la matriz
    System.out.println("Dimensión de la matriz (filas): " + matriz.length);
    System.out.println("Dimensión fila 0: " + matriz[0].length);
    System.out.println("Dimensión fila 1: " + matriz[1].length);
    System.out.println("Dimensión fila 2: " + matriz[2].length);
    
    //Recorro la matriz (van a ser todos ceros pero lo que quiero mostrar es
    //la estructura
    for(int i=0; i<matriz.length; i++){
      for(int j=0; j<matriz[i].length; j++){
        System.out.print(matriz[i][j]+ "\t");
      }
      System.out.println("");
    }
  }
}
