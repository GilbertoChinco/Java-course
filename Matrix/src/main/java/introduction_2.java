
import java.util.Scanner;
public class introduction_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int cols, rows;
        int matrix[][];
        
        System.out.println("Digit the number of columns");
        cols = input.nextInt();
        System.out.println("Digit the number os rows");
        rows = input.nextInt();
        
        matrix = new int[rows][cols];
        
        for(int j = 0; j < rows; j++){
            for(int i = 0; i < cols; i++){
                System.out.println("Insert the elemnt (" + j + ", " + i + ")");
                matrix[j][i] = input.nextInt();
            }
        }
        
        for(int j = 0; j < rows; j++){
            for(int i = 0; i < cols; i++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println("");
        }
        
    }
}
