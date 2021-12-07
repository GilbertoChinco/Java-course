
import java.util.Scanner;
public class exercise_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int n, idx = 0;
        
        for(int i = 0; i<5; i++){
            System.out.println(i + 1 + ", digit the number");
            numbers[i] = input.nextInt();
        }
        
        System.out.println("Digit the number");
        n = input.nextInt();
        
        for(int i = 0; i < 5; i++){
            if(n == numbers[i]){
                idx = i;
                break;
            }
            else{
                idx = -1;
            }
        }
        if(idx >= 0){
            System.out.println("The digited number is in the array and the index is: " + idx);
        }
        else{
            System.out.println("The digited number is not in the array");
        }
    }
}
