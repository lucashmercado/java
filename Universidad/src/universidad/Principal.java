/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author Administrador
 */
public class Principal {
    public static void main(String[] args) {
        Persona[] personas = new Persona[3];
        personas [0] = new Profesor("juan",40,"matematicas");
        personas[1] = new Estudiante("maria",20,"Ingenieria");
        personas[2] = new Estudiante("pedro",22,"Medicina");
        
        for(Persona persona : personas){
            if (persona instanceof Profesor){
                //persona.ImprimirInformacion y automaticamente sale asi
                ((Profesor) persona).ImprimirInformacion();
            } else if (persona instanceof Estudiante){
                ((Estudiante) persona).ImprimirInformacion();
            }
        }
    }
    
}
