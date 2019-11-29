/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.*;

/**
 *
 * @author riza
 */
public class TestBackend1 {
        public static void main(String[] args) {
        Anggota ang1 = new Anggota("Moh", "Jl. Senggani", "081259720051");
        Anggota ang2 = new Anggota("Riza", "Jl. Mawar", "08625123523");
        Anggota ang3 = new Anggota("Zulfahnur", "Jl. Melati", "08125264713");

        // test insert
        ang1.save();
        ang2.save();
        ang3.save();

        // test update
        ang2.setAlamat("Jl. Tak Berarah");
        ang2.save();

        // test delete
        ang3.delete();

        // test select all
        for (Anggota a : new Anggota().getAll()) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat()+ ", Telepon: "+a.getTelepon());
        }

        // test search
        for (Anggota a : new Anggota().search("moh")) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat()+ ", Telepon: "+a.getTelepon());
        }
    }
}
