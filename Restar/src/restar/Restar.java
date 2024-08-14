/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restar;

/**
 *
 * @author Administrador
 */
public class Restar {
    
    public int cal (int num1 , int num2){
        if(num1>num2){
            return num1-num2;
        }else if (num2>num1){
            return num2-num1;
        }else{
            return 0;
        }
    }
}
