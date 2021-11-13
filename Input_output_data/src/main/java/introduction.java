
import javax.swing.JOptionPane;


/**
 * Input and output of data with JoptionPane
 */
public class introduction {
    public static void main(String[] args){
        String chain;
        int v_n;
        char v_c;
        double v_d;
        
        //JOption.showInputDialog -- Open a small windows to digits our data, it's a string
        // Integer.parseInt("Srting") -- function to transform data "String" --> Int
        
        chain = JOptionPane.showInputDialog("Input a chain of characters: ");
        v_n = Integer.parseInt(JOptionPane.showInputDialog("Input a integer number: "));
        v_c = JOptionPane.showInputDialog("Type a letter").charAt(0);
        v_d = Double.parseDouble(JOptionPane.showInputDialog("Type a double number: "));
        
        JOptionPane.showMessageDialog(null, "The chain is: " + chain);
        JOptionPane.showMessageDialog(null, "The integer number is: " + v_n);
        JOptionPane.showMessageDialog(null, "the letter is: " + v_c);
        JOptionPane.showMessageDialog(null, "the double number is: " + v_d);
        
    }
}
