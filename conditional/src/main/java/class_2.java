/* 
    Multiple conditionals
    
    switch(dato){
        case 1: instruction 1;
            break;
        ....

        case N: instruction2;
            break;
            
        default: OtherCase;
            break;

    }
*/
import java.util.Scanner;
public class class_2 {
    public static void main(String[] args){
       
        Scanner input = new Scanner(System.in);
        int dato;
        
        System.out.println("Digit a number between (1 - 5):");
        dato = input.nextInt();
        
        switch(dato){
            case 1: System.out.println("The number is 1");
            break;
            case 2: System.out.println("The number is 2");
            break;
            case 3: System.out.println("The number is 3");
            break;
            case 4: System.out.println("The number is 4");
            break;
            case 5: System.out.println("The number is 5");
            break;
            default: System.out.println("The number is out of the range");
        }
        
    }
}
