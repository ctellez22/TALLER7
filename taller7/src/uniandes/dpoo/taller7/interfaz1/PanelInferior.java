package uniandes.dpoo.taller7.interfaz1;

import javax.swing.*;
import java.awt.*;

public class PanelInferior extends JPanel {

    private JLabel labelJugadas;
    private JTextField textField1;
    private JLabel labelJugador;
    private JTextField textField2;



    public PanelInferior() {
        setLayout(new FlowLayout());

        labelJugadas = new JLabel("JUGADAS: ");
        textField1 = new JTextField(20);
        labelJugador = new JLabel("JUGADOR: ");
        textField2 = new JTextField(20);

        add(labelJugadas);
        add(textField1);
        add(labelJugador);
        add(textField2);
    }
}
