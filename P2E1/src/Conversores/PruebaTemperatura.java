/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversores;

import java.util.Scanner;

/**
 *
 * @author EXO
 */
public class PruebaTemperatura {
  public static void main(String[] args) {
    //Menú de opciones
    System.out.println("1. Convertir de Celsius a Farenheit");
    System.out.println("2. Convertir de Farenheit a Celsius");
    System.out.println("Ingrese una opción:");
    
    Scanner lector = new Scanner(System.in);
    int op = lector.nextInt();
    
    Temperatura conversor = new Temperatura();
    
    if(op==1){
      System.out.print("Ingrese Grados Celsius: ");
      double vCelsius = lector.nextDouble();
      System.out.println("El equivalente en Farenheit es: "+conversor.celsiusToFarenheit(vCelsius));
    }
    else{
      System.out.print("Ingrese Grados Farenheit: ");
      double vFaren = lector.nextDouble();
      System.out.println("El equivalente en Celsius es: "+conversor.farenheitToCelsius(vFaren));
    }
  }
}
