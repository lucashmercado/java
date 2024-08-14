
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class NewClass {
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
     //guardar fila en un vector
        double prom[]= new double [5];
        prom[0] = 0;
        prom[1] = 0;
        prom[2] = 0;
        prom[3] = 0;
        prom[4] = 0;
        
        int sum=0;
  
      for(int i=0;i<almacen.length;i++){
          for(int j=0 ; i<almacen[i].length;j++){
              sum+=almacen[i][j];
            }
          prom[i] =sum/cantMaterias[i];
          sum=0;
        }
      for(int i=0; i<nombres.length; i++){
            System.out.println("Estudiante: "+nombres[i]);
            System.out.print("Notas: ");
            for(int j=0; j<almacen[i].length; j++){
                System.out.print(almacen[i][j]+" ");
            }
            System.out.println("");
            System.out.println("Promedio: "+prom[i]);
            System.out.println("");
        }/*
         for (int i=0;i<nombres.length;i++){
           System.out.println("el alumno " +nombres[i]+" cantidad de materias "+cantMaterias[i]);
          for(int j=0 ; i<almacen[i].length;i++){
              System.out.println("notas: "+almacen[i][j]);
          }
       }*/
    }
}
