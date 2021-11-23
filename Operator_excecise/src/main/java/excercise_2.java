
import java.util.Scanner;



/**
 *
 * @author 52871
 */
public class excercise_2 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
       
        double hours, salary_hour, salary_week;
        
        System.out.println("Inser the hours:");
        hours = input.nextDouble();
        System.out.println("Inser the salary per hours:");
        salary_hour = input.nextDouble();
        
        salary_week = hours * salary_hour;
        
        System.out.println("The salary per hour: " + salary_hour);
        System.out.println("the hours worked during the week:" + hours);
        System.out.println("The salary week: " + salary_week);
        
    }
}
