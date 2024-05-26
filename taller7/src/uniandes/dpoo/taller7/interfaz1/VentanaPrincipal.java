package uniandes.dpoo.taller7.interfaz1;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private PanelSuperior panelSuperior;
    private PanelDerecha panelDerecha;
    private PanelInferior panelInferior;
    private PanelTablero panelTablero;

    public VentanaPrincipal() {
        setTitle("JUEGUITO :) ");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // CREAR E INCLUIR LOS PANELES
        panelSuperior = new PanelSuperior();
        panelDerecha = new PanelDerecha();
        panelInferior = new PanelInferior();
        panelTablero = new PanelTablero();

        add(panelSuperior, BorderLayout.NORTH);
        add(panelDerecha, BorderLayout.EAST);
        add(panelInferior, BorderLayout.SOUTH);
        add(panelTablero, BorderLayout.CENTER);

        panelSuperior.setTama�oListener(new PanelSuperior.Tama�oSeleccionadoListener() {
            @Override
            public void tama�oSeleccionado(String tama�o) {
                // Parsear el tama�o seleccionado
                int tama�oInt = Integer.parseInt(tama�o.substring(0, 1));
                // Actualizar el tama�o del PanelTablero
                panelTablero.setTama�o(tama�oInt);
            }
        });

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crea la ventana principal y la hace visible
                VentanaPrincipal ventana = new VentanaPrincipal();
                ventana.setVisible(true);
            }
        });
    }
}
