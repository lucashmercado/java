/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author Administrador
 */
public class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, int edad,String materia) {
        super(nombre, edad);
    }

    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void ImprimirInformacion(){
        System.out.println("el nombre es : "+nombre);
        System.out.println("la edad es : "+edad);
        System.out.println("la meteria es : "+materia);
       
}
    
}
