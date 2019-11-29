/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author Altalarikyusuf
 */
import backend.*;
public class Testbackend2 {
    
    public static void main(String[] args) {
        
        Anggota ang1 = new Anggota("Sadewa", "Banyuwangi", "08213413231");
        Anggota ang2 = new Anggota("Alwy", "Embong Arab", "0821343211");
        Anggota ang3 = new Anggota("Kepin", "Batu", "08213413277");
        Anggota ang4 = new Anggota("Dharma", "Sidoarjo", "08215413277");
        
        //test insert
        ang1.save();
        ang2.save();
        ang3.save();
        ang4.save();
        
        //test update
        ang1.setAlamat("Malang");
        ang1.save();
        
        //test select all
        for(Anggota a : new Anggota().getAll()){
            System.out.println("Nama : "+ a.getNama() + ", Alamat : " + a.getAlamat() + ", Telepon : " + a.getTelepon());
        }
        
        //test search
        for(Anggota a : new Anggota().search("Sadewa")){
            System.out.println("Nama : "+ a.getNama() + ", Alamat : " + a.getAlamat() + ", Telepon : " + a.getTelepon());
        }
    }
}
