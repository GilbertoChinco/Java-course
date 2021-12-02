
import java.util.Scanner;
public class exercise_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int code_art, amount;
        int cnt_art_1 = 0, cnt_art_2 = 0, cnt_art_3 = 0, cnt = 0;
        float factura = 0, factura_total = 0;
        float price_1 = 0.6f, price_2 = 3f, price_3 = 1.25f;
        
        for(int i = 1; i <= 3; i++){
            System.out.println("Introducir datos de la factura: " + i);
            System.out.println("Ingresar codigo del articulo");
            code_art = input.nextInt();
            System.out.println("Ingresar Cantidad vendida en litros");
            amount = input.nextInt();
            
            switch(code_art){
                case 1: 
                    cnt_art_1 += amount;
                    factura = (float) amount * price_1;
                    break;
                case 2: 
                    cnt_art_2 += amount;
                    factura = (float) amount * price_2;
                    break;
                case 3: 
                    cnt_art_3 += amount;
                    factura = (float) amount * price_3;
                    break;
            }
            factura_total += factura;
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
