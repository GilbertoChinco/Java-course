
import java.util.Scanner;
public class determinant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        int matrix[][];
        double aux_1 = 1, aux_2 = 1;
        
        System.out.println("Digit the dimension of the matrix");
        n = input.nextInt();
        
        matrix = new int[n][n];
        
        for(int j = 0; j < n; j++){
            for(int i = 0; i < n; i++){
                System.out.println("Insert the elemnt (" + j + ", " + i + ")");
                matrix[j][i] = input.nextInt();
            }
        }
        
        if(n == 2){
            for(int j = 0; j < n; j++){
                for(int i = 0; i < n; i++){
                    if(j == i){
                        aux_1 *= matrix[j][i];
                    }
                    else{
                        aux_2 *= matrix[j][i];
                    }
                }
            }
        }
        System.out.println(aux_1 - aux_2);
    }
}
