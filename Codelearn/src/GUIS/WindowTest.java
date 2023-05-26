package GUIS;

import javax.swing.*;

public class WindowTest {

    public static void main ( String[] args) {

        JFrame f = new JFrame( "Window title" );

        f.setSize ( 400, 300 );

        f.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );

        f.setVisible ( true );

    }

}
