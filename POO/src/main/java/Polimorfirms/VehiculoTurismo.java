
package Polimorfirms;

public class VehiculoTurismo extends Vehiculo{
    private int numeroPuertas;
    
    public VehiculoTurismo(int numeroPuertas, String Matricula, String Marca, String Modelo){
        super(Matricula, Marca, Modelo);
        this.numeroPuertas = numeroPuertas;
    }
    
    public int getPuertas(){
        return numeroPuertas;
    }
    
    @Override
    public String MostrarDatos(){
        return "Matricula: " + Matricula + "\nMarca: " + Marca + "\nModelo: " + Modelo + "\nNúmero de puertas: " + numeroPuertas;
    }
}
