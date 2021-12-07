
import java.util.Scanner;

public class exercise_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int cnt, iter = 0, size, save_n;
        
        System.out.println("Digit the length of the array: ");
        size = input.nextInt();
        int[] numbers = new int[size];
        
        for(int i = 0; i < size; i++){
            System.out.println((i + 1) + ", digit the element: ");
            numbers[i] = input.nextInt();
        }
        
        do{
            for(int i = 0; i < size - 1; i++){
                if(numbers[i] > numbers[i + 1]){
                    save_n = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = save_n;
                }
            }
        cnt = 0;
        for(int i = 0; i < size - 1 ; i++){
            if(numbers[i] < numbers[i + 1]){
                cnt++;
            }
        }
        iter++;
        }while(cnt != size - 1);
        
        System.out.println("Número de iteraciones: " + iter);
        for(int i = 0; i < size; i++){
            System.out.print(numbers[i] + "  ");
        }
    }
}
