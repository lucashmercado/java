
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Codigo {
    public static void main(String[] args) {
        
        //declaro e instancio un objeto arrayList
        
        ArrayList al = new ArrayList ();
        
       //cargamos elementos 
       
       al.add(5);
       al.add(7.4f);
       al.add("pepe");
       
       //muestro la cantidad de elementos
       
        System.out.println("Cantidad de elementos: "+al.size());
        
        //inserto un elemento en una posicion cualquiera
        
        al.add(0,"miercoles");
        
        //muestro la cantidad de elementos
       
        System.out.println("Cantidad de elementos: "+al.size());
        
        //muestro un elemento determinado
        
        System.out.println("El 3er elemento es: "+al.get(3));
        
        //elimino un elemento
        
        System.out.println("El elemtnto de la pos 2 es : "+al.get(2));
        al.remove(2);
        System.out.println("El elemtnto de la pos 2 es : "+al.get(2));
        
        //Busco y elimino un elemento
        if(al.remove("pepe")){
            System.out.println("se ha eliminado a pepe");  
        }else {
            System.out.println("no se encontro elemento");
        }
        
        //busco un elemento y me informa si existe
        
        if(al.contains("miercoles")){
            System.out.println("elemento encontrado");
            System.out.println("posicion "+al.indexOf("miercoles"));
        }else{
            System.out.println("elemento no encontrado");
        }
        
        //sustituir un elemento por otro
        
        al.set(0,"lunes");
        System.out.println("ahora en la posicion 0 esta : "+al.get(0) );
        
        //Agrego un elemento mas 
        al.add("fin del ArrayList");
        
        //recorro el ArrayList con un for
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        
        //recorro el arraylist con un iterador
        
        Iterator it = al.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        //borro todos los elementos del array
       // al.clear();
       // System.out.println("cantidad de elementos : "+al.size());
        
        
    }
}
