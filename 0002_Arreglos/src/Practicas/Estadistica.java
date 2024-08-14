/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas;

import java.util.Scanner;

/**
 * Leer 7 números por teclado para llenar un arreglo y a continuación calcular 
 * el promedio de los números positivos, el promedio de los negativos y contar 
 * el número de ceros.
 * @author Luis
 */
public class Estadistica {
  public static void main(String[] args) {
    //Declaro e inicializo el arreglo y los contadores/acumuladores
    int[] vector = new int[7];
    int sumPositivos, sumNegativos, cantPositivos, cantNegativos, cantCeros;
    double promPositivos, promNegativos;
    sumPositivos=0;
    sumNegativos=0;
    cantPositivos=0;
    cantNegativos=0;
    cantCeros=0;
    promPositivos=0.0;
    promNegativos=0.0;
    
    //Lleno el arreglo con números leídos por teclado
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<vector.length; i++){
      System.out.print("Ingrese valor para posición "+i+": ");
      vector[i] = sc.nextInt();
      //Verifico si es positivo, negativo o cero, lo cuento y lo acumulo
      if(vector[i]>0){
        cantPositivos++;
        sumPositivos += vector[i];
      }
      else if(vector[i]<0){
        cantNegativos++;
        sumNegativos += vector[i];
      }
      else{
        cantCeros++;
      }
    }
    System.out.println("");
    
    //Calculo Promedios
    if(cantPositivos>0){
      promPositivos = (double)sumPositivos/cantPositivos;
    }
    if(cantNegativos>0){
      promNegativos = (double)sumNegativos/cantNegativos;
    }
    
    //Muestro resultados
    System.out.println("Hay "+cantPositivos+" positivos y el promedio es: "+promPositivos);
    System.out.println("Hay "+cantNegativos+" negativos y el promedio es: "+promNegativos);
    System.out.println("Hay "+cantCeros+" ceros ");
  }
 
}
