
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 54116
 */
public class Principal {
     static Scanner sc = new Scanner(System.in);
     static ArrayList<Numeros> numeros = new ArrayList();
   
     public static void main(String[] args) {
        
       leerValores();
       
       
         
    }
  public static void leerValores(){
           
           int num;
           Numeros aux;
           
           System.out.println("Ingrese numeros enteros hasta que ingrese -99 : ");
           num = sc.nextInt();
           
           while(num!=-99){
               System.out.print("Ingrese otro numero : ");
            num=sc.nextInt();
           }
           
           aux = new Numeros ();
           aux.setNum(num);
           numeros.add(aux);
            
           
       } 
}
