
package encapsulamiento;

public class main {
    public static void main(String[] args){
        clase_1 objeto_1 = new clase_1();
        
        objeto_1.set_edad(10);
        System.out.println("La edad es: " + objeto_1.get_edad());
        
        objeto_1.set_nombre("Chinco");
        System.out.println("EL nombre es: " + objeto_1.get_nombre());
    }
}
