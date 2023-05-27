package GUIS;

import javax.swing.*;
import javax.swing.*;

import java.awt.*;

import java.awt.event.*;
import java.io.IOException;

public class WindowTest {

    public static void main ( String[] args) {

        JEditorPane website = null;
        try {
            website = new JEditorPane("http://oriol.22web.org/");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        website.setEditable(false);

        JFrame frame = new JFrame("Google");
        frame.add(new JScrollPane(website));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();

    }

}
