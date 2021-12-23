
package Polimorfirms;

public class VehiculoDeportivo extends Vehiculo{
    private int Cilindros;
    
    public VehiculoDeportivo(int Cilindros, String Matricula, String Marca, String Modelo){
        super(Matricula, Marca, Modelo);
        this.Cilindros = Cilindros;
    }
    
    public int getCilindros(){
        return Cilindros;
    }
    
    @Override
    public String MostrarDatos(){
        return "Matricula: " + Matricula + "\nMarca: " + Marca + "\nModelo: " + Modelo + "\nNúmero de Cilindros: " + Cilindros;
    }
}
