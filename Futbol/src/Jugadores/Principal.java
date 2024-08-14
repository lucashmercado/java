/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jugadores;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Principal {
    
    static Scanner sc = new Scanner(System.in);
   static ArrayList<Jugador> jugadores = new ArrayList();
   
    public static void main(String[] args) {
      cargarJugadores();  
      juveniles();
      puestos();
      ceder();
      goleador();
    }
    public static void cargarJugadores(){
        String apellido;
        int edad;
        String puesto;
        String nacionalidad;
        int goles;
        
        Jugador aux;
        System.out.print("Ingrese apellido del jugador: ");
        apellido=sc.nextLine();
       
        while(!apellido.equalsIgnoreCase("fin")){
            System.out.print("Ingrese EDAD : ");
            edad=sc.nextInt();
            System.out.print("Ingrese puesto P-D-M-A: ");
            sc.nextLine();
            puesto=sc.nextLine();
            System.out.print("Ingrese nacionalidad (argentina - extranjera): ");
            nacionalidad=sc.nextLine();
            System.out.print("Ingrese goles: ");
            goles=sc.nextInt();

            aux= new Jugador ();
            aux.setApellido(apellido);
            aux.setEdad(edad);
            aux.setPuesto(puesto);
            aux.setNacionalidad(nacionalidad);
            aux.setGoles(goles);

            jugadores.add(aux);
            sc.nextLine();
            System.out.print("\nIngrese apellido del jugador: ");
            apellido=sc.nextLine();
        }
        

    }
        
    public static void juveniles(){
        System.out.println("\nLos jugadores menor de 23 años son: ");
        for(int i=0;i<jugadores.size();i++){
            if(jugadores.get(i).getEdad()<23){
                System.out.println(jugadores.get(i).getApellido());
            }
        }
    }    
    
    public static void puestos(){
        int por=0;
        int def=0;
        int med=0;
        int ata=0;
        for(int i=0; i<jugadores.size();i++){
            if(jugadores.get(i).getPuesto().equalsIgnoreCase("p")){
                por+=1;
            }
            if(jugadores.get(i).getPuesto().equalsIgnoreCase("d")){
                def+=1;
            }
            if(jugadores.get(i).getPuesto().equalsIgnoreCase("m")){
                med+=1;
            }
            if(jugadores.get(i).getPuesto().equalsIgnoreCase("a")){
                ata+=1;
            }
        }
        
        System.out.println("\nLa cantidad de porteros son : "+por);
        System.out.println("La cantidad de defensores son : "+def);
        System.out.println("La cantidad de mediocampistas son : "+med);
        System.out.println("La cantidad de atacantes son : "+ata);
        
    }
    
    public static void ceder(){
        System.out.println("\nLos jugadores cedidos a sus selecciones son: ");
        for(int i=0;i<jugadores.size();i++){
            if(jugadores.get(i).getNacionalidad().equalsIgnoreCase("extranjera")){
                System.out.println(jugadores.get(i).getApellido());
            }
        }
    }
    
    public static void goleador(){
        int aux=jugadores.get(0).getGoles();
        int aux2=0;
        for(int i=0;i<jugadores.size();i++){
            if(aux<jugadores.get(i).getGoles()){
                aux2= i;
            }
        }
        
        System.out.println("\nEl jugador que mas goles convirtidos fue "+jugadores.get(aux2).getApellido()+" con la "
                + "cantidad de goles de : "+jugadores.get(aux2).getGoles());
    }
    
}
