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
 * @author Riza Zulfah
 */
public class MyInputForm extends JFrame{
     
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JLabel dLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JButton button1;
    private JPanel panel;
    private JPanel panel2;
    
    public MyInputForm(){
        createTextField();
        createTextField1();
        createButton();
        createButton1();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    private void createTextField(){
        aLabel = new JLabel("Nilai A : ");
        bLabel = new JLabel("Nilai B : ");
        cLabel = new JLabel("Hasil : ");
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
        
        
    }
    private void createTextField1(){
        aLabel = new JLabel("Nilai A : ");
        bLabel = new JLabel("Nilai B : ");
        cLabel = new JLabel("Hasil : ");
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
        
        
    }
    private void createButton(){
        button = new JButton("Calculate");//Untuk membuat tombol calculate
        class AddInterestListener implements ActionListener{
            //untuk klik
            @Override
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a*b;
                
                cLabel.setText("Hasil : "+c);
                
            }
        }
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }
    private void createButton1(){
        button = new JButton("Jumlah");//Untuk membuat tombol calculate
        class AddInterestListener implements ActionListener{
            //untuk klik
            @Override
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a+b;
                
                cLabel.setText("Hasil : "+c);
                
            }
        }
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }
    private void createPanel(){
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(cLabel);
        add(panel);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new MyInputForm ();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    
    }
}
