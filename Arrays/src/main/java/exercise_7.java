
import java.util.Scanner;
public class exercise_7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int[] new_numbers = new int[10];
        int cnt = 0;
        
        for(int i = 0; i<10; i++){
                System.out.println(i + 1 + ", digit the number");
                numbers[i] = input.nextInt();
                if(numbers[i] % 2 == 0){
                    cnt++;
                }
        }
        int[] even = new int[cnt];
        int[] odd = new int[10 - cnt];
        int cnt_e = 0;
        int cnt_o = 0;
        for(int i = 0; i < 10; i++){
            if(numbers[i] % 2 == 0){
                even[cnt_e] = i;
                cnt_e++;
            }
            else{
                odd[cnt_o] = i;
                cnt_o++;
            }
        }
        
        int cnt_3 = 0;
        for(int i:even){
            new_numbers[cnt_3] = numbers[i];
            cnt_3++;
        }
        for(int i:odd){
            new_numbers[cnt_3] = numbers[i];
            cnt_3++;
        }
        
        System.out.println("\n");
        for(int i = 0; i<10; i++){
            System.out.print(new_numbers[i] + "  ");
        }
    }
}
