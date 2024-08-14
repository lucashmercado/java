/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author EXO
 */
public class d_OrdenamientoPorBurbujaOptimizado {
  public static void main(String[] args) {
    String[] productos = new String[7];
    
    productos[0] = "Calculadora Casio";
    productos[1] = "Notebook Exo";
    productos[2] = "Pendrive Kingstom";
    productos[3] = "Disco Externo Toshiba";
    productos[4] = "Tablet Samsung";
    productos[5] = "Teléfono Celular Iphone";
    productos[6] = "Batería Iphone";
    
    for(int i=0; i<productos.length; i++){
      //El tamaño-1 para que el j+1 no se vaya de rango
      //y el -i es para iterar menos veces porque las últimas posiciones ya
      //están ordenadas
      for(int j=0; j<(productos.length-1-i); j++){
        if(productos[j+1].compareTo(productos[j])<0){
          String auxiliar = productos[j];
          productos[j] = productos[j+1];
          productos[j+1] = auxiliar;
        }
      }
    }
    
    for(int i=0; i<productos.length; i++){
      System.out.println(productos[i]);
    }
  }
}
