
package exercise_8;

public abstract class  Poligono {
    protected int NumeroLados;

    public Poligono(int NumeroLados) {
        this.NumeroLados = NumeroLados;
    }

    public int getNumeroLados() {
        return NumeroLados;
    }

    @Override
    public String toString() {
        return "NumeroLados = " + NumeroLados;
    }
    
    public abstract double area();
}
