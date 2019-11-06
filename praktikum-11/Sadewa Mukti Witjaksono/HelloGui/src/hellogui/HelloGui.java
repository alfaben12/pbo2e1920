/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellogui;

/**
 *
 * @author mispan
 */
import javax.swing.*;
public class HelloGui {

    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame frame;
        frame = new JFrame("Ini percobaan HelloGui Frame");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Program akan berhenti jika tertutup
                        frame.setSize(600, 300);//lebar, tinggi windows
                        frame.setLocation(200, 200);//x,y tampilan pada windows
                        frame.setVisible(true);// untuk menampilkan frame
    }
}