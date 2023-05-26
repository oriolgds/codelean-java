package GUIS.Window;

import javax.swing.*;

public class Window extends JFrame {
    public static void main() {
        JFrame f = new JFrame("My First GUI");
        f.setSize(200, 200);

        f.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        f.setVisible ( true );
    }
    Window(){
        main();
    }
}
