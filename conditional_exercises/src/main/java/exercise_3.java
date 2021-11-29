/*
Program an algorithm that read one character and confirm if it's a Capital letter
*/


import java.util.Scanner;
public class exercise_3 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        char letter;
        
        System.out.println("Digit a letter of the alphabet");
        letter = input.next().charAt(0);
        
        if(Character.isUpperCase(letter)){
            System.out.println("The letter is upper case");
        }
        else{
            System.out.println("The letther is lower case");
        }
    }
}
