package GUIS.JRadioButtonExample;
import javax.swing.*;

import java.awt.*;

import java.awt.event.*;
public class JRadioButtonExample extends JFrame {
    JRadioButtonExample(String title, int width, int height){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);


        Container cp = getContentPane();



        setVisible(true);
    }
}
