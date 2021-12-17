
package exercise_1_class_object;
import java.util.Scanner;
public class exercise_1_main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nombre;
        double cantidad, retiro;
        
        Cuenta cliente_1 = new Cuenta();
        
        System.out.println("Ingresar el nombre del cliente");
        nombre = input.nextLine();
        System.out.println("Ingresar la cantidad de dinero del cliente");
        cantidad = input.nextDouble();
        
        cliente_1.Ingresar_nombre(nombre);
        cliente_1.Saludar();
        
        cliente_1.Ingresar_cantidad(cantidad);
        
        System.out.println("Ingreasr la cantidad de dinero a retirar");
        retiro = input.nextDouble();
        
        cliente_1.Retirar_cantidad(retiro);
        cliente_1.ver_cantidad();
    }
}
