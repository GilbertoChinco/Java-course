package exercise_6;
import java.util.Scanner;
public class Main {
    
    public static int TrianguloMayorSuperficie(Triangulo Figuras[]){
        int idx = 0;
        double area = Figuras[0].Get_Area();
        for(int i = 1; i < Figuras.length; i++){
            if(Figuras[i].Get_Area() < area){
                area = Figuras[i].Get_Area();
                idx = i;
            }
        }
        return idx;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, type, indice;
        double lado_1, lado_2, lado_3;
        
        System.out.println("Ingresar número de triangulos");
        n = input.nextInt();
        
        Triangulo Figuras[] = new Triangulo[n];
        
        for(int i = 0; i < n; i++){
            System.out.println("Ingresar tipo de triangulo");
            System.out.println("(0) -- Equilatero // (1) -- Isosceles // (2) - Escaleno");
            type = input.nextInt();
            
            switch(type){
                case 0: 
                    System.out.println("Triangulo equilatero");
                    System.out.println("Ingresar el tamaño del lado");
                    lado_1 = input.nextDouble();
                    Figuras[i] = new Triangulo(lado_1);
                    break;
                case 1:
                    System.out.println("Triangulo isosceles");
                    System.out.println("Ingresar el tamaño del lado 1");
                    lado_1 = input.nextDouble();
                    System.out.println("Ingresar el tamaño del lado 2");
                    lado_2 = input.nextDouble();
                    Figuras[i] = new Triangulo(lado_1, lado_2);
                    break;
                case 2:
                    System.out.println("Triangulo equilatero");
                    System.out.println("Ingresar el tamaño del lado 1");
                    lado_1 = input.nextDouble();
                    System.out.println("Ingresar el tamaño del lado 2");
                    lado_2 = input.nextDouble();
                    System.out.println("Ingresar el tamaño del lado 3");
                    lado_3 = input.nextDouble();
                    Figuras[i] = new Triangulo(lado_1, lado_2, lado_3);
                    break;
            }
            
        }
        indice = TrianguloMayorSuperficie(Figuras);
        System.out.println("///////////");
        Figuras[indice].Get_Perimetro();
        Figuras[indice].get_Datos();
    }
}
