
package Clases_Objetos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n1, n2; 
        System.out.println("Digit the first  number:");
        n1 = input.nextInt();
        System.out.println("Digit the second  number:");
        n2 = input.nextInt();
        
        Operation op = new Operation();
        int sum = op.sumar(n1, n2);
        int diff = op.restar(n1, n2);
        int frac = op.dividir(n1, n2);
        int multiply = op.multiplicar(n1, n2); 
        
        op.Resultados(sum, diff, multiply, frac);
    } 
}
