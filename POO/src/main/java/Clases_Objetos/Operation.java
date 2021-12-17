
package Clases_Objetos;
public class Operation {
    //Attributes
    int sum;
    int diff;
    int frac;
    int multiply;
    
    //Method
    //Ask for numbers
    
    public int sumar(int number_1, int number_2){
        int sum = number_1 + number_2;
        return sum;
    }
    
    public int restar(int number_1, int number_2){
        int diff = number_1 - number_2;
        return diff;
    }
    
    public int multiplicar(int number_1, int number_2){
        int multiply = number_1 * number_2;
        return multiply;
    }
    
    public int dividir(int number_1, int number_2){
      int frac = number_1 / number_2;
      return frac;
    }
    
    public void Resultados(int sum, int diff, int multiply, int frac){
        System.out.println("La suma es :" + sum);
        System.out.println("La resta es :" + diff);
        System.out.println("La multplicacion es :" + multiply);
        System.out.println("La division es :" + frac);
    }
}
