package Ejemplos;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EXO
 */
public class j_BuscarStringsEnArreglos {
  public static void main(String[] args) {
    String frase[] = {"Hoy", "es", "una", "hermosa", "mañana"};
  
    //Pido la palabra a buscar
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese la palabra a buscar en el arreglo: ");
    String palabra = sc.next();
  
    int i = 0;
    while(i<frase.length && ! frase[i].equalsIgnoreCase(palabra)){
      i++;
    }
    
    if(i==frase.length){
      System.out.println("Palabra no encontrada");
    }
    else{
      System.out.println("Se encontró la palabra en la posición: " + i);
    }
  }
}
