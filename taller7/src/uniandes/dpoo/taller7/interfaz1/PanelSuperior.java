package uniandes.dpoo.taller7.interfaz1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelSuperior extends JPanel {

    private JLabel labelTama�o;
    private JLabel labelDificultad;

    private JComboBox<String> comboBox;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;

    private ButtonGroup buttonGroup;

    private Tama�oSeleccionadoListener tama�oListener;

    public PanelSuperior() {
        setLayout(new FlowLayout());

        labelTama�o = new JLabel("TAMA�O:");
        labelDificultad = new JLabel("Dificultad:  ");
        comboBox = new JComboBox<>(new String[]{"5x5", "6x6", "7x7"});
        radioButton1 = new JRadioButton("FACIL ");
        radioButton2 = new JRadioButton("MEDIO ");
        radioButton3 = new JRadioButton("DIFICIL ");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        add(labelTama�o);
        add(comboBox);
        add(labelDificultad);
        add(radioButton1);
        add(radioButton2);
        add(radioButton3);

        // Agregar ActionListener al JComboBox
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seleccion = (String) comboBox.getSelectedItem();
                if (tama�oListener != null) {
                    tama�oListener.tama�oSeleccionado(seleccion);
                }
            }
        });
    }

    public void setTama�oListener(Tama�oSeleccionadoListener listener) {
        this.tama�oListener = listener;
    }

    public interface Tama�oSeleccionadoListener {
        void tama�oSeleccionado(String tama�o);
    }
}
