
package exercise_9;
public class Persona {
    protected String Nombre;
    protected int Edad;
    protected String Apellido;
    
    public Persona(String Nombre, int Edad, String Apellido){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Apellido = Apellido;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public String getApellido(){
        return Apellido;
    }
    
    public int getEdad(){
        return Edad;
    }
    
    @Override
    public String toString(){
        return "\nNombre: " + Nombre + "\nApellido: " + Apellido + "\nEdad: " + Edad;
    }
    
}
