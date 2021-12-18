
package exercise_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String nombre;
        String dni = "";
        int edad;
        float peso, altura;
        char sexo;
        
        System.out.print("Ingresar nombre: ");
        nombre = input.nextLine();
        System.out.print("\nIngresar edad: ");
        edad = input.nextInt();
        System.out.print("Ingresar sexo: ");
        sexo = input.next().charAt(0);
        System.out.print("Ingresar peso: ");
        peso = input.nextFloat();
        System.out.print("Ingresar altura: ");
        altura = input.nextFloat();
        
        Persona persona_1 = new Persona(nombre, edad, dni, sexo, peso, altura);
        
        persona_1.calcular_IMC();
        persona_1.es_mayor_de_edad();
        persona_1.generar_dni();
        persona_1.imprimir_informacion();
    }
}
