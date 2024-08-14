/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numerosOrdenados;

/**
 *
 * @author Administrador
 */
public class clases {
    
    public String orden(int a, int b,int c){
        if (a < b && a < c) {
                    return "los numeros estan ordenador de menor a mayor";
                } else {
                    return "los numeros no estan ordenador de menor a mayor";
                }
    }
    
    public String consecutivos(int a, int b,int c){
        if (b - 1 == a && c - 1 == b) {
                    return "los numeros son consecutivos";
                } else {
                    return "los numeros no son consecutivos";
                }
    }
}
