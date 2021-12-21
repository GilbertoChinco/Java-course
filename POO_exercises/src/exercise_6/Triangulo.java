
package exercise_6;
public class Triangulo {
    private double Area;
    private double Perimetro;
    private double lado_1;
    private double lado_2;
    private double lado_3;
    
    //Equilatero
    public Triangulo(double lado_1){
        this.lado_1 = lado_1;
        this.lado_2 = lado_1;
        this.lado_3 = lado_1;
    }
    
    //Isosceles
    public Triangulo(double lado_1, double lado_2){
        this.lado_1 = lado_1;
        this.lado_2 = lado_2;
        this.lado_3 = lado_2;
    }
    
    //Escaleno
    public Triangulo(double lado_1, double lado_2, double lado_3){
        this.lado_1 = lado_1;
        this.lado_2 = lado_2;
        this.lado_3 = lado_3;
    }
    
    public double Get_Perimetro(){
        Perimetro = lado_1 + lado_2 + lado_3;
        return Perimetro;
    }
    
    public double Get_Area(){
        double s = (lado_1 + lado_2 + lado_3) / 2;
        double a = s * (s - lado_1) * (s - lado_2) * (s - lado_3);
        Area = Math.pow(a, 0.5);
        return Area;
    }
    
    public void get_Datos(){
        System.out.println("Area: " + Area);
        System.out.println("Perimetro: " + Perimetro);
    }
}
