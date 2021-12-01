
import java.util.Scanner;


public class exercise_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, n_random, cnt = 1;
        
        n_random = (int)(Math.random() * 10);
        System.out.println("Guess the number");
        System.out.println("Digit a number:");
        n = input.nextInt();
        
        while(n != n_random){
            if (n < n_random){
                System.out.println("The number is lower than the ranodm number");
            }
            else{
                System.out.println("the number is higher than the random number");
            }
            System.out.println("Digit a number:");
            n = input.nextInt();
            cnt++;
        }
        
        System.out.println("The random number is " + n_random);
        System.out.println("The numbers of strikes: " + cnt);
    }
}
