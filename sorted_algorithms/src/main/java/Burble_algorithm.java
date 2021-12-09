
import java.util.Scanner;

public class Burble_algorithm {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size, save_n;
        
        System.out.println("Digit the length of the array: ");
        size = input.nextInt();
        int[] numbers = new int[size];
        
        for(int i = 0; i < size; i++){
            System.out.println((i + 1) + ", digit the element: ");
            numbers[i] = input.nextInt();
        }
        
        for(int j = 0; j < size - 1; j++){
            for(int i = 0; i < size - 1; i++){
                if(numbers[i] > numbers[i + 1]){
                    save_n = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = save_n;
                }
            }
        }
        
        for(int i = 0; i < size; i++){
            System.out.print(numbers[i] + "  ");
        }
    }
}
