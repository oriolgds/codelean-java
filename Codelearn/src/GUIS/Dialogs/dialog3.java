package GUIS.Dialogs;
import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
public class dialog3 extends JFrame {
    dialog3(){
        super("Dialog3 example");
        setSize(350, 75);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        JButton btn = new JButton("Close window");
        btn.addActionListener(new showDialog());
        cp.add(btn);
        setVisible(true);
    }

    public static void main(String[] args) {
        dialog3 d = new dialog3();
    }

    private class showDialog implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource ();
            int a = JOptionPane.showConfirmDialog ( b.getParent () , "Are you sure you want to quit?", "Exit confirmation", JOptionPane.YES_NO_OPTION );
            if ( a == JOptionPane.YES_OPTION ){
                System.exit (0);
            }
        }
    }
}
