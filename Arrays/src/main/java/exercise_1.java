
import java.util.Scanner;


public class exercise_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        float[] numbers = new float[5];
        
        for(int i = 0; i < 5; i++){
            System.out.println(i + ", digit the numbers for the array");
            numbers[i] = input.nextFloat();
        }
        System.out.println("The elements of the array");
        for(float i:numbers){
            System.out.print(i + " ");
        }
        System.out.println("\n");
        for(int i = 5 - 1; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }
    }
}
