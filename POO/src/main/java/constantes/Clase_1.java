
package constantes;
public class Clase_1 {
    //Para hacer uso de constante se utiliza la palabra final
    private final String nombre;
    private int edad;
    
    //Constructor
    public Clase_1(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrar_datos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }
    
    public void set_edad(int edad){
        this.edad = edad;
    }
    
    public int get_edad(){
        return edad;
    }
}
