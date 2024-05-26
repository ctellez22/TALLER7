package uniandes.dpoo.taller7.interfaz1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelSuperior extends JPanel {

    private JLabel labelTamaño;
    private JLabel labelDificultad;

    private JComboBox<String> comboBox;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;

    private ButtonGroup buttonGroup;

    private TamañoSeleccionadoListener tamañoListener;

    public PanelSuperior() {
        setLayout(new FlowLayout());

        labelTamaño = new JLabel("TAMAÑO:");
        labelDificultad = new JLabel("Dificultad:  ");
        comboBox = new JComboBox<>(new String[]{"5x5", "6x6", "7x7"});
        radioButton1 = new JRadioButton("FACIL ");
        radioButton2 = new JRadioButton("MEDIO ");
        radioButton3 = new JRadioButton("DIFICIL ");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        add(labelTamaño);
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
                if (tamañoListener != null) {
                    tamañoListener.tamañoSeleccionado(seleccion);
                }
            }
        });
    }

    public void setTamañoListener(TamañoSeleccionadoListener listener) {
        this.tamañoListener = listener;
    }

    public interface TamañoSeleccionadoListener {
        void tamañoSeleccionado(String tamaño);
    }
}
