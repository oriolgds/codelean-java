package GUIS.Drawings.Drawing3;
import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
public class Drawing3 extends JFrame {
    protected Picture picture;
    Drawing3(){
        super("Drawing3 example");
        //setSize(160, 200);
        setSize(200, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        JButton btnSetText = new JButton("Set text");
        btnSetText.addActionListener(new btnSetTextEvent());

        cp.add(btnSetText, BorderLayout.NORTH);

        picture = new Picture("TEST");
        picture.setText("TEST2");

        cp.add(picture, BorderLayout.CENTER);


        // Buttons to change font size
        
        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new GridLayout(3, 1));
        String[] n = {"10", "20", "30"};
        for (String s : n) {
            JButton btn = new JButton(s);
            btn.addActionListener(new btnSetSizeEvent());
            eastPanel.add(btn);
        }
        cp.add(eastPanel, BorderLayout.EAST);


        setVisible(true);
    }

    private class btnSetTextEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            String s = JOptionPane.showInputDialog ( btn.getParent (), "Insert text: " );
            picture.setText(s);
        }
    }
    private class btnSetSizeEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            String s = btn.getText();
            System.out.println("Font Size: " + s);
            picture.changeFontSize(s);
        }

    }


    public static void main(String[] args) {
        new Drawing3();
    }
}
