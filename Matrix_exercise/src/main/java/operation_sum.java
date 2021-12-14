
import java.util.Scanner;
public class operation_sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, m, p, q;
        int matrix_1[][], matrix_2[][], matrix_3[][];
        
        System.out.println("Firt matrix");
        System.out.println("Digit the number of columns");
        m = input.nextInt();
        System.out.println("Digit the number os rows");
        n = input.nextInt();
        
        matrix_1 = new int[n][m];
        
        for(int j = 0; j < n; j++){
            for(int i = 0; i < m; i++){
                System.out.println("Insert the elemnt (" + j + ", " + i + ")");
                matrix_1[j][i] = input.nextInt();
            }
        }
        
        System.out.println("Second matrix");
        System.out.println("Digit the number of columns");
        q = input.nextInt();
        System.out.println("Digit the number os rows");
        p = input.nextInt();
        
        matrix_1 = new int[p][q];
        
        for(int j = 0; j < p; j++){
            for(int i = 0; i < q; i++){
                System.out.println("Insert the elemnt (" + j + ", " + i + ")");
                matrix_1[j][i] = input.nextInt();
            }
        }
        
        if((n == p) && (m == q)){
            matrix_3 = new int[n][m];
            for(int j = 0; j < n; j++){
                for(int i = 0; i < m; i++){
                    matrix_3[j][i] = matrix_1[j][i] + matrix_1[j][i];
                }
            }
            
            for(int j = 0; j < n; j++){
                for(int i = 0; i < m; i++){
                    System.out.print(matrix_3[j][i] + " ");
                }
                System.out.println("");
            }
        }
        else{
            System.out.println("The dimension are different");
        }
    }
}
