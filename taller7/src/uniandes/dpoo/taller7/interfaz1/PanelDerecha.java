package uniandes.dpoo.taller7.interfaz1;



import javax.swing.*;
import java.awt.*;

public class PanelDerecha extends JPanel {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public PanelDerecha() {
        setLayout(new GridLayout(4, 1));

        button1 = new JButton("NUEVO ");
        button2 = new JButton("REINICIAR ");
        button3 = new JButton("TOP-10 ");
        button4 = new JButton("CAMBIAR JUGADOR ");
        
        
        
        add(button1);
        add(button2);
        add(button3);
        add(button4);
    }
}
