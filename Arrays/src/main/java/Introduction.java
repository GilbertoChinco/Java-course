
import java.util.Scanner;
public class Introduction {
    public static void main(String[] args){
        
        //Create the array, in this case, It's an int array and the shape is 4
        int[] numbers = new int[4];
        
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        
        for(int i = 0; i < 4; i++){
            System.out.println("The elements of the array: " + numbers[i]);
        }
        
        //Define an array
        int[] price = {10, 20, 30};
        
        for(int i = 0; i < 3; i++){
            System.out.println("The elements of the array: " + price[i]);
        }
        
        //Othr form 
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Digit the dimension of the array");
        n = input.nextInt();
        char[] letters = new char[n];
        
        for(int i = 0; i < n; i++){
            System.out.println(i + ", digit the letter:");
            letters[i] = input.next().charAt(0);
        }
        System.out.println("The elements of the array:");
        for(int i = 0; i < n; i++){
            System.out.print(letters[i] + " ");
        }
    }
}
