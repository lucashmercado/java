/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author EXO
 */
public class E_MatrizIdentidadMarco {
   public static void main(String[] args) {

        int[][] matriz = new int[5][5];

        //Creación de la matriz identidad
        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i == j){
                    matriz[i][j] = 1;
                }
            }
        }
        System.out.println("Matriz Identidad");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("");
        //Creación de la matriz marco
        System.out.println("Matriz Marco con Identidad");
        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i == 0 || i == matriz.length - 1
                || j == 0 || j == matriz[i].length -1 || i == j){
                    matriz[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
