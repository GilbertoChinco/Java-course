
package exercise_9;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        String apellido;
        int dorsal;
        String Posicion;
        
        Persona entrenador = new Entrenador("Ofensiva", "Camille", 35, "Auditore");
        Persona jugadores[] = new Futbolista[2];
        
        
        for(int i = 0; i < 2; i++){
            input.nextLine();
            System.out.println("Ingresar nombre: ");
            nombre = input.nextLine();
            System.out.println("ingresar apellido");
            apellido = input.nextLine();
            System.out.println("Ingresar edad: ");
            edad = input.nextInt();
            System.out.println("Ingresar numero de camiseta: ");
            dorsal = input.nextInt();
            System.out.println("Ingresar posicion: ");
            Posicion = input.nextLine();
            
            jugadores[i] = new Futbolista(nombre, edad, apellido, dorsal, Posicion);
        }
        
        Persona doctor = new Doctor(10, "Terapeuta", "Dr house", 56, "Frederich");
        
        System.out.println(entrenador.toString());
        System.out.println(doctor.toString());
        
        for(Persona jugador: jugadores){
            System.out.println(jugador.toString());
        }
        
        
    }
}
