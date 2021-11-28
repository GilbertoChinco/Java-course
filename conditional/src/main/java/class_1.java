
import javax.swing.JOptionPane;


/* If sentence

    if (condition){
        instruction1;
    }
    else{
        instruction2;
    }

    ==  -->  Equal
    !=  -->  Disequal
    >   -->  Higher than
    <   -->  Lower than
    <=
    >=

*/

public class class_1 {
    public static void main(String[] args){
        int n, dato = 5;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digit a number"));
        
        if (n == dato){
            JOptionPane.showMessageDialog(null, "the number is 5");
        }
        else{
            JOptionPane.showMessageDialog(null, "the number is different to 5");
        }
    
    }
}
