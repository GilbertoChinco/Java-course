import java.util.Scanner;
public class exercise_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N, fact = 1;
        
        System.out.println("Digit a number:");
        N = input.nextInt();
        
        System.out.println("All the previous numbers");
        for(int i = 1; i <= N; i++){
            System.out.println(i);
            fact *= i;
        }
        System.out.println("The factorial of this number: " + fact);
     }
}
