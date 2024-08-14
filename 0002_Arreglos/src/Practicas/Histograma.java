/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas;

import java.util.Random;

/**
 * Escribir un programa que recorra un arreglo y genere un histograma en base a 
 * los valores de este. El arreglo debe contener 12 elementos que corresponden a 
 * números enteros de rango 1 al 6. Un histograma es una representación gráfica 
 * (de puntos o barra) de que tanto un elemento aparece en un conjunto de datos, 
 * es decir debe mostrar la frecuencia para todos los números del 1 al 6, 
 * incluso si no están presente en el arreglo.
 * @author EXO
 */
public class Histograma {
  public static void main(String[] args) {
    //Declaro el vector de números
    int[] vector = new int[12];
    //Declaro el vector de histograma y lo inicializo con cadena nula
    String[] histograma = new String[6];
    for(int i=0; i<histograma.length; i++){
      histograma[i]="";
    }
    
    //Lleno el vector con números al azar entre 1 y 6
    int numAzar;
    Random random = new Random();
    for(int i=0; i<vector.length; i++){
      vector[i] = random.nextInt()*6+1;
      //Por cada ocurrencia pongo un * en el vector de histograma
      histograma[vector[i]-1] += "*";
    }
    
    //Muestro el histograma
    for(int i=0; i<histograma.length; i++){
      System.out.println(i+1+": "+histograma[i]);
    }
    
  }
}
