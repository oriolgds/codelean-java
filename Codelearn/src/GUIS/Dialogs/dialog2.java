package GUIS.Dialogs;

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class dialog2 extends JFrame {
    private JLabel question;
    private JButton bt;
    dialog2(){
        super("Dialog 2 example");
        setSize(new Dimension(350, 75));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create container
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        // Initialize attributes
        question = new JLabel("What's your name? ");
        bt = new JButton("Answer");


        setVisible(true);
    }


    private class showDialog implements ActionListener {
        @Override
        public void actionPerformed ( ActionEvent e ) {

            JButton b = (JButton) e.getSource ();

            String name = JOptionPane.showInputDialog ( b.getParent (), "Enter your name:", "");

            if ( name.equals("") ) {

                question.setText ( "Are you sure you have written your name correctly?" );

            } else {

                question.setText ( "Nice to meet you " + name + "!" );

                bt.setVisible ( false );

            }

        }
    }
}
