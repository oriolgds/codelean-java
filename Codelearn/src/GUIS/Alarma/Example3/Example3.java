package GUIS.Alarma.Example3;

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class Example3 extends JFrame {
    private JButton sum;
    private JButton sub;
    private JTextField txf1;
    private JTextField txf2;
    private JLabel lab;

    Example3(String title, int width, int height){
        super(title);
        setSize(width, height);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear contenedor
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(3, 1));

        // Crear los JPanel
        JPanel textPane = new JPanel();
        JPanel buttonPane = new JPanel();

        // Iniciando atributos (textField)
        txf1 = new JTextField(10);
        txf2 = new JTextField(10);
        // Añadir al panel
        textPane.add(txf1);
        textPane.add(txf2);

        // Iniciando atributos (botones)
        sum = new JButton("Sum");
        sub = new JButton("Substract");
        // Añadir al panel
        buttonPane.add(sum);
        buttonPane.add(sub);

        // Iniciando atributos (JLabel) (donde se muestra el resultado)
        lab = new JLabel("Realiza una operación");

        // ActionListeners
        sum.addActionListener(new ButtonPressedEventSum());
        sub.addActionListener(new ButtonPressedEventMinus());

        cp.add(textPane);
        cp.add(buttonPane);
        cp.add(lab);
        setVisible(true);
    }
    private class ButtonPressedEventSum implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            int a, b;

            a = Integer.parseInt(txf1.getText());

            b = Integer.parseInt(txf2.getText());

            lab.setText("The sum of " + txf1.getText() + " and " + txf2.getText() + " is " + String.valueOf(a+b));
        }
    }
    private class  ButtonPressedEventMinus extends ButtonPressedEventSum {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            int a, b;

            a = Integer.parseInt(txf1.getText());

            b = Integer.parseInt(txf2.getText());

            lab.setText("The substraction of " + txf1.getText() + " and " + txf2.getText() + " is " + String.valueOf(a-b));
        }
    }


    public static void main(String[] args) {
        Example3 example3 = new Example3("Third example", 350, 125);
    }
}

