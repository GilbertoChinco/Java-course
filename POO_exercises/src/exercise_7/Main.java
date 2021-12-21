package exercise_7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float number_1, number_2;
        
        System.out.println("Ingresar primer número imaginario");
        number_1 = input.nextFloat();
        System.out.println("Ingresar segundo número imaginario");
        number_2 = input.nextFloat();
        
        Calculadora objeto_1 = new Calculadora(number_1, number_2);
        
        objeto_1.get_comparate();
        objeto_1.get_sum();
        objeto_1.get_multiply();
        objeto_1.get_results();
    }
}
