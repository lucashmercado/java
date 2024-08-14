/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class PruebaTemperatura {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        Temperatura temp = new Temperatura();
        System.out.println("Ingrese la opcion deseada");
        System.out.println("1 : Convertir de grados Celcius a farenheit");
        System.out.println("2 : Convertir de grados farenheit a celcius");
        System.out.print("Opcion : ");
        

        int num=leer.nextInt();
        if (num==1){
            System.out.print("Ingrese los grados a convertir : ");
            int num2=leer.nextInt();
                 //  double farenheit = temp.celsiusToFarenheit(num2);
        System.out.println(num2+" grados Celsius son " + temp.celsiusToFarenheit(num2) + " grados Fahrenheit"); 
        }
            
        if (num==2){
            System.out.print("Ingrese los grados a convertir : ");
            int num3=leer.nextInt();

        double celsius = temp.farenheitToCelsius(num3);
        System.out.println(num3+" grados Fahrenheit son " + celsius + " grados Celsius");
    }else {
            System.out.println("Opcion incorrecta");
        }
        }
}
