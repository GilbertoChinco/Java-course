
package Clases_Objetos;
public class Operation {
    //Attributes
    int sum;
    int diff;
    int frac;
    int multiply;
    
    //Method
    //Ask for numbers
    
    public void sumar(int number_1, int number_2){
        sum = number_1 + number_2;
    }
    
    public void restar(int number_1, int number_2){
        diff = number_1 - number_2;
    }
    
    public void multiplicar(int number_1, int number_2){
        multiply = number_1 * number_2;
    }
    
    public void dividir(int number_1, int number_2){
      frac = number_1 / number_2;
    }
    
    public void Resultados(){
        System.out.println("La suma es :" + sum);
        System.out.println("La resta es :" + diff);
        System.out.println("La multplicacion es :" + multiply);
        System.out.println("La division es :" + frac);
    }
}
