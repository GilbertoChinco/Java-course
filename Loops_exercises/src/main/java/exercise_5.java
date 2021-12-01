
import java.util.Scanner;


public class exercise_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, sumador = 0;
        
        do{
            System.out.println("digit a number:");
            n = input.nextInt();
            sumador += n;
        }while(n != 0);
        
        System.out.println("The number digited was zero");
        System.out.println("The sum of all number digited: " + sumador);
        
    }
}
