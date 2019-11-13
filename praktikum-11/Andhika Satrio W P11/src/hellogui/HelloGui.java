/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellogui;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
public class HelloGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame;
        frame = new JFrame("ini percobaan HelloGui Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//program akan berhenti jika ditutup
        frame.setSize(600,300);//lebar tinggi windows
        frame.setLocation(200,200);//x,y tampilan pada windows
        //frame.setLocationRelativeTo(null);//menempatan frame di tengah" layar
        frame.setVisible(true);//untuk menampilkan frme
        
    }
    
}
