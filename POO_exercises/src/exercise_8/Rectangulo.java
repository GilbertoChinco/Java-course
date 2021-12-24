
package exercise_8;

public class Rectangulo extends Poligono{
    private double lado_1;
    private double lado_2;

    public Rectangulo(double lado_1, double lado_2) {
        super(2);
        this.lado_1 = lado_1;
        this.lado_2 = lado_2;
    }

    public double getLado_1() {
        return lado_1;
    }

    public double getLado_2() {
        return lado_2;
    }

    @Override
    public String toString() {
        return "Rectangulo: \n" + super.toString() + "\nlado_1=" + lado_1 + ", lado_2=" + lado_2 + '}';
    }
    
    @Override
    public double area(){
        return lado_1 * lado_2;
    }
}
