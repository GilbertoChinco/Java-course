

/**
 *
 * @author 52871
 */
public class class_math {
    public static void main(String[] args){
        double n = 9;
        double raiz, exponent;
        double exp = 2;
        
        raiz = Math.sqrt(n);
        exponent = Math.pow(n, exp);
        
        System.out.println("the square root:" + raiz);
        System.out.println("The exponent: " + exponent);
        
        double number_1 = 4.56;
        long result_1 = Math.round(number_1);
        
        System.out.println(result_1);
        
        float number_2 = 4.56f;
        int result_2 = Math.round(number_2);
        System.out.println(result_2);
        
        
    }
}
