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
        cp.setLayout(new BorderLayout());
        Container dataPanel = new Container ();
        dataPanel.setLayout(new FlowLayout());
        dataPanel.add ( new JLabel ( "Username:" ) );
        dataPanel.add ( new JTextField ( 15 ) );
        cp.add(dataPanel, BorderLayout.NORTH);

        String[] programmingLanguages = new String[]{"Python", "Java", "C++", "C#"};
        Container cp2 = new Container();
        GridLayout g1 = new GridLayout(programmingLanguages.length, 1);
        g1.setVgap(20);
        cp2.setLayout(g1);
        for (String pl:
             programmingLanguages) {
            cp2.add(new JRadioButton(pl));
        }
        cp.add(cp2, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        buttonPanel.add(new JButton("Accept"));
        buttonPanel.add(new JButton("Cancel"));
        cp.add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
    }
}
