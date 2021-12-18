
package Sobrecarga_metodos;

public class main {
    public static void main(String[] args){
        persona persona_1 = new persona("chinco", 22);
        persona_1.correr();
        
        persona persona_2 = new persona("123456798");
        persona_2.correr(100);
    }
}
