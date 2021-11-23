
import java.util.Scanner;



/**
 *
 * @author 52871
 */
public class Operator_excercise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int grade_1, grade_2, grade_3, sum;
        double grade_mean;
       
        System.out.println("Insert the grades of the 3 students");
        grade_1 = input.nextInt();
        grade_2 = input.nextInt();
        grade_3 = input.nextInt();
        
        sum = grade_1 + grade_2 + grade_3;
        grade_mean = sum / 3;
        
        System.out.println("The sum of the three grades: " + sum);
        System.out.println("The mean grade: " + grade_mean);
                
    }
}
