
package exercise_9;
public class Doctor extends Persona{
    private int years;
    private String Titulacion;

    public Doctor(int years, String Titulacion, String Nombre, int Edad, String Apellido) {
        super(Nombre, Edad, Apellido);
        this.years = years;
        this.Titulacion = Titulacion;
    }

    public int getYears() {
        return years;
    }

    public String getTitulacion() {
        return Titulacion;
    }

    @Override
    public String toString() {
        return "Datos Dr: " + super.toString() + "\nAños de experiencia: " + years + "\nTitulación: " + Titulacion; 
    }
    
    
}