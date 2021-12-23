
package Herency;
public class Estudiante extends Persona{
    private int CodigoEstudiante;
    private float NotaFinal;
    
    public Estudiante(String Nombre, String Apellido, int Edad, int CodigoEstudiante, float NotaFinal){
        super(Nombre, Apellido, Edad);
        this.CodigoEstudiante = CodigoEstudiante;
        this.NotaFinal = NotaFinal;
    }
    
    public void MostrarDatos(){
        System.out.println("Nombre: " + getNombre() + 
                "\nApellido: " + getApellido() + 
                "\nEdad: " + getEdad() + 
                "\nCodigo Estudiante: " + CodigoEstudiante + 
                "\nNota Final: " + NotaFinal);
    }
}
