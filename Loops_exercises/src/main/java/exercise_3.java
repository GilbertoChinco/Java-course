
import java.util.Scanner;


public class exercise_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        
        System.out.println("Digit a number");
        n = input.nextInt();
        
        while(n != 0){
            if (n % 2 == 0){
                System.out.println("It's a even number");
            }
            else{
                System.out.println("It's a odd number");
            }
            System.out.println("Digit a number");
            n = input.nextInt();
        }
        System.out.println("The number is zero");
    }
}