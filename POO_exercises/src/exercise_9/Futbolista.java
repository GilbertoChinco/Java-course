
package exercise_9;
public class Futbolista extends Persona{
    private int Dorsal;
    private String Posicion;
    
    public Futbolista(String Nombre, int Edad, String Apellido, int Dorsal, String Posicion){
        super(Nombre, Edad, Apellido);
        this.Dorsal = Dorsal;
        this.Posicion = Posicion;
    }
    
    public int getDorsal(){
        return Dorsal;
    }
    
    public String getEstrategia(){
        return Posicion;
    }
    
    @Override
    public String toString(){
    return "Datos: " + super.toString() + "\nNumero Camiseta: " + Dorsal + "\nPosicion: " + Posicion;
    }
}
