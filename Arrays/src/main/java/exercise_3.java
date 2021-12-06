
import java.util.Scanner;
public class exercise_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[9];
        int idx, n;
        for(int i = 0; i < 8; i++){
            System.out.println(i + ", Digit the number");
            numbers[i] = input.nextInt();
        }
        System.out.println("/////////////////////");
        System.out.println("Digit the new number");
        n = input.nextInt();
        System.out.println("Digit the index where is be replabce");
        idx = input.nextInt();
        
        for(int i = 7 ; i >= idx; i--){
            numbers[i + 1] = numbers[i];
        }
        numbers[idx] = n;
        
        for(int i = 0; i < 9; i++){
            System.out.print(numbers[i] + "  ");
        }
    }
}
