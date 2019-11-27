package frontend;

import backend.*;

public class TestBackend {

    public static void main(String[] args) {
        Kategori novel = new Kategori("Novel", "Koleksi Majalah Bobo");
        Kategori referensi = new Kategori("Refrensi", "Koleksi Novel Baswedan");
        Buku buku1 = new Buku(novel, "Banyuwangi", "Sadewa", "Dharma");
        Buku buku2 = new Buku(referensi, "Aritmatik", "DianIlmu", "Kevin");
        Buku buku3 = new Buku(novel, "Batu itu Panas", "Erlangga", "Mat Sewoot");
        Anggota anggota1 = new Anggota("Dharma", "Jl. Soehatt", "082228868960");
        Anggota anggota2 = new Anggota("Alwy", "Jl. Alun-Alun", "081275364859");
        Anggota anggota3 = new Anggota("Kevin", "Jl. Batu", "081756386957");

        Peminjaman peminjaman1 = new Peminjaman(anggota1, buku1, "2019/11/27", "2019/12/14");
        Peminjaman peminjaman2 = new Peminjaman(anggota2, buku2, "2019/11/28", "2019/12/28");
        Peminjaman peminjaman3 = new Peminjaman(anggota3, buku3, "2019/11/14", "2019/12/19");
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
            System.out.println("Id Anggota: " + b.getAnggota().getIdanggota()+ ", idbuku: " + b.getBuku().getIdbuku() + ", Tgl Pinjam: " + b.getTanggalPinjam() + ", Tgl Kembali: " + b.getTanggalKembali());
        }
    }
}
