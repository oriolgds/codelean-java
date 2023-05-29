package GUIS.JPanelExample;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JPanelExample extends JFrame {
    JPanelExample(String title, int width, int height){
        super(title);

        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        JPanel dataPanel = new JPanel ();
        dataPanel.setLayout(new FlowLayout());
        dataPanel.add ( new JLabel ( "Name:" ) );
        dataPanel.add ( new JTextField ( 10 ) );



        JPanel dataPanel1 = new JPanel();
        dataPanel1.setLayout(new FlowLayout());

        dataPanel1.add(new JButton("Accept"));
        dataPanel1.add(new JButton("Cancel"));

        cp.add(dataPanel, BorderLayout.NORTH);
        cp.add(dataPanel1, BorderLayout.SOUTH);

        setVisible(true);
    }
}
