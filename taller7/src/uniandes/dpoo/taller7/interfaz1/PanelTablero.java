package uniandes.dpoo.taller7.interfaz1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class PanelTablero extends JPanel {

    private int tamaño;

    public PanelTablero() {
        
        this.tamaño = 5;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int lado = Math.min(getWidth(), getHeight()) / tamaño;

        // Dibujar el fondo
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Dibujar la cuadrícula
        g2d.setColor(Color.BLACK);
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                Rectangle2D square = new Rectangle2D.Double(i * lado, j * lado, lado, lado);
                g2d.draw(square);
            }
        }
    }
}
