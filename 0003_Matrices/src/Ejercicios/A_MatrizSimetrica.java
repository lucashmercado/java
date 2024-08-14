/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 * Ejemplo: Verificar si una matriz es simétrica
 * @author Luis
 */
public class A_MatrizSimetrica {
  public static void main(String[] args) {
    boolean simetrica = true;
    
    int[][] matriz = {
      {1,2,3,4},
      {2,1,8,5},
      {3,8,1,6},
      {4,5,6,7}
    };
    
    //Recorro la matriz para ver si cumple la simetría
    recorrido: for(int i=0; i<matriz.length; i++){
      for(int j=0; j<matriz[i].length; j++){
        if(matriz[i][j] != matriz[j][i]){
          simetrica = false;
          break recorrido;
        }
      }
    }
    if(simetrica == false){
        System.out.println("La matriz no es simétrica");
      }
      else{
        System.out.println("La matriz es simétrica");
      }
  }
}
