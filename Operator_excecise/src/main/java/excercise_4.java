
import java.util.Scanner;


public class excercise_4 {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        
        int participation, first_exam, second_exam, final_exam;
        double final_grade;
        
        System.out.println("The grade of the participation of the student");
        participation = input.nextInt();
        System.out.println("The grade of the first exam");
        first_exam = input.nextInt();
        System.out.println("The grade of the second exam");
        second_exam = input.nextInt();
        System.out.println("The grade of the final exam");
        final_exam = input.nextInt();
        
        final_grade = participation * 0.1 + first_exam * 0.25 + second_exam * 0.25 + final_exam * 0.4;
        
        System.out.println("The final grade:" + final_grade);
        
    }
}
