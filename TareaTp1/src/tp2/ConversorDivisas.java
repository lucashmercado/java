/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */


public class ConversorDivisas {
    private double tipoCambio;

    public ConversorDivisas() {
        this.tipoCambio = 92.73;
    }

    public ConversorDivisas(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public double dolaresAPesos(double dolares) {
        return dolares * this.tipoCambio;
    }

    public double pesosADolares(double pesos) {
        return pesos / this.tipoCambio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tipo de cambio: ");
        double tipoCambio = scanner.nextDouble();

        ConversorDivisas conversor = new ConversorDivisas(tipoCambio);

        System.out.print("Introduce la cantidad de dólares: ");
        double dolares = scanner.nextDouble();
        System.out.println(dolares + " dólares equivalen a " + conversor.dolaresAPesos(dolares) + " pesos");

        System.out.print("Introduce la cantidad de pesos: ");
        double pesos = scanner.nextDouble();
        System.out.println(pesos + " pesos equivalen a " + conversor.pesosADolares(pesos) + " dólares");

    }
}
