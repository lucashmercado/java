/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author Administrador
 */
public class Estudiante extends Persona {
    private String carrera;
    public Estudiante(String nombre,int edad,String carrera){
        super(nombre,edad);
        this.carrera = carrera;
    }
    
    @Override
    public void ImprimirInformacion(){
        System.out.println("nombre "+nombre);
        System.out.println("edad "+edad);
        System.out.println("carreara"+carrera);
    }
}
