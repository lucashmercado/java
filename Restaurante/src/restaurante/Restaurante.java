/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author Lucas
 */
public class Restaurante{
    
    private int numDocenasHuevos;
    private double kilosChorizo;

    // Constructor
    public Restaurante(int numDocenasHuevos, double kilosChorizo) {
        this.numDocenasHuevos = numDocenasHuevos;
        this.kilosChorizo = kilosChorizo;
    }

    // Métodos de incremento de existencias


    public int addHuevos(int numDocenas) {
       return this.numDocenasHuevos += numDocenas;
         
    }

    public double addChorizos(double kilosChorizo) {
        return this.kilosChorizo += kilosChorizo;
    }

    // Método para calcular el número de platos de huevos con chorizo disponibles
    public int getNumPlatos() {
        int numPlatos = Math.min(this.numDocenasHuevos * 12 / 2, (int) (this.kilosChorizo * 1000 / 200));
        return numPlatos;
    }

    // Método para servir un plato de huevos con chorizo
    public void sirvePlato() {
        if (this.numDocenasHuevos >= 2 && this.kilosChorizo >= 0.2) {
            this.numDocenasHuevos -= 2;
            this.kilosChorizo -= 0.2;
        }
    }

    // Métodos para obtener el número de huevos y kilos de chorizo disponibles
    public int getHuevos() {
        return this.numDocenasHuevos * 12;
    }

    public double getChorizo() {
        return this.kilosChorizo;
    }
}