
import java.util.Scanner;
public class simetric_matrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int cols, rows;
        int matrix[][], transpose[][];
        int cnt = 0;
        
        System.out.println("Digit the number of columns: ");
        cols = input.nextInt();
        System.out.println("Digit the number of rows: ");
        rows = input.nextInt();
        
        matrix = new int[rows][cols];
        
        if(cols == rows){
            for(int j = 0; j < rows; j++){
                for(int i = 0; i < cols; i++){
                    System.out.println("Insert the elemnt (" + j + ", " + i + ")");
                    matrix[j][i] = input.nextInt();
                }
            }
            System.out.println("////////////////////");
            
            transpose = new int[rows][cols];
        
            for(int j = 0; j < rows; j++){
                for(int i = 0; i < cols; i++){
                    transpose[i][j] = matrix[j][i];
                }
            }
            
            for(int j = 0; j < rows; j++){
                for(int i = 0; i < rows; i++){
                    if(matrix[j][i] == transpose[j][i]){
                        cnt++;
                    }
                }
            }
            if(cnt == cols * rows){
                System.out.println("The matrix is simetric");
            }
            else{
                System.out.println("The matrix is square but is not simetric");
            }
        }
        else{
            System.out.println("The matrix is no square");
        }
        
    }
}
