package Ejemplos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author EXO
 */
public class a_ArreglosDeEnteros {
  public static void main(String[] args) {
    
    //declarando e instanciando un arreglo
    int[] numeros = new int[4];
    
    //Asignando valor cada posición del arreglo
    numeros[0] = 12;
    numeros[1] = 23;
    numeros[2] = -3;
    numeros[3] = 99;
    
    //Asignando valores mediante una estructura de repetición
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<numeros.length; i++){
      System.out.print("Ingrese un valor para la posición " + i + ": ");
      numeros[i] = sc.nextInt();
    }
    
    //Mostrando los valores mediante una estructura de repetición
    for(int i=0; i<numeros.length; i++){
      System.out.println(numeros[i]);
    }
            
  }
}
