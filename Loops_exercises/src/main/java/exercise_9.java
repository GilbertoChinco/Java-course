
import java.util.Scanner;
public class exercise_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int code_art, amount, price;
        int cnt_art_1 = 0, cnt_art_2 = 0, cnt_art_3 = 0, cnt = 0;
        float factura, factura_total = 0;
        
        for(int i = 1; i <= 3; i++){
            System.out.println("Introducir datos de la factura: " + i);
            System.out.println("Ingresar codigo del articulo");
            code_art = input.nextInt();
            System.out.println("Ingresar Cantidad vendida en litros");
            amount = input.nextInt();
            System.out.println("Precio por litro");
            price = input.nextInt();
            factura = (float) amount * price;
            factura_total += factura;
            
            switch(code_art){
                case 1: cnt_art_1 += amount; 
                    break;
                case 2: cnt_art_2 += amount;
                    break;
                case 3: cnt_art_3 += amount;
                    break;
            }
            if(factura > 600){
                cnt++;
            }
        }
        System.out.println("//////////////////////////////////////");
        System.out.println("La factura total es: " + factura_total);
        System.out.println("Número de factura mayor a 600: " + cnt);
        System.out.println("Cantidad en litros vendidos del articulo 1: " + cnt_art_1);
        System.out.println("Cantidad en litros vendidos del articulo 2: " + cnt_art_2);
        System.out.println("Cantidad en litros vendidos del articulo 3: " + cnt_art_3);
    }
}
