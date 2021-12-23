
package Polimorfirms;

public class VehiculoFurgoneta extends Vehiculo{
    private int Carga;
    
    public VehiculoFurgoneta(int Carga, String Matricula, String Marca, String Modelo){
        super(Matricula, Marca, Modelo);
        this.Carga = Carga;
    }
    
    public int getCarga(){
        return Carga;
    }
    
    @Override
    public String MostrarDatos(){
        return "Matricula: " + Matricula + "\nMarca: " + Marca + "\nModelo: " + Modelo + "\nCarga: " + Carga; 
    }
}
