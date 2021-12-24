
package exercise_8;

public class Triangulo extends Poligono{
    private double lado_1;
    private double lado_2;
    private double lado_3;

    public Triangulo(double lado_1, double lado_2, double lado_3) {
        super(3);
        this.lado_1 = lado_1;
        this.lado_2 = lado_2;
        this.lado_3 = lado_3;
    }

    public double getLado_1() {
        return lado_1;
    }

    public double getLado_2() {
        return lado_2;
    }

    public double getLado_3() {
        return lado_3;
    }

    @Override
    public String toString() {
        return "Triangulo: " + super.toString() + "\nlado_1=" + lado_1 + ", lado_2=" + lado_2 + ", lado_3=" + lado_3 + '}';
    }
    
    @Override
    public double area(){
        double s = (lado_1 + lado_2 + lado_3) / 2;
        return Math.sqrt(s * (s - lado_1) * (s - lado_2) * (s - lado_3));
    }
}
