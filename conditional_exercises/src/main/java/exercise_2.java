
import java.util.Scanner;


public class exercise_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1, n2;
        
        System.out.println("Digit the first number");
        n1 = input.nextInt();
        
        System.out.println("Digit the second number");
        n2 = input.nextInt();
        
        
        if(n1 == n2){
            System.out.println("The numbers are equal");
        }
        else{
            if(n1 > n2){
                System.out.println("The first number is higher than the second");
            }
            else{
                System.out.println("The second number is higher than the first");
            }
        }
        
    }
}
