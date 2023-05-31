package GUIS.Alarma.Example2;

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;


public class Example2 extends JFrame {
    private boolean pressed = false;

    private JButton bt;

    private JLabel lab;

    public Example2 () {

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

        Example2 obj = new Example2 ();

        obj.setVisible ( true );

    }

    private class ButtonPressedEvent implements ActionListener {

        public void actionPerformed ( ActionEvent e ) {
            pressed = !pressed;
            if(pressed){
                lab.setText("Button pressed");
            }
            else {
                lab.setText("");
            }

        }

    }
}
