/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 * Buscar un elemento dentro de la matriz y mostrar sus coordenadas
 * @author Luis
 */
public class C_BuscarNumero {
  public static void main(String[] args) {
    //Creo una matriz de enteros de la forma simplificada
    int[][] enteros = {
      {23, 747, 574, 3633},
      {56, 36, 4543, 344},
      {744, 374, 364,222}
    };
    
    int i, j=0; //Las declaro acá para poder usarlas luego
    int elementoBuscado = 4543;
    boolean encontrado = false;
    
    buscar: for(i=0; i<enteros.length; i++){
      for(j=0; j<enteros[i].length; j++){
        if (enteros[i][j]==elementoBuscado){
          encontrado = true;
          break buscar;
        }
      }
    }  
      if(encontrado==true){
        System.out.println("El elemento "+elementoBuscado+" se encontró en las"
                + "coordenadas "+i+","+j);
      }
      else{
        System.out.println("Elemento no encontrado");
      }
  }
}

