package Ejemplos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author EXO
 */
public class c_OrdenamientoPorBurbuja {
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
      for(int j=0; j<productos.length; j++){
        if(productos[i].compareTo(productos[j])<0){
          String auxiliar = productos[i];
          productos[i] = productos[j];
          productos[j] = auxiliar;
        }
      }
    }
    
    for(int i=0; i<productos.length; i++){
      System.out.println(productos[i]);
    }
  }
}
