package GUIS.JSpinnerExample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JSpinnerExample extends JFrame {
    JSpinnerExample(String title, int width, int height){
        super(title);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        String[] s = {"Python", "C++", "Java", "C#"};

        SpinnerListModel listModel = new SpinnerListModel (s);

        JSpinner spinner = new JSpinner ( listModel);

        cp.add(spinner);


        setVisible(true);
    }
}
