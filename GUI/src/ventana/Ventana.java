
package ventana;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class Ventana extends JFrame{
    
    public Ventana(){
        //(width, height) - Tamaño de la ventana
        this.setSize(500, 500);
        //setLocation(450, 100);
        //setBounds(450, 100, 500, 500); //implement setSize & setLocation
        setLocationRelativeTo(null);  //Set the window in the middle in the monitor
        setMinimumSize(new Dimension(200, 200));
        setTitle("El mejor titulo");
        
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    private void iniciarComponentes(){
        JPanel panel = new JPanel();  //Create a panel
        panel.setLayout(null);
        this.getContentPane().add(panel);
        JLabel etiqueta = new JLabel(); //Create a label
        etiqueta.setBounds(100, 100, 100, 100);
        etiqueta.setForeground(Color.BLUE); //Cambiar color de las letras
        etiqueta.setText("HOLA");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta);
        etiqueta.setFont(new Font("arial", Font.PLAIN, 20));
    }
}
