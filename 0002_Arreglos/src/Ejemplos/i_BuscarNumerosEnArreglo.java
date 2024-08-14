/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author EXO
 */
public class i_BuscarNumerosEnArreglo {
  public static void main(String[] args) {
    int num[] = {10,6,3,8,1,34,76,77,23,9};
  
    //Pido el número a buscar
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el número a buscar en el arreglo: ");
    int numbuscado = sc.nextInt();
  
    int i = 0;
    while(i<num.length && num[i] != numbuscado){
      i++;
    }
    
    if(i==num.length){
      System.out.println("Número no encontrado");
    }
    else{
      System.out.println("Se encontró el número en la posición: " + i);
    }
  }
}
