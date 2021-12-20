
package exercise_3;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double lado, lado_1, lado_2;
        
        System.out.println("Ingresar el lado de un cuadrado: ");
        lado = input.nextDouble();
        cuadrilatero figura_1 = new cuadrilatero(lado);
        System.out.println("El area es: " + figura_1.get_area() + ", y el perimetro es: " + figura_1.get_perimetro());
        
        
        System.out.println("Ingresar el primer lado: ");
        lado_1 = input.nextDouble();
        System.out.println("Ingresa el segundo lado");
        lado_2 = input.nextDouble();
        cuadrilatero figura_2 = new cuadrilatero(lado_1, lado_2);
        System.out.println("El area es: " + figura_2.get_area() + ", y el perimetro es: " + figura_2.get_perimetro());
        
    }
}
