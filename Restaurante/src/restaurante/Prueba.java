/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author Lucas
 */
public class Prueba {
    public static void main(String[] args) {
        
        // Creamos un objeto Restaurante con 5 docenas de huevos y 2 kilos de chorizo
      
Restaurante miRestaurante = new Restaurante(5, 2);


// Calculamos el número de platos disponibles
        int numPlatos = miRestaurante.getNumPlatos();

        System.out.println("Número de platos disponibles: " + numPlatos);


// Servimos un plato
        miRestaurante.sirvePlato();
        System.out.println("Plato servido. Huevos restantes: " + miRestaurante.getHuevos() +", Chorizo restante: " + miRestaurante.getChorizo());


// Añadimos más huevos y chorizo
        miRestaurante.addHuevos( miRestaurante.addHuevos(2));
        
        miRestaurante.addChorizos(miRestaurante.addChorizos(0.5));
        System.out.println("Existencias añadidas. Huevos restantes: " + miRestaurante.getHuevos() +", Chorizo restante: " + miRestaurante.getChorizo());

// Calculamos el número de platos disponibles de nuevo
        numPlatos = miRestaurante.getNumPlatos();
        System.out.println("Número de platos disponibles: "+numPlatos);
    }
    
}
