
package exercise_4;
public class Carro {
    int x;
    int y;
    
    public Carro(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //Movimientos
    public void Izquierda(){
        System.out.println("Movimiento a la IZQUIERDA");
        System.out.println("Posicion anterior: (" + x + ", " + y + ")");
        x--;
        System.out.println("Posicion actual: (" + x + ", " + y + ")");
        System.out.println("//////////////////");
    }
    
    public void Derecha(){
        System.out.println("Movimiento a la DERECHA");
        System.out.println("Posicion anterior: (" + x + ", " + y + ")");
        x++;
        System.out.println("Posicion actual: (" + x + ", " + y + ")");
        System.out.println("//////////////////");
    }
    
    public void Arriba(){
        System.out.println("Movimiento hacia ARRIBA");
        System.out.println("Posicion anterior: (" + x + ", " + y + ")");
        y++;
        System.out.println("Posicion actual: (" + x + ", " + y + ")");
        System.out.println("//////////////////");
    }
    
    public void Abajo(){
        System.out.println("Movimiento hacia ABAJO");
        System.out.println("Posicion anterior: (" + x + ", " + y + ")");
        y--;
        System.out.println("Posicion actual: (" + x + ", " + y + ")");
        System.out.println("//////////////////");
    }
}
