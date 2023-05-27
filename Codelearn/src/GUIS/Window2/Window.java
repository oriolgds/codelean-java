package GUIS.Window2;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class Window extends JFrame {
    public static void main() {
        JFrame f = new JFrame("Toggle Button Window");
        f.setSize(300, 75);

        f.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );

        Container cp = f.getContentPane();
        cp.setLayout ( new FlowLayout() );
        JButton b = new JButton("Press me");
        cp.add(b);
        f.setVisible ( true );
    }
    Window(){
        main();
    }

}
