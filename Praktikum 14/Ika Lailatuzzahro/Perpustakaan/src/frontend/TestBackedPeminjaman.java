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
import backend.Anggota;
import backend.Peminjaman;
import backend.Buku;
public class TestBackedPeminjaman {
  public static void main(String[] args) {
        Anggota agt = new Anggota().getById(1);
        Buku TimunMas = new Buku().getById(3);
        Peminjaman peminjaman1 = new Peminjaman(agt, TimunMas, "2019/12/26", "2019/12/28");
        peminjaman1.save();
        for (Peminjaman p : new Peminjaman().getAll()) {
            System.out.println("Nama Peminjam : " + p.getAnggota().getNama() + "\n"
                    +"Nama Buku : " + p.getBuku().getJudul() + "\n"
                    +"Tanggal Pinjam: " + p.getTanggalpinjam() + "\n"
                    +"Tanggal Kembali: " + p.getTanggalkembali());
        }
    }
}
