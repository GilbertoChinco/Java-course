



import java.util.Scanner;


/**
 *
 * @author 52871
 */
public class introduction {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //Input data
        float var;
        String var_char;
        char letter;
        
        //System.out.println("Input a random number: ");
        //var = input.nextInt()
        //var = input.nextDouble()
        //var = input.nextFloat();
        //System.out.println("The number is: " + var);
        
        System.out.println("Input a chain of characters: ");
        //var_char = input.next();   //If the chain of characters have more than one words only prints the first word
        var_char = input.nextLine();        
        System.out.println("The chain is:" + var_char);
        
        System.out.println("Input a word: ");
        letter = input.next().charAt(0);
        System.out.println("the index 0 correspond a letter from the word: " + letter);
    }
}