
package exercise_8;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();  //Arreglos de tipo dinámico
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        
        //Llenar poligono
        LlenarPoligono();
        
        //Mostrar datos de cada poligono
        MostrarResultados();
    }
    
    public static void MostrarResultados(){
        for(Poligono poli: poligono){
            System.out.println(poli.toString());
            System.out.println("El area es: " + poli.area());
            System.out.println("");
        }
    }
    
    public static void LlenarPoligono(){
        int opcion;
        char respuesta;
        do{
            do{
                System.out.println("Digite que poligono desea: ");
            System.out.println("1. Triangulo");
            System.out.println("2. Rectangulo");
            System.out.println("Opcion: ");
            opcion = input.nextInt();
            }while(opcion < 1 || opcion > 2);
            
            switch(opcion){
                case 1:
                    LlenarTriangulo();
                    break;
                case 2:
                    LlenarRectangulo();
                    break;
            }
            System.out.println("\nDesea introducir otro poligono (s/n)");
            respuesta = input.next().charAt(0);
        }while(respuesta == 's' || respuesta == 'S');
    }
    
    public static void LlenarTriangulo(){
        double lado_1, lado_2, lado_3;
        System.out.println("\nDigite el lado 1");
        lado_1 = input.nextDouble();
        System.out.println("\nDigite el lado 2");
        lado_2 = input.nextDouble();
        System.out.println("Digite el lado 3");
        lado_3 = input.nextDouble();
        Triangulo triangulo = new Triangulo(lado_1, lado_2, lado_3);
        //Guardamos un triangulo en el arreglo
        poligono.add(triangulo);
    }
    
    public static void LlenarRectangulo(){
        double lado_1, lado_2;
        System.out.println("\nDigite el lado 1");
        lado_1 = input.nextDouble();
        System.out.println("Digite el lado 2");
        lado_2 = input.nextDouble();
        Rectangulo rectangulo = new Rectangulo(lado_1, lado_2);
        //Guardamos un triangulo en el arreglo
        poligono.add(rectangulo);
    }
}
