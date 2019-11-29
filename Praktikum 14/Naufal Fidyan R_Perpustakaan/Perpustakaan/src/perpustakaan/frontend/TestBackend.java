package perpustakaan.frontend;
import perpustakaan.backend.*;

public class TestBackend {
    public static void main(String[] args) {
        /*Kategori kat1 = new Kategori("Novel", "Koleksi buku novel");
        Kategori kat2 = new Kategori("Referensi", "Buku referensi ilmiah");
        Kategori kat3 = new Kategori("Komik", "Komik anak-anak");
        
        //insert
        kat1.save();
        kat2.save();
        kat3.save();
        
        //update
        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();
        
        //delete
        kat3.delete();

        //select all
        for(Kategori k : new Kategori().getAll())
        {
        System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }

        //search
        for(Kategori k : new Kategori().search("ilmiah"))
        {
        System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }*/
        
        /*Anggota ang1 = new Anggota("Tomi", "Jl. Cengkeg", "08123456");
        Anggota ang2 = new Anggota("Bono", "Jl. Durian", "089788667");
        Anggota ang3 = new Anggota("Sulton", "Jl. Sesama", "0852233334");
        
        //insert
        ang1.save();
        ang2.save();
        ang3.save();
        
        //update
        ang2.setAlamat("Jl. Protokol");
        ang2.save();
        
        //delete
        ang3.delete();

        //select all
        for(Anggota a : new Anggota().getAll())
        {
        System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ", Telepon: " + a.getTelepon());
        }

        //search
        for(Anggota a : new Anggota().search("Protokol"))
        {
        System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ", Telepon: " + a.getTelepon());
        }*/
        
        Kategori novel = new Kategori().getById(27);
 Kategori referensi = new Kategori().getById(28);

 Buku buku1 = new Buku(novel, "Timun Mas", "Elex Media", "Bang Supit");
 Buku buku2 = new Buku(referensi, "Metode Linier", "Springer", "Alex Baldwin");
 Buku buku3 = new Buku(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");

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
