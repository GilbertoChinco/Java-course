public class multiplication {
    public static void main(String[] args){
        int matrix_1[][] = {{1, 2}, 
                            {3, 4}};
        int matrix_2[][] = {{1, 2}, 
                            {3, 4}};
        int matrix_3[][];
        int sum_1, sum_2, a;
        matrix_3 = new int[2][2];
        
        for(int j = 0; j < 2; j++){
            sum_1 = 0;
            for(int i = 0; i < 2; i++){
                sum_1 += matrix_1[j][i] * matrix_2[i][j];
            }
            System.out.println(sum_1);
        }
        System.out.println("/////////////");
        for(int j = 0; j < 2; j++){
            sum_2 = 0;
            for(int i = 0; i < 2; i++){
                sum_2 += matrix_1[j][i] * matrix_2[i][j];
            }
            System.out.println(sum_2);
        }
        
    }
}
