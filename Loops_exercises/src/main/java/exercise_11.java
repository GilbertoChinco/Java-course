
import java.util.Scanner;
public class exercise_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, result;
        System.out.println("digit a number in the range (0 - 10)");
        n = input.nextInt();
        for(int i = 0; i <= n; i++){
            result = n * i;
            System.out.println(i + "x" + n + " = " + result);
        }
    }
}
