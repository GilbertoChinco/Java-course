
public class Matrix_transpose {
    public static void main(String[] args){
        int matrix[][] = {{1, 2, 3}, 
                          {4, 5, 6}, 
                          {7, 8, 9}};
        
        for(int j = 0; j < 3; j++){
            for(int i = 0; i < 3; i++){
                System.out.print(matrix[j][i]);
            }
            System.out.println("");
        }
        System.out.println("////////////////////");
        int transpose[][] = new int[3][3];
        
        for(int j = 0; j < 3; j++){
            for(int i = 0; i < 3; i++){
                transpose[i][j] = matrix[j][i];
            }
        }
        
        for(int j = 0; j < 3; j++){
            for(int i = 0; i < 3; i++){
                System.out.print(transpose[j][i]);
            }
            System.out.println("");
        }
    }
}
