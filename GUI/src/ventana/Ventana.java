
package ventana;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class Ventana extends JFrame{
    public JPanel panel;
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
        colocarPaneles();
        //colocarEtiquetas();
        //colocarBotones();
        //colocarRadioBotones();
        //cajasTexto();
        //colocarAreasTexto();
        colocarListasDesplegables();
    }
    
    private void colocarPaneles(){
        panel = new JPanel();  //Create a panel
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    
    private void colocarEtiquetas(){
        JLabel etiqueta = new JLabel(); //Create a label
        etiqueta.setBounds(100, 100, 100, 100);
        etiqueta.setForeground(Color.BLUE); //Cambiar color de las letras
        etiqueta.setText("HOLA");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta);
        etiqueta.setFont(new Font("arial", Font.PLAIN, 20));
    }
    
    private void colocarBotones(){
        JButton boton1 = new JButton();
        boton1.setBounds(100, 100, 100, 40);
        boton1.setText("Aceptar");
        boton1.setEnabled(true); //Interacion del boton
        boton1.setMnemonic('a'); //Establecemos alt + letra
        panel.add(boton1);
    }
    
    private void colocarRadioBotones(){
        JRadioButton radioboton1 = new JRadioButton("Opcion 1", true);
        radioboton1.setBounds(50, 100, 100, 50);
        panel.add(radioboton1);
         
        JRadioButton radioboton2 = new JRadioButton("Opcion 2", false);
        radioboton2.setBounds(50, 150, 100, 50);
        panel.add(radioboton2);
        
        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioboton1);
        grupoRadioBotones.add(radioboton2);
    }
    
    private void cajasTexto(){
        JTextField cajatexto = new JTextField();
        cajatexto.setBounds(50, 50, 100, 30);
        cajatexto.setText("HOLA");
        panel.add(cajatexto);
        System.out.println("Texto en la caja texto" + cajatexto.getText());
    }
    
    private void colocarAreasTexto(){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 300, 200);
        panel.add(areaTexto);
        
    }
    
    private void colocarListasDesplegables(){
        String [] paises = {"Preu", "Colombia", "Paraguay", "Ecuador"};
        JComboBox listadesplegable1 = new JComboBox(paises);
        listadesplegable1.setBounds(20, 20, 100, 30);
        panel.add(listadesplegable1);
    }
}
