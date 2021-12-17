
package exercise_1_class_object;
public class Cuenta {
    String titular;
    double cantidad_inicial;
    double cantidad_final;
    
    public void Ingresar_nombre(String nombre){
        titular = nombre;
    }
    
    public void Ingresar_cantidad(double monto){
        cantidad_inicial = monto;
    }
    
    public void Retirar_cantidad(double monto){
        cantidad_final = cantidad_inicial - monto;
    }
    
    public void Saludar(){
        System.out.println("Bienvenido " + titular);
    }
    
    public void ver_cantidad(){
        if(cantidad_final < 0){
            System.out.println("No tienes fondos suficientes");
            System.out.println("La cantidad faltante para completar el pago es de: $ " + (-cantidad_final));
            cantidad_final = cantidad_inicial;
            System.out.println("Tu cantidad de fondos totales es: $ " + cantidad_final);
        }
        else{
            System.out.println("La cantidad total es: $ " + cantidad_final);
        }
    }
}
