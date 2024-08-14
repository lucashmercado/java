/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas;

import java.util.Random;

/**
 * Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango 
 * de 1 a 9). Escriba un programa que imprima el n�mero que tiene m�s 
 * ocurrencias en el arreglo y tambi�n imprimir la cantidad de veces que aparece 
 * en el arreglo.
 * @author Luis
 */
public class MayorOcurrencia {
  public static void main(String[] args) {
    //Declaro dos vectores de 10 elementos
    int[] vectorNumeros = new int[10];
    int[] vectorOcurrencias = new int[10];
    //Inicializa el vector de n�meros con n�meros al azar entre 1 y 9
    Random random = new Random();
    for(int i=0; i<vectorNumeros.length; i++){
      vectorNumeros[i] = random.nextInt(9)+1;
      //Cuento la ocurrencia en el otro vector
      vectorOcurrencias[vectorNumeros[i]]++;
      //Muestro el n�mero
      System.out.print(vectorNumeros[i]+" ");
    }
    System.out.println("");
    
    //Recorro el vector de ocurrencias para ver cu�l es la m�s alta
    int mayorOcurrencia=0;
    int numeroMasOcurrente=0;
    for(int i=0; i<vectorOcurrencias.length; i++){
      if (vectorOcurrencias[i]>mayorOcurrencia){
        mayorOcurrencia=vectorOcurrencias[i];
        numeroMasOcurrente=i;
      }
    }
    
    //Muestro resultados
    System.out.println("La mayor cantidad de ocurrencias es: "+mayorOcurrencia);
    System.out.println("El n�mero con m�s ocurrencias es: "+ numeroMasOcurrente);
  }
}
