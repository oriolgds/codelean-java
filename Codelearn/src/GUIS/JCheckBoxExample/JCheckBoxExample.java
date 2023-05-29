package GUIS.JCheckBoxExample;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

public class JCheckBoxExample extends JFrame {
    JCheckBoxExample(String title, int width, int height){
        super(title);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        // Days panel
        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        JPanel panel = new JPanel();
        GridLayout g1 = new GridLayout(days.length, 1);
        g1.setVgap(20);
        panel.setLayout(g1);
        for (String d :
                days) {
            panel.add(new JCheckBox(d));
        }
        c.add(panel, BorderLayout.NORTH);


        // Button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        buttonPanel.add(new JButton("Accept"));
        buttonPanel.add(new JButton("Cancel"));
        c.add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
    }
}
