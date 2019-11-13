/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinputform;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Dharma
 */
public class MyInputForm extends JFrame {

    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton buttonMultiply;
    private JButton buttonAdd;
    private JPanel panel;

    public MyInputForm() {
        createTextField();
        multiplication();
        addition();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextField() {
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai B: ");
        cLabel = new JLabel("Hasil: ");

        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }

    private void multiplication() {
        buttonMultiply = new JButton("Perkalian");
        class addInterestListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent ae) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil: " + c);
            }
        }
        ActionListener listener = new addInterestListener();
        buttonMultiply.addActionListener(listener);
    }

    private void addition() {
        buttonAdd = new JButton("Penjumlahan");
        class addInterestListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent ae) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a + b;
                cLabel.setText("Hasil: " + c);
            }
        }
        ActionListener listener = new addInterestListener();
        buttonAdd.addActionListener(listener);
    }

    private void createPanel() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(buttonMultiply);
        panel.add(buttonAdd);
        panel.add(cLabel);
        add(panel);
    }

    public static void main(String[] args) {
        JFrame frame = new MyInputForm();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

}
