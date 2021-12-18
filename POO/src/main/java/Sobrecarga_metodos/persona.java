
package Sobrecarga_metodos;

public class persona {
    String nombre;
    int edad;
    String dni;
    //metodo  cuando hay más de un constructor 

    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public persona(String dni) {
        this.dni = dni;
    }
    
    public void correr(){
        System.out.println("Soy " + nombre + ", tengo " + edad + " años y estoy corriendo un maraton");
    }
   
    public void correr(int km){
        System.out.println("he corrido " + km + " kilometros");
    }
}
