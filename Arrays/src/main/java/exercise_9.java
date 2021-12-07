
import java.util.Scanner;
public class exercise_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] Estudiante_1_A = new int[3];
        int[] Estudiante_2_A = new int[3];
        String[] parcial = {"Primer", "Segundo", "Tercer"};
        int calif_final_1_A = 0;
        int calif_final_2_A = 0;
 
        
        int cnt = 0;
        System.out.println("Ingresa Calficaciones del Grupo A");
        
        for(int i = 0; i < 2; i++){
            System.out.println("Ingresa calificación del alumno " + (i + 1) + ": ");
            for(int k = 0; k < 3; k++){
                switch(cnt){
                    case 0:
                        System.out.println("Ingresar Calificacion del " + parcial[k] +" parcial: ");
                        Estudiante_1_A[k] = input.nextInt();
                        calif_final_1_A += Estudiante_1_A[k];
                        break;
                    case 1:
                        System.out.println("Ingresar Calificacion del " + parcial[k] +" parcial:");
                        Estudiante_2_A[k] = input.nextInt();
                        calif_final_2_A += Estudiante_2_A[k];
                        break;
                }
            }
           cnt++; 
        }
        float prom_1_A = (float) calif_final_1_A / 3;
        float prom_2_A = (float) calif_final_2_A / 3;
        int n;
        System.out.println("Ingresar el número del alumno");
        n = input.nextInt();
        switch(n){
            case 1:
                System.out.println("Calificación final del alumno 1 del grupo A: " + prom_1_A);
                break;
            case 2:
                System.out.println("Calificación final del alumno 2 del grupo A: " + prom_2_A);
            break;
        }
        float prom_A = (prom_1_A + prom_2_A) / 2;
        System.out.println("El promedio de los alumnos del grupo A es de: " + prom_A);
    }
}
