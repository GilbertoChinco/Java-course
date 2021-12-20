
package exercise_3;
public class cuadrilatero {
    double lado_1, lado_2;
    double area;
    double perimetro;
    
    public cuadrilatero(double lado_1){
        this.lado_1 = lado_1;
        this.lado_2 = lado_1;
    }
    
    public cuadrilatero(double lado_1, double lado_2){
        this.lado_1 = lado_1;
        this.lado_2 = lado_2;
    }
    
    public double get_area(){
        if(lado_1 != lado_2){
            return lado_1 * lado_2;
        }
        else{
            return lado_1 * lado_1;
        }
    }
    
    public double get_perimetro(){
        if(lado_1 != lado_2){
            return 2 * lado_1 + 2 * lado_2;
        }
        else{
            return 4 * lado_1;
        }
    }
}
