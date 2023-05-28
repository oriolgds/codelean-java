package GUIS.GridTest;

import javax.swing.*;
import java.awt.*;

public class GridTest extends JFrame {
    GridTest(String title){
        super(title);
        super.setSize(400, 200);
        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        GridLayout gridLayout = new GridLayout(1, 3);
        gridLayout.setHgap(5);
        gridLayout.setVgap(5);
        cp.setLayout(gridLayout);
        cp.add(new JButton("First button"));
        cp.add(new JButton("Second button"));
        cp.add(new JButton("Third button"));

    }
}
