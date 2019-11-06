/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellogui;

/**
 *
 * @author Vivi Agustina
 */
import javax.swing.*;

public class HelloGui {
    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame("ini percobaan HelloGui Frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //program berhenti jika ditutup
            frame.setSize(600, 300); //lebar, tinggi windows
            frame.setLocation(0, 0); //x,y tampilan pada windows
            //frame.setLocationRelativeTo(null);
            //menempatkan frame ditengah tenga layar
            frame.setVisible(true); //untuk menampilkan true
      
    }
}
