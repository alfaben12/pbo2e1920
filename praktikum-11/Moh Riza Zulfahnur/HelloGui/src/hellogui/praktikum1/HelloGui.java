/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellogui.praktikum1;

/**
 *
 * @author Riza Zulfah
 */
import javax.swing.*;
public class HelloGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame;
        frame = new JFrame ("Ini Percobaan HelloGui Frame");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Program akan terhenti jika program di tutup
        frame.setSize(600, 300);//lebar, tinggi windows
        frame.setLocation(200, 300);//x,y tampilan pada windows
        //frame.setLocation(null); //menempatkan frame di tengah tengah layar
        frame.setVisible(true);//untuk menampilkan frame
    }
    
}
