package GUIS.Drawings.Drawing2;


import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class Drawing2 extends JFrame {
    private Picture picture;
    private Container cp;
    public Drawing2() {
        super("Drawing example 2");
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        setSize(160, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Picture picture = new Picture();
        picture.setText("INSERT");

        // Los dos botones
        JButton btnSet = new JButton("Set text");
        JButton btnClean = new JButton("Clear text");

        btnSet.addActionListener(new btnSetEvent());
        btnClean.addActionListener(new btnClearEvent());

        cp.add(btnSet, BorderLayout.NORTH);
        cp.add(picture, BorderLayout.CENTER);
        cp.add(btnClean, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Drawing2 drawing = new Drawing2();
        drawing.setVisible(true);
    }

    private class btnSetEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            picture.repaint();
            String s = JOptionPane.showInputDialog ( b.getParent (), "Insert text: " );
            picture.setText(s);
        }
    }
    private class btnClearEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            picture.repaint();
        }
    }
}

