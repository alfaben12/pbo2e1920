/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinputform;

/**
 *
 * @author ASUS
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyInputForm extends JFrame{
    private static final int FRAME_WIDTH = 600;
        private static final int FRAME_HEIGHT = 200;
        private JLabel aLabel;
        private JLabel bLabel;
        private JLabel cLabel;
        private JTextField aField;
        private JTextField bField;
        private JButton button;
        private JPanel panel;
        
        public MyInputForm(){
            createTextField();
            createButton();
            createPanel();
            setSize(FRAME_WIDTH, FRAME_WIDTH);
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new MyInputForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    }

    private void createTextField() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai B: ");
        cLabel = new JLabel("Hasil : ");
        
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }

    private void createButton() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        button = new JButton("Calculate");//untuk membuat tombol calculate
        class AddInterestListener implements ActionListener{
            //untuk event klik

            @Override
            public void actionPerformed(ActionEvent event) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                int a = Integer.valueOf(aField.getText());//mengambil inputan textbox
                int b = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil : " + c);
            }
        }
        ActionListener listener = new AddInterestListener();
        button.addActionListener (listener);
    }

    private void createPanel() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(cLabel);
        add(panel);
    }
}
    
