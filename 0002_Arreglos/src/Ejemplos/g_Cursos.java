/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author EXO
 */
public class g_Cursos {
  public static void main(String[] args) {
    //Declaro en inicializo vectores y acumuladores
    double[] cursoFisica, cursoQuimica, cursoLengua;
    double sumaFisica=0, sumaQuimica=0, sumaLengua=0;
    cursoFisica = new double[7];
    cursoQuimica = new double[7];
    cursoLengua = new double[7];
    
    //Comienzo a llenar vectores
    Scanner sc = new Scanner(System.in);
    System.out.println("Notas de Fí­sica (ingrese 7 notas)");
    for(int i=0; i<cursoFisica.length; i++){
      cursoFisica[i] = sc.nextDouble();
    }
    
    System.out.println("Notas de Quí­mica (ingrese 7 notas)");
    for(int i=0; i<cursoQuimica.length; i++){
      cursoQuimica[i] = sc.nextDouble();
    }
    
    System.out.println("Notas de Lengua (ingrese 7 notas)");
    for(int i=0; i<cursoLengua.length; i++){
      cursoLengua[i] = sc.nextDouble();
    }
    
    //Promedios por Materia
    for(int i=0; i<7; i++){
      sumaFisica += cursoFisica[i];
      sumaQuimica += cursoQuimica[i];
      sumaLengua += cursoLengua[i];
    }
    System.out.println("Promedios por Materia:");
    System.out.println("El promedio de Fí­sica es: " + (sumaFisica/7));
    System.out.println("El promedio de Química es: " + (sumaQuimica/7));
    System.out.println("El promedio de Lengua es: " + (sumaLengua/7));
    
    //Promedio General
    System.out.println("El promedio general es: " + 
            (sumaFisica + sumaQuimica + sumaLengua)/21);
    
    //Promedio por Alumno
    System.out.println("Promedio de un Alumno:");
    System.out.println("Ingrese Ã­ndice de alumno (0 a 7): ");
    int id = sc.nextInt();
    double sumaAlumno = (cursoFisica[id]+cursoQuimica[id]+cursoLengua[id]);
    System.out.println("El promedio del alumno " + id + " es: " + sumaAlumno/3);
    
  }
}
