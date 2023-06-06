package GUIS.Drawings.Drawing1;

import javax.swing.*;
import java.awt.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Drawing1 extends JFrame {
    public Drawing1() {
        Container container = getContentPane();
        setSize(150, 150);
        Picture picture = new Picture();
        container.add(picture);
    }

    public static void main(String[] args) {
        Drawing1 drawing = new Drawing1();
        drawing.setVisible(true);
    }
}

