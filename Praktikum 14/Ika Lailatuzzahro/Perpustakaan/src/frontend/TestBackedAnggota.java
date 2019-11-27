/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author ELA-PC
 */
import backend.*;
public class TestBackedAnggota {
    public static void main(String[] args) {
        Anggota agt1 = new Anggota("Ika Laila", "Jombang", "085123456789");
        Anggota agt2 = new Anggota("Ika", "Malang", "081123456789");
        Anggota agt3 = new Anggota("Laila", "Surabaya", "088123456789");
        
        //test insert
        agt1.save();
        agt2.save();
        agt3.save();
        
        //test update
        agt2.setAlamat("Jawa Timur");
        agt2.save();
        
        //test delete
        agt3.delete();
        
        //tes select all
        for(Anggota k : new Anggota().getAll()){
            System.out.println("Nama: " + k.getNama() + ", Alamat : " + k.getAlamat() + ", Telepon : " + k.getTelepon());
        }
        
        //test search
        for(Anggota a : new Anggota().search("Timur")){
            System.out.println("Nama: " + a.getNama() + ", Alamat : " + a.getAlamat() + ", Telepon : " + a.getTelepon());
        }
    }
}

