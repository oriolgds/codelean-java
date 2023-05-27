package GUIS.WindowRightFL;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class WindowRightFL extends JFrame {
    WindowRightFL(){
        JFrame f = new JFrame("Example Window");


        Container cp = getContentPane();

        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setAlignment(FlowLayout.RIGHT);



        cp.add(new JButton("Where am I?"));
        cp.setLayout(flowLayout);
    }
}
