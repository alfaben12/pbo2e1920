/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellogui;

/**
 *
 * @author Kian Arata
 */
import javax.swing.*;
public class HelloGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    JFrame frame;
    frame = new JFrame ("ini percobaan HelloGui Frame");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Berhenti Ketika sudah tertutup
    frame.setSize(600, 300); //Lebar, Tinggi Windows
    frame.setLocation(200, 200);//x,y tampil pada windows
    //frame.setLocationRelativeTo(null);//menempatkan frame ditengah-tengah layar
    frame.setVisible(true);// menampilkan frame
    
}
}