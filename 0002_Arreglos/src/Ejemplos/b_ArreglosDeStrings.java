package Ejemplos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Arrays;

/**
 *
 * @author EXO
 */
public class b_ArreglosDeStrings {
  public static void main(String[] args) {
    String[] productos = new String[7];
    
    productos[0] = "Calculadora Casio";
    productos[1] = "Notebook Exo";
    productos[2] = "Pendrive Kingstom";
    productos[3] = "Disco Externo Toshiba";
    productos[4] = "Tablet Samsung";
    productos[5] = "Teléfono Celular Iphone";
    productos[6] = "Batería Iphone";
    
    //Muestro el vector 
    System.out.println("Mostrado con una estructura FOR");
    for(int i=0; i<productos.length; i++){
      System.out.println(productos[i]);
    }
    System.out.println("");
    
    //Ordeno el arreglo mediante la clase Arrays
    Arrays.sort(productos);
    System.out.println("Vector Ordenado");
    
    //Muestro el vector ordenado con un "for each"
    System.out.println("Mostrado con una estructura FOREACH");
    for(String prod: productos){
      System.out.println(prod);
    }
    System.out.println("");
    
    //Muestro el vector mediante un While
    System.out.println("Mostrado con una estructura WHILE");
    int i=0;
    while(i<productos.length){
      System.out.println(productos[i]);
      i++;
    }
    System.out.println("");
    
    //Muestro el vector mediante un do-while
    System.out.println("Mostrado con una estructura DO_WHILE");
    i=0;
    do{
      System.out.println(productos[i]);
      i++;
    }while(i<productos.length);
    System.out.println("");
  }
}
