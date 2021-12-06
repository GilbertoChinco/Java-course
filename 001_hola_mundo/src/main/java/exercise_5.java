
import java.util.Scanner;


public class exercise_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.println("Digit the first number:");
        n1 = input.nextInt();
        System.out.println("Digit the second number:");
        n2 = input.nextInt();
        System.out.println("Digit the third number:");
        n3 = input.nextInt();
        
        System.out.println("Order numbers");
        if(n1 > n2){
            if(n1 > n3){
                if(n2 > n3){
                    System.out.println(n1);
                    System.out.println(n2);
                    System.out.println(n3);
                }
                else{
                    System.out.println(n1);
                    System.out.println(n3);
                    System.out.println(n2);
                }
            }
            else{
                System.out.println(n3);
                System.out.println(n1);
                System.out.println(n2);
            }
        }
        else{
            if(n2 > n3){
                if(n3 > n1){
                    System.out.println(n2);
                    System.out.println(n3);
                    System.out.println(n1);
                }
                else{
                    System.out.println(n2);
                    System.out.println(n1);
                    System.out.println(n3);
                }
            }
            else{
                System.out.println(n3);
                System.out.println(n2);
                System.out.println(n1);
            }
        }
    }
}
