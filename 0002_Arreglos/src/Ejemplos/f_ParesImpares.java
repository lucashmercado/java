/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class f_ParesImpares {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] todos, pares, impares;
        todos = new int[10];
        
        int totalPares=0, totalImpares=0;
        //Lleno el vector original
        for(int i=0; i<todos.length; i++){
            todos[i]=s.nextInt();
            //Verifico si el número ingresado es par o impar
            if(todos[i]%2==0){
                totalPares++;
            }
            else{
                totalImpares++;
            }
        }
        
        //Inicializo los otros dos vectores
        pares = new int[totalPares];
        impares = new int[totalImpares];
        
        /* Vuelvo a recorrer el vector original y voy cargando los otros dos
        vectores (declaro dos variables de control) */
        int j=0, k=0;
        for(int i=0; i<todos.length;i++){
            if(todos[i]%2==0){
                pares[j++]=todos[i];
            }
            else{
                impares[k++]=todos[i];
            }
        }
        
        // Ahora muestro en pantalla los 3 vectores
        System.out.println("Vector Original");
        for(int i=0; i<todos.length; i++){
            System.out.print(todos[i]+" ");
        }
        System.out.println("");
        System.out.println("Vector Pares");
        for(int i=0; i<pares.length; i++){
            System.out.print(pares[i]+" ");
        }
        System.out.println("");
        System.out.println("Vector Impares");
        for(int i=0; i<impares.length; i++){
            System.out.print(impares[i]+" ");
        }
        System.out.println("");
    }
}
