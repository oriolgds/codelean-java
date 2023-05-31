package GUIS.JPasswordExample;

import javax.swing.*;
import java.awt.*;

public class JPasswordExample extends JFrame {
    JPasswordExample(String title, int width, int height){
        super(title);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());

        jPanel.add ( new JLabel ( "Enter password:" ) );
        jPanel.add ( new JPasswordField ( 10 ));


        cp.add(jPanel);
        setVisible(true);

    }
}
