/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import backend.Anggota;
/**
 *
 * @author ojan
 */
public class TestBackendAnggota {
    public static void main(String[] args) {
        Anggota a1 = new Anggota("Kevin", "Batu", "081111111111");
        Anggota a2 = new Anggota("Alwi", "Jogja", "081234567890");
        Anggota a3 = new Anggota("Al", "Malang", "086666666666");

        // test insert
        a1.save();
        a2.save();
        a3.save();

        // test update
        a2.setAlamat("Banyuwangi");
        a2.save();

        // test delete
        a3.delete();

        // test select all
        for (Anggota a : new Anggota().getAll()) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ", Telepon: " + a.getTelepon());
        }

        // test search
        for (Anggota a : new Anggota().search("Kevin")) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ", Telepon: " + a.getTelepon());
        }
    }
}
