
import java.util.Scanner;


/**
 *
 * @author 52871
 */
public class calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float n1, n2, sum, diff, mult, div, res;
        System.out.print("Digit two numbers");
        n1 = input.nextFloat();
        n2 = input.nextFloat();
        
        sum = n1 + n2;
        diff = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;
        res = n1 % n2;
        
        System.out.println("The sum:" + sum);
        System.out.println("the difference: " + diff);
        System.out.println("The multiplication: " + mult);
        System.out.println("The division: " + div);
        System.out.println("The residual:" + res);
    }
}
