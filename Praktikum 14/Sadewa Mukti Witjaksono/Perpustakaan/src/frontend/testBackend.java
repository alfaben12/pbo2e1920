/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author mispan
 */
import backend.*;
public class testBackend {

    public static void main(String[] args) {    
        Anggota ang1 = new Anggota("Altalarik", "Malang", "08113500191");
        Anggota ang2 = new Anggota("Alwi", "Bali", "081137726");
        Anggota ang3 = new Anggota("Kepin", "Batu", "0899128372");
        
        ang1.save();
        ang2.save();
        ang3.save();
        
        for(Anggota a : new Anggota().getAll())         
        {             
            System.out.println("Nama: " + a.getNama() + ", alamat: " + a.getAlamat() + ", telepon: " + a.getTelepon());         
        }                  
        // test search         
        for(Anggota a : new Anggota().search("Alwi"))         
        {             
            System.out.println("Nama: " + a.getNama() + ", alamat: " + a.getAlamat() + ", telepon: " + a.getTelepon());         
        }
        
        
    }
}
