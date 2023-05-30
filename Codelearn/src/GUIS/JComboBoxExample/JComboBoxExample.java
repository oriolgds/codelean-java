package GUIS.JComboBoxExample;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

public class JComboBoxExample extends JFrame {
    JComboBoxExample(String title, int width, int height){
        super(title);
        setSize(width, height);
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Combo box
        String[] s = {"Python", "Java", "C++", "C#"};
        JComboBox cb1 = new JComboBox(s);
        cb1.setSelectedIndex (0);
        cp.add(cb1, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        buttonPanel.add(new JButton("Accept"));
        buttonPanel.add(new JButton("Cancel"));
        cp.add(buttonPanel, BorderLayout.SOUTH);


        setVisible(true);
    }
}
