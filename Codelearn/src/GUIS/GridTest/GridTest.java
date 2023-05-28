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
        GridLayout gridLayout = new GridLayout(4, 3);
        gridLayout.setHgap(15);
        gridLayout.setVgap(15);
        cp.setLayout(gridLayout);

        String[] a = new String[]{"-", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", "*", "+", "#"};
        for (String b:
             a) {
            cp.add(new JButton(b));
        }

    }
}
