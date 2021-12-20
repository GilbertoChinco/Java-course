
package exercise_5;
import java.util.Scanner;
public class Main {
    public static int IndiceCocheMasBarato(Vehiculo coches[]){
        double precio;
        int idx = 0;
        
        precio = coches[0].get_precio();
        for(int i = 1; i < coches.length; i++){
            if(coches[i].get_precio() < precio){
                precio = coches[i].get_precio();
                idx = i;
            }
        }
        return idx;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        String marca, modelo;
        int precio, indice;
        
        System.out.println("Ingresar número de vehiculos");
        n = input.nextInt();
        
        Vehiculo coches[] = new Vehiculo[n];
        
        for(int i = 0; i < n; i++){
            input.nextLine();
            System.out.println("Carro:" + (i + 1));
            System.out.println("Ingresar marca: ");
            marca = input.nextLine();
            System.out.println("Ingresar modelo: ");
            modelo = input.nextLine();
            System.out.println("Ingresar precio: ");
            precio = input.nextInt();
            
            coches[i] = new Vehiculo(marca, modelo, precio);
        }
        
        indice = IndiceCocheMasBarato(coches);
        System.out.println("///////////////");
        System.out.println("El coche más barato");
        coches[indice].get_datos();
        
    }

}
