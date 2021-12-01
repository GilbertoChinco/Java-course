
import java.util.Scanner;


public class exercise_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        
        System.out.println("Digit a number");
        n = input.nextInt();
        
        while(n != 0){
            System.out.println("Digit a number");
            n = input.nextInt();
        }
        System.out.println("The number is zero");
    }
}
