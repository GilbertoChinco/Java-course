
import java.util.Scanner;
public class exercise_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int n, idx = 0, cnt = 0;
        
        // Input data
        do{
            for(int i = 0; i<5; i++){
                System.out.println(i + 1 + ", digit the number");
                numbers[i] = input.nextInt();
            }
            cnt = 0;
            for(int i = 0; i < 4; i++){
                if(numbers[i] < numbers[i + 1]){
                    cnt++;
                }
            }
        }while(cnt != 4);   
        
        
        System.out.println("///////////////////////");
        System.out.println("digit a  new number");
            n = input.nextInt();
        
            for(int  i = 0; i < 5; i++){
                if(n > numbers[i]){
                    idx++;
                }
            }
            for(int i = 4; i >= idx; i--){
                numbers[i + 1] = numbers[i];
            }
            numbers[idx] = n;
        
            for(int i = 0; i<9; i++){
                System.out.print(numbers[i] +  "   ");
            }
        }
    }
