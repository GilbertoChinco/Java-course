import java.util.Scanner;
public class sum_rows_and_columns {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = 3, sum_1, sum_2;
        int matrix[][] = {{1, 2, 3},
                          {4, 5, 6}, 
                          {7, 8, 9}};
        int sum_rows[];
        int sum_columns[];
        sum_rows = new int[n];
        sum_columns = new int[n];
        
        for(int j = 0; j < n; j++){
            sum_1 = 0;
            sum_2 = 0;
            for(int i = 0; i < n; i++){
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
