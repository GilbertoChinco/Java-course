
import java.util.Scanner;
public class exercise_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int idx;
        
        for(int i = 0; i<10; i++){
                System.out.println(i + 1 + ", digit the number");
                arr[i] = input.nextInt();
        }
        
        System.out.println("Insert a index:");
        idx = input.nextInt();
        
        int[] new_arr = new int[9];
        for(int i = 0; i < idx; i++){
            new_arr[i] = arr[i];
        }
        for(int i = idx; i < 9; i++){
            new_arr[i] = arr[i + 1];
        }
        
        for(int i = 0; i < 9; i++){
            System.out.print(new_arr[i] + "  ");
        }
    }
}