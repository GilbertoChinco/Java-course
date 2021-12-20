
package exercise_5;
public class Vehiculo {
    private String Marca;
    private String Modelo;
    private int Precio;
    
    public Vehiculo(String Marca, String Modelo, int Precio){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Precio = Precio;
    }
    
    public void get_datos(){
        System.out.println("La marca: " + Marca);
        System.out.println("El modelo: " + Modelo);
        System.out.println("El precio: " + Precio);
    }
    
    public int get_precio(){
        return Precio;
    }
}
