/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;


/**
 *
 * @author Dharma
 */
public class TestBackend {

    public static void main(String[] args) {
        Kategori novel = new Kategori("Majalah", "Koleksi Majalah Bobo");
        Kategori referensi = new Kategori("Novel", "Koleksi Novel Baswedan");
        Buku buku1 = new Buku(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku buku2 = new Buku(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku buku3 = new Buku(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        Anggota anggota1 = new Anggota("Dharma", "Jl. Soehatt", "082228868960");
        Anggota anggota2 = new Anggota("Alwy", "Jl. Alun-Alun", "081275364859");
        Anggota anggota3 = new Anggota("Kevin", "Jl. Batu", "081756386957");
        
        Peminjaman peminjaman1 = new Peminjaman(anggota1, buku1, "2019/11/27" , "2019/11/30");
        Peminjaman peminjaman2 = new Peminjaman(anggota2, buku2, "2019/11/27" , "2019/11/30");
        Peminjaman peminjaman3 = new Peminjaman(anggota3, buku3, "2019/11/27" , "2019/11/30");
// test insert
        
        novel.save();
        referensi.save();
        
        buku1.save();
        buku2.save();
        buku3.save();
        
        anggota1.save();
        anggota2.save();
        anggota3.save();
        
        peminjaman1.save();
        peminjaman2.save();
        peminjaman3.save();
// test select all
        for (Peminjaman b : new Peminjaman().getAll()) {
            System.out.println("Id Anggota: " + b.getAnggota().getIdAnggota() + ", idbuku: " + b.getBuku().getIdbuku() + ", Tgl Pinjam: " + b.getTanggalPinjam() + ", Tgl Kembali: " + b.getTanggalKembali());
        }
// test search
        for (Peminjaman b : new Peminjaman().search("Dharma")) {
            System.out.println("Id Anggota: " + b.getAnggota().getIdAnggota() + ", idbuku: " + b.getBuku().getIdbuku() + ", Tgl Pinjam: " + b.getTanggalPinjam() + ", Tgl Kembali: " + b.getTanggalKembali());
        }
    }
}
