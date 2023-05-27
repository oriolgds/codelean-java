package GUIS.WindowLeftFL;

import javax.swing.*;

import java.awt.*;

public class WindowLeftFL extends JFrame {
    WindowLeftFL(String title){
        super(title);
        super.setSize(500, 75);


        Container cp = getContentPane();

        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setAlignment(FlowLayout.LEFT);



        cp.add(new JButton("I am the first button"));
        cp.add(new JButton("I am the second button"));
        cp.setLayout(flowLayout);
    }
}
