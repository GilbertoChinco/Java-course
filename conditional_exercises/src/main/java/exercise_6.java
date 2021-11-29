
import java.util.Scanner;


public class exercise_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float n1, n2, result = 0;
        char operation;
        
        System.out.println("Digit two numbers");
        n1 = input.nextFloat();
        n2 = input.nextFloat();
        System.out.println("Select the operation Sum (S/s), Difference (r), Multiplication (M/m), Division (D/d)");
        operation = Character.toLowerCase(input.next().charAt(0));
        
        switch(operation){
            case 's': result = n1 + n2;
            break;
            case 'r': result = n1 - n2;
            break;
            case 'm': result = n1 * n2;
            break;
            case 'd': result = n1 / n2;
            break;
        }
        System.out.println("The result: " + result);
    }
}