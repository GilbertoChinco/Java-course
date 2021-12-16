
package Clases_Objetos;
import java.util.Scanner;
public class Operation {
    //Attributes
    int number_1;
    int number_2;
    int sum;
    int diff;
    int frac;
    int multiply;
    
    Scanner input = new Scanner(System.in);
    //Method
    //Ask for numbers
    public void Read_numbers(){
        System.out.println("Digit the first number");
        number_1 = input.nextInt();
        
        System.out.println("Digit the second number");
        number_2 = input.nextInt();
        
    }
    
    public void sumar(){
        sum = number_1 + number_2;
    }
    
    public void restar(){
        diff = number_1 - number_2;
    }
    
    public void multiplicar(){
        multiply = number_1 * number_2;
    }
    
    public void dividir(){
        frac = number_1 / number_2;
    }
    
    public void Resultados(){
        System.out.println("La suma es :" + sum);
        System.out.println("La resta es :" + diff);
        System.out.println("La multplicacion es :" + multiply);
        System.out.println("La division es :" + frac);
    }
}
