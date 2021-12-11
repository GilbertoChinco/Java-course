import java.util.Scanner;
public class sum_rows_and_columns {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, m, sum_1, sum_2;
        int matrix[][];
        int sum_rows[];
        int sum_columns[];
        
        System.out.println("Digit the number of rows");
        n = input.nextInt();
        System.out.println("Digit the number of columns");
        m = input.nextInt();
        
        matrix = new int[n][m];
        sum_rows = new int[n];
        sum_columns = new int[m];
        
        for(int j = 0; j < n; j++){
            for(int i = 0; i < m; i++){
                System.out.println("Insert the elemnt (" + j + ", " + i + ")");
                matrix[j][i] = input.nextInt();
            }
        }
        
        for(int j = 0; j < n; j++){
            sum_1 = 0;
            sum_2 = 0;
            for(int i = 0; i < m; i++){
                sum_1 += matrix[j][i];
                sum_2 += matrix[i][j];
            }
            sum_rows[j] = sum_1;
            sum_columns[j] = sum_2;
        }
        
        System.out.println("The sum of the rows");
        for(int i = 0; i < n; i++){
            System.out.print(sum_rows[i] + "  ");
        }
        System.out.println("\n///////////////////////////");
        System.out.println("The sum of the columns");
        for(int i = 0; i < n; i++){
            System.out.print(sum_columns[i] + "  ");
        }
    }
}
