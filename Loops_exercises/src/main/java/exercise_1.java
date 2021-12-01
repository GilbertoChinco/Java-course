
import java.util.Scanner;


public class exercise_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, result;
        
        do{
            System.out.println("Digit a number");
            n = input.nextInt();
            result = n * n;
            System.out.println("The number:" + n);
            System.out.println("The square of the number: " + result);
        }while(n > 0);
        System.out.println("Wrong number, need to be an positive integer");
    }
}
