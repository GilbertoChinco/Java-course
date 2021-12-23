
package Herency;
public class Persona {
    private String Nombre;
    private String Apellido;
    private int Edad;
    
    public Persona(String Nombre, String Apellido, int Edad){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
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
}
