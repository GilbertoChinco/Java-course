
import java.util.Scanner;


public class excercise_3 {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        
        int guillermo, luis, juan, total;
        
        System.out.println("Insert N dollars to guillermo");
        guillermo = input.nextInt();
        
        luis = guillermo / 2;
        juan = (luis + guillermo) / 2;
        total = guillermo + luis + juan;
        
        System.out.println("Guillermo dollars: " + guillermo);
        System.out.println("Luis dollars: " + luis);
        System.out.println("Juan dollars: " + juan);
        System.out.println("The total dollars:" + total);
    }
}
