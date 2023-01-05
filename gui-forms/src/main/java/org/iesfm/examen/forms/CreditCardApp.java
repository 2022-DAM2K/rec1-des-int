package org.iesfm.examen.forms;

import javax.swing.*;
import java.util.List;

public class CreditCardApp {
    public JPanel mainPanel;
    private JTable creditCardTable;
    private JButton addButton;
    private JButton deleteButton;

    public CreditCardApp() {

        List<CreditCard> creditCards = List.of(
                new CreditCard(10000000, "Visa", 100, "Bob Esponja"),
                new CreditCard(650000000, "MasterCard", 132, "Pocoyo"),
                new CreditCard(1000560070, "American Express", 430, "George Pig")
        );

        // TODO configura aquí la tabla


        // TODO configura aquí la navegación desde el botón de añadir

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        CreditCardApp myForm = new CreditCardApp();
        frame.setContentPane(myForm.mainPanel);
        frame.pack();
        frame.setVisible(true);
        frame.repaint();
        frame.revalidate();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
