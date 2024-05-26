package uniandes.dpoo.taller7.interfaz1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class PanelTablero extends JPanel {

    private int tama�o;

    public PanelTablero() {
        
        this.tama�o = 5;
    }

    public void setTama�o(int tama�o) {
        this.tama�o = tama�o;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int lado = Math.min(getWidth(), getHeight()) / tama�o;

        // Dibujar el fondo
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Dibujar la cuadr�cula
        g2d.setColor(Color.BLACK);
        for (int i = 0; i < tama�o; i++) {
            for (int j = 0; j < tama�o; j++) {
                Rectangle2D square = new Rectangle2D.Double(i * lado, j * lado, lado, lado);
                g2d.draw(square);
            }
        }
    }
}
