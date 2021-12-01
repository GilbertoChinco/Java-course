
import java.util.Scanner;
public class exercise_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, sum_p = 0, sum_n = 0, cnt_p = 0, cnt_n = 0, cnt = 0;
        float mean_p, mean_n;
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Digit a number:");
            n = input.nextInt();
            
            if(n > 0){
                sum_p += n;
                cnt_p++;
            }
            else if(n < 0){
                sum_n += n;
                cnt_n++;
            }
            else{
                cnt++;
            }
        }
        if(cnt_p != 0){
            mean_p = (float) sum_p / cnt_p;
            System.out.println("The mean of positive numbers: " + mean_p);
        }
        if(cnt_n != 0){
            mean_n = (float) sum_n / cnt_n;
            System.out.println("The mean of negative numbers: " + mean_n);
        }
        if(cnt != 0){
            System.out.println("# zeros introduced: " + cnt);
        }
    }
}
