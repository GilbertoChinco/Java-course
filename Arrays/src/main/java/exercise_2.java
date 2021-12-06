
import java.util.Scanner;
public class exercise_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, cnt = 1;
       
        System.out.println("Digit the dimension of the array");
        n = input.nextInt();
        int[] numbers = new int[n];
        
        for(int i = 0; i < n; i++){
            System.out.println(i + ", digit the values of the array");
            numbers[i] = input.nextInt();
        }
        
        if(n % 2 == 0){
            for(int i = 0; i < n/2; i++){
                System.out.println(numbers[i] + "  " + numbers[n - cnt]);
                cnt++;
                }
            }
        else{
            for(int i = 0; i < Math.floor(n/2); i++){
                System.out.println(numbers[i] + "  " + numbers[n - cnt]);
                cnt++;
                }
            System.out.println(numbers[(int)Math.floor(n/2)]);
            }
        }
    }

