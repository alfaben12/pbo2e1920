/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author Akhdan
 */
import java.awt.event.ActionEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.*;
public class MyInput extends Quiz2{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JPanel panel;
    
    public MyInput(){
        createTextField();
        createButton();
        setSize(FRAME_WIDTH, FRAME_WIDTH);
    }
    private void createTextField(){
        aLabel = new JLabel("Nama");
        bLabel = new JLabel("Telp");
        cLabel = new JLabel("Password");
        
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");  
    }
    private void createButton(){
        button = new JButton("Login");
        class AddinterestListener implements ActionListener{
            
            @Override
            public void actionPerformed(ActionEvent event){
                String Nama = String.valueOf(aField.getText());
                int Telp = Integer.valueOf(bField.getText());
                String Password = String.copyValueOf(cField.getText());
            }
        }    
    }
    private void setSize(){
        
    }
}   
