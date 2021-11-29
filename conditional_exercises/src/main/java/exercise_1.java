import java.util.Scanner;
public class exercise_1 {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        int number, res;
        
        
        System.out.println("Digit a number");
        number = input.nextInt();
        res = number % 10;
        
        if (res == 0){
            System.out.println("the number is a multple of 10");
        }
        else{
            System.out.println("the number is not a multiple of 10");
        }
    }
}
