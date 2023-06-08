package GUIS.Drawings.Drawing3;
import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
public class Picture extends JPanel {
    private String text;
    private Color color;
    private int size;
    Picture(String text){
        this.text = text;
        this.color = Color.GREEN;
        this.size = 20;
    }
    public void setText(String text){
        this.text = text;
        this.repaint();
    }
    public void setColor(String _color){
        if(_color == "Red"){
            this.color = Color.RED;
        } else if (_color == "Black"){
            this.color = Color.BLACK;
        } else if(_color == "Green"){
            this.color = Color.GREEN;
        }
        else {
            this.color = Color.BLACK;
        }
        this.repaint();
    }
    public void changeFontSize(String s){
        if(s.equals("10")){
            this.size = 10;
        } else if (s.equals("20")){
            this.size = 20;
        } else if (s.equals("30")) {
            this.size = 30;
        }
        else {
            this.size = 20;
        }
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(10, 10, 130, 100);
        g.setColor(this.color);
        g.setFont ( new Font ( "", Font.ITALIC, size ) );
        g.drawString(text, 15, 50);
    }
}
