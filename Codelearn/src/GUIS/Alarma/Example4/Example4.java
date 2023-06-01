/***
 * Ejercicios de codelearn de la aventura de Java capitulo 5
 * Realizados por Oriol Giner Díaz
 */
package GUIS.Alarma.Example4;
import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
public class Example4 extends JFrame {
    private JComboBox petList;
    private static final String[] pets = {"Bird", "Cat", "Dog", "Rabbit", "Pig"};
    private JLabel petPreference;
    Example4(){
        super("Fourth example");
        setSize(350, 125);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Definir contenedor y layout
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(1, 2));

        // Crear paneles
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        // Constant label
        panel.add(new JLabel("Select your favourite pet:"));

        // Iniciar JCombo y definir contenido
        petList = new JComboBox(pets);
        panel.add(petList);

        // Añadir el panel al contenedor
        cp.add(panel);

        class ChosenAnimal implements ActionListener {
            @Override
            public void actionPerformed ( ActionEvent e ) {

                JComboBox cb = (JComboBox) e.getSource();

                String petname = (String) cb.getSelectedItem();

                petPreference.setText ( "Your favorite per is " + petname );

            }
        }




        setVisible(true);
    }

    public static void main(String[] args) {
        Example4 example4 = new Example4();
    }
}