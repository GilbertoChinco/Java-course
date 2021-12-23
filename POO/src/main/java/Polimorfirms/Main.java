
package Polimorfirms;

public class Main {
    public static void main(String[] args){
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo("123A", "Audi", "R8");
        misVehiculos[1] = new VehiculoDeportivo(8, "123B", "Lamborguini", "Huracan");
        misVehiculos[2] = new VehiculoFurgoneta(100, "123C", "Mercedez", "G5");
        misVehiculos[3] = new VehiculoTurismo(4, "123D", "Nissan", "Aston Martin");
        
        for(Vehiculo vehiculo:misVehiculos){
            System.out.println("///////////");
            System.out.println(vehiculo.MostrarDatos());
            
        }
    }
}
