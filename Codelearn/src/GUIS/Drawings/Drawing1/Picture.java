package GUIS.Drawings.Drawing1;
import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
class Picture extends JPanel {
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
        g.setFont(new Font("", Font.ITALIC, 20));
        // Crear cadena de texto
        g.drawString("CODELEARN", 15, 50);
    }
}