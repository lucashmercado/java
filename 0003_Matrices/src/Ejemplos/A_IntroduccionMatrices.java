/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 * Introducción a Matrices
 * (Después de diseñar el programa y probarlo, ejecutarlo con debug)
 * Declaración, instanciación e inicialización
 * @author Luis
 */
public class A_IntroduccionMatrices {
  public static void main(String[] args) {
    //Declaración e instanciación de matriz
    int[][] numeros = new int[2][3];
    //Declaración, instanciación e inicialización de otra matriz
    String[][] nombres = {{"Pepe", "Pepa"},{"José", "Luis"},{"Víctor","Ana"}};
    
    //Inicialización básica
    numeros[0][0] = 1;
    numeros[0][1] = 2;
    numeros[0][2] = 3;
    numeros[1][0] = 11;
    numeros[1][1] = 12;
    numeros[1][2] = 13;
    
    System.out.println("Cantidad de filas: " + numeros.length);
    System.out.println("Cantidad de columnas: " + numeros[0].length);
    System.out.println("Primer elemento de la matriz: " + numeros[0][0]);
    System.out.println("Último elemento de la matriz: " + 
            numeros[numeros.length-1][numeros[0].length-1]);
    
    //Cargar en una variable el contenido de un elemento de la matriz
    int num1 = numeros[1][2];
    
    //Mostrar los elementos de una matriz en forma de matriz
    for(int i=0; i<numeros.length; i++){
      for(int j=0; j<numeros[i].length; j++){
        System.out.print(numeros[i][j]+" ");
      }
      System.out.println("");
    }
    
    //Mostrar la otra matriz con un "for each"
    for(String[] fila :nombres){
      for(String columna :fila){
        System.out.print(columna + "\t");
      }
      System.out.println("");
    }
  }
}
