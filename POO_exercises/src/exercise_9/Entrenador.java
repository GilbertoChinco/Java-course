
package exercise_9;
public class Entrenador extends Persona{
    private String Estrategia;

    public Entrenador(String Estrategia, String Nombre, int Edad, String Apellido) {
        super(Nombre, Edad, Apellido);
        this.Estrategia = Estrategia;
    }

    public String getEstrategia() {
        return Estrategia;
    }

    @Override
    public String toString() {
        return "Datos Entrandor: " + super.toString() + "\nEstrategia: " + Estrategia; 
    }
    
    
}
