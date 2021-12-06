
import java.util.Scanner;
public class exercise_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int val, n;
        
        for(int i = 0; i < 10; i++){
            System.out.print(numbers[i] + "  ");
        }
        System.out.println("\n Digit the time to barrer");
        n = input.nextInt();
        
        for(int t = 0; t < n; t++){
        val = numbers[9];
            for(int i = 8; i >= 0; i--){
                numbers[i + 1] = numbers[i];
            }
            numbers[0] = val;
        }
        
        System.out.println("\n ///////////////////////");
        for(int i = 0; i < 10; i++){
            System.out.print(numbers[i] + "  ");
        }
    }
}
