package GUIS.Alarma.Example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Example extends JFrame {

    private JButton bt;

    private JLabel lab;

    public Example() {

        super ( "Button" );

        setSize ( 200,100 );

        setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );

        Container cp = getContentPane ();

        cp.setLayout ( new FlowLayout () );

        bt = new JButton ( "Press me!" );

        bt.addActionListener ( new ButtonPressedEvent () );

        lab = new JLabel ( "" );

        cp.add ( bt );

        cp.add ( lab );

    }

    public static void main ( String args[] ) {

        Example obj = new Example();

        obj.setVisible ( true );

    }

    private class ButtonPressedEvent implements ActionListener {

        public void actionPerformed ( ActionEvent e ) {

            lab.setText("Button pressed");

        }

    }

}
