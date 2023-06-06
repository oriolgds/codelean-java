package GUIS.Dialogs;

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
public class dialog1 extends JFrame {
    dialog1(){
        super("Dialog 1 example");
        setSize(200, 75);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        JButton b = new JButton("Press me!");
        b.addActionListener(new showDialog());
        cp.add(b);


        setVisible(true);
    }
    public static void main(String[] args) {
        dialog1 d = new dialog1();
    }
    private static class showDialog implements ActionListener {
        @Override
        public void actionPerformed ( ActionEvent e ) {

            JButton b = (JButton) e.getSource ();

            JOptionPane.showMessageDialog ( b.getParent (), "My first dialog!" );

        }
    }
}
