package GUIS.Alarma.Example3;

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class Example3 extends JFrame {
    private JButton sum;
    private JButton sub;
    private JTextField txf1;
    private JTextField txf2;
    private JLabel lab;

    Example3(String title, int width, int height){
        super(title);
        setSize(width, height);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);






        setVisible(true);
    }
}
