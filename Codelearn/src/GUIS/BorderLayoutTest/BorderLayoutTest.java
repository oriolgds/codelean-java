package GUIS.BorderLayoutTest;

import javax.swing.*;
import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class BorderLayoutTest extends JFrame {
    BorderLayoutTest(String title, int weight, int height){
        super(title);
        super.setSize(weight, height);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        BorderLayout borderLayout = new BorderLayout();
        borderLayout.setHgap(10);
        borderLayout.setVgap(10);
        cp.add(new JButton("Button 1"), BorderLayout.NORTH);
        cp.add(new JButton("Button 2"), BorderLayout.SOUTH);
        cp.add(new JButton("Button 3"), BorderLayout.EAST);
        cp.add(new JButton("Button 4"), BorderLayout.WEST);
        cp.add(new JButton("Button 5"), BorderLayout.CENTER);
    }
}
