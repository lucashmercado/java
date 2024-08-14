/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumno;


import java.util.Random;

/**
 *
 * @author Administrador
 */
public class Alumnos {
    public static void main(String[] args) {
        
        Random azar = new Random ();
        
        //Nombres 
        String nombres [] = new String [5];
        
        nombres[0]= "Juan Perez";
        nombres[1]= "Lucas Mercado";
        nombres[2]= "Pedro Pedroso";
        nombres[3]= "Leo Messi";
        nombres[4]= "Emiliano Martinez";
        
       //Cantidad de materias
       int cantMaterias[] = new int [5];
       
       for (int i=0;i<cantMaterias.length;i++){
           cantMaterias[i]=azar.nextInt(4)+1;
       }
       
       //Almacen de notas de cada materia
       
       int [][] almacen =new int [5][];
       almacen[0]=new int [cantMaterias[0]] ;
       almacen[1]=new int [cantMaterias[1]]  ;
       almacen[2]=new int [cantMaterias[2]]  ;
       almacen[3]=new int [cantMaterias[3]] ;
       almacen[4]=new int [cantMaterias[4]]  ;
       
   
       for(int i=0;i<almacen.length;i++){
          for(int j=0 ; i<almacen[i].length;i++){
              almacen[i][j]=azar.nextInt(10)+1;
          }
      }
     //guardar fila y columna en un vector
        int prom[]= new int [5];
     int sumFila=0;
  
      for(int i=0;i<almacen.length;i++){
          for(int j=0 ; i<almacen[i].length;j++){
              sumFila = (sumFila+almacen[i][j]);
          prom[i]= sumFila/j;
            }          
        }
         for (int i=0;i<nombres.length;i++){
           System.out.println("el alumno" +nombres[i]);
       }
    }       
}