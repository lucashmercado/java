/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liquidacion;

/**
 *
 * @author Administrador
 */
public class Empleados {
    int dni;
    String nombre;
    float basico,premios,descuentos,cobrar;

    public Empleados(int dni, String nombre, float basico, float premios, float descuentos, float cobrar) {
        this.dni = dni;
        this.nombre = nombre;
        this.basico = basico;
        this.premios = premios;
        this.descuentos = descuentos;
        this.cobrar = cobrar;
    }
}
