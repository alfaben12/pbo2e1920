/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.*;

/**
 *
 * @author Shirogami
 */
public class TestBackendBuku {
    public static void main(String[] args) {
        Kategori novel = new Kategori().getById(1);
        Kategori referensi = new Kategori().getById(3);

        Buku buku1 = new Buku(novel, "Nartoohhh", "Elex Media", "Kang Udin");
        Buku buku2 = new Buku(referensi, "Cara memahami kata Terserah", "Springer", "Julyo");
        Buku buku3 = new Buku(novel, "Cara mendapatkan 1000$ tanpa keluar rumah, WoW", "Erlangga", "Budi");

        // test insert
        buku1.save();
        buku2.save();

        // test update
        buku2.setJudul("Aljabar Linier");
        buku2.save();

        // test delete
        buku3.delete();

        // test select all
        for(Buku b : new Buku().getAll())
        {
        System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }

        // test search
        for(Buku b : new Buku().search("timun"))
        {
        System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }

    }
}
