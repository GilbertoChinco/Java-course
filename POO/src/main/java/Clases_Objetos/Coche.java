
package Clases_Objetos;
public class Coche {
    //Attributes
    String color;
    String marca;
    int km;
    
    //Methods
    public static void main(String[] args){
        Coche coche_1 = new Coche();
        
        coche_1.color = "White";
        coche_1.marca = "Audi";
        coche_1.km = 0;
        
        System.out.println("The color of the car " + coche_1.color);
        System.out.println("The branch " + coche_1.marca);
        System.out.println("The kilometer " + coche_1.km);
        
        Coche coche_2 = new Coche();
        
        coche_2.color = "Red";
        coche_2.marca = "Ferrari";
        coche_2.km = 150;
        
        System.out.println("\n The color of the car " + coche_2.color);
        System.out.println("The branch " + coche_2.marca);
        System.out.println("The kilometer " + coche_2.km);
    }
}
