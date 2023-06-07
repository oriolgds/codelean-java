package GUIS.Drawings.Drawing2;

import javax.swing.*;
import java.awt.*;

class Picture extends JPanel {
    private String text;
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Establecer color de dibujo a blanco
        g.setColor(Color.WHITE);
        // Crear rectángulo relleno
        g.fillRect(10, 10, 130, 100);

        // Establecer color de dibujo a verde
        g.setColor(Color.GREEN);
        // Establecer fuente del texto
        g.setFont(new Font("system-ui", Font.ITALIC, 20));
        // Crear cadena de texto
        g.drawString(text, 15, 50);
    }
    public void setText(String text){
        this.text = text;
    }
    @Override
    public void repaint() {
        super.repaint();
    }
}