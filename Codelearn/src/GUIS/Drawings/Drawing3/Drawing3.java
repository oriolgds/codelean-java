package GUIS.Drawings.Drawing3;
import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
public class Drawing3 extends JFrame {
    Drawing3(){
        super("Drawing3 example");
        setSize(160, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        JButton btnSetText = new JButton("Set text");
        btnSetText.addActionListener(new btnSetTextEvent());

        cp.add(btnSetText);


        setVisible(true);
    }

    private static class btnSetTextEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            String s = JOptionPane.showInputDialog ( btn.getParent (), "Insert text: " );
        }
    }


    public static void main(String[] args) {
        new Drawing3();
    }
}
