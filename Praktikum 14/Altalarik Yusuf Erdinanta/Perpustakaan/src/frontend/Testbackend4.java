/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Anggota;
import backend.Buku;
import backend.Kategori;
import backend.Peminjaman;

/**
 *
 * @author Altalarikyusuf
 */
public class Testbackend4 {
    public static void main(String[] args) {
        Kategori novel = new Kategori("Majalah", "Koleksi Majalah Bobo");
        Kategori referensi = new Kategori("Novel", "Koleksi Novel Baswedan");
        
        Buku buku1 = new Buku(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku buku2 = new Buku(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku buku3 = new Buku(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        
        Anggota ang1 = new Anggota("Farid", "Jl. Jekardah", "082318868160");
        Anggota ang2 = new Anggota("Riza", "Jl. Bojonegoro", "081275365132");
        Anggota ang3 = new Anggota("Lexi", "Jl. Batu Kidul", "08175123957");
        
        Peminjaman peminjaman1 = new Peminjaman(ang1, buku1, "2019/08/10" , "2019/08/20");
        Peminjaman peminjaman2 = new Peminjaman(ang2, buku2, "2019/08/10" , "2019/08/20");
        Peminjaman peminjaman3 = new Peminjaman(ang3, buku3, "2019/08/10" , "2019/08/20");

        // test insert        
        novel.save();
        referensi.save();
        
        buku1.save();
        buku2.save();
        buku3.save();
        
        ang1.save();
        ang2.save();
        ang3.save();
        
        peminjaman1.save();
        peminjaman2.save();
        peminjaman3.save();
        
        // test select all
        for (Peminjaman b : new Peminjaman().getAll()) {
            System.out.println("Id Anggota: " + b.getAnggota().getIdanggota() + ", idbuku: " + b.getBuku().getIdbuku() + ", Tgl Pinjam: " + b.getTanggalpinjam() + ", Tgl Kembali: " + b.getTanggalkembali());
        }
       // test search
        for (Peminjaman b : new Peminjaman().search("Riza")) {
            System.out.println("Id Anggota: " + b.getAnggota().getIdanggota() + ", idbuku: " + b.getBuku().getIdbuku() + ", Tgl Pinjam: " + b.getTanggalpinjam() + ", Tgl Kembali: " + b.getTanggalkembali());
        }
    }
}
