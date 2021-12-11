
import java.util.Scanner;
public class matrix_border {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        int matrix[][];
        
        System.out.println("Digit the dimension od the matrix");
        n = input.nextInt();
        matrix = new int[n][n];
        
        for(int j = 0; j < n; j++){
            for(int i = 0; i < n; i++){
                if((j == 0) || (j == n - 1)){
                    matrix[j][i] = 1;
                }
                else if((i == 0) || (i == n - 1)){
                    matrix[j][i] = 1;
                }
                else{
                    matrix[j][i] = 0;
                }
            }
        }
        
        for(int j = 0; j < n; j++){
            for(int i = 0; i < n; i++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println("");
        }
    }
}
