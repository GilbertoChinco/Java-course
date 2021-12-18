
package Metodo_Constructor;
public class Persona {
    
    //Atributos
    String nombre;
    int edad;
    
    //Metodo Constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrar_datos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
        
    }
}
