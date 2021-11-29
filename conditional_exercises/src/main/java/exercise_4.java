
import java.util.Scanner;


public class exercise_4 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double price, total_price;
    System.out.println("Digit a total of price of the market");
    price = input.nextDouble();
    
    if(price > 300){
        total_price = price * 0.8;
        System.out.println("The total price to pay: " + total_price);
    }
    else{
        System.out.println("The total price to pay: " + price);
    }
    }
}
