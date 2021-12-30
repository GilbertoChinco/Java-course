
package Events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana extends JFrame{
    private JPanel panel;
    private JLabel label, saludo;
    private JTextField cajaTexto;
    private JButton boton;
    
    public ventana(){
        setBounds(50, 50, 500, 500);
        setTitle("Eventos");
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarCajaTexto();
        colocarBoton();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    
    private void colocarEtiqueta(){
       label = new JLabel();
       label.setBounds(30, 10, 200, 30);
       panel.add(label);
    }
    
    private void colocarCajaTexto(){
        cajaTexto = new JTextField();
        cajaTexto.setBounds(30, 50, 300, 30);
        panel.add(cajaTexto);
    }
    
    private void colocarBoton(){
        boton = new JButton("Pulsa aqui");
        boton.setBounds(150, 100, 150, 40);
        panel.add(boton);
        
        saludo = new JLabel();
        saludo.setBounds(50, 200, 300, 40);
        panel.add(saludo);
        
        ActionListener oyenteAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saludo.setText("HOLA" + cajaTexto.getText() );
            }
        };
        
        boton.addActionListener(oyenteAccion);
    }
}
