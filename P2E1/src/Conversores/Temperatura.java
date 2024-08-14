/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversores;

/**
 *
 * @author EXO
 */
public class Temperatura {
  //Atributos
  private double gCelsius;
  private double gFaren;

  public double getgCelsius() {
    return gCelsius;
  }

  public void setgCelsius(double gCelsius) {
    this.gCelsius = gCelsius;
  }

  public double getgFaren() {
    return gFaren;
  }

  public void setgFaren(double gFaren) {
    this.gFaren = gFaren;
  }
  
  public double celsiusToFarenheit(double c){
    //Celsius a Farenheit: F = (1,8) x C + 32
    gFaren = 1.8*c+32;
    return gFaren;
  }
  
  public double farenheitToCelsius(double f){
    //Farenheit a Celsius: C = (F ? 32) / 1,8 
    gCelsius = (f-32)/1.8;
    return gCelsius;
  }
}
