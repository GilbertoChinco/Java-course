
import java.util.Scanner;


public class exercise_7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Digit the number " + i);
            n = input.nextInt();
            sum += n;
        }
        System.out.println("The sum of all number: " + sum);
    }
}
