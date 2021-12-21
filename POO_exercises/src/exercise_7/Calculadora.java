package exercise_7;
public class Calculadora {
    private float imaginaryNumber_1;
    private float imaginaryNumber_2;
    private int IntegerNumber;
    private float sum;
    private float multiply;
    private boolean flag;
    private float multiply_int;
    
    public Calculadora(float imaginaryNumber_1, float imaginaryNumber_2){
        this.imaginaryNumber_1 = imaginaryNumber_1;
        this.imaginaryNumber_2 = imaginaryNumber_2;
    }
    
    public Calculadora(float imaginaryNumber_1){
        this.imaginaryNumber_1 = imaginaryNumber_1;
    }
    
    public float get_sum(){
        sum = imaginaryNumber_1 + imaginaryNumber_2;
        return sum;
    }
    
    public float get_multiply(){
        multiply = imaginaryNumber_1 * imaginaryNumber_2 * (-1);
        return multiply;
    }
    
    public boolean get_comparate(){
        flag = false;
        if(imaginaryNumber_1 == imaginaryNumber_2){
            flag = true;
        }
        return flag;
    }
    
    public void set_aggregateInt(int number){
        IntegerNumber = number;
    }
    
    public void get_multiply_by_int(){
        multiply_int = (float) (imaginaryNumber_1 * IntegerNumber);
        System.out.println("the multply by a integer: " + multiply_int + " j");
    }
    
    public void get_results(){
        System.out.println("The sum: " + sum + " j");
        System.out.println("The muliply: " + multiply);
        System.out.println("the numbers are equal: " + flag);
    }
   
}
