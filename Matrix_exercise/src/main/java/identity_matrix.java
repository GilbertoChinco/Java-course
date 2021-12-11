
import java.util.Scanner;
public class identity_matrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        int matrix[][];
        System.out.println("Digit the dimension of the matrix");
        n = input.nextInt();
        
        matrix = new int[n][n];
        
        for(int j = 0; j < n; j++){
            for(int i = 0; i < n; i++){
                if(j == i){
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
