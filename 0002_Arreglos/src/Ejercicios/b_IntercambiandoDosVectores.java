/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 * Crear 2 vectores de 5 elementos
 * Crear 1 vector de 10 elementos que combine 1 elemento de cada vector
 * @author EXO
 */
public class b_IntercambiandoDosVectores {
  public static void main(String[] args) {
    int[] a, b, c;
    a = new int[5];
    b = new int[5];
    c = new int[10];
    
    //Cargo el vector a con los números impares
    for(int i=0; i<5; i++){
      a[i] = (i*2)+1;
    }
    //Cargo el vector b con los números pares
    for(int i=0; i<5; i++){
      b[i] = (i*2)+2;
    }
    //Cargo el vector c con un elemento de a y uno de b
    int aux=0;
    for(int i=0; i<5; i++){
      c[aux++] = a[i];
      c[aux++] = b[i];
    }
    //Muestro el vector resultado
    for(int i=0; i<10; i++){
      System.out.println(c[i]);
    }
  }
}
