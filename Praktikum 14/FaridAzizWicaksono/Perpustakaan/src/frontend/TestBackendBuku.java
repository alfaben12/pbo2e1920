package frontend;

import backend.*;

public class TestBackendBuku {
    public static void main(String[] args){
        Kategori horor = new Kategori().getById(27);
        Kategori komedi = new Kategori().getById(28);
        
        Buku buku1 = new Buku(horor, "Kuyang Dayak", "Abank Irenk", "Bang Ramli");
        Buku buku2 = new Buku(komedi, "Mr.Bean", "Jamal Production", "Dobleh");
        Buku buku3 = new Buku(horor, "Pocong Gimbal", "Disney", "Mat Solar");
        
        buku1.save();
        buku2.save();
       
        buku2.setJudul("Cara cepat subnetting");
        buku2.save();
      
        buku3.delete();
        
        for(Buku b : new Buku().getAll()){
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
        // test search
        for(Buku b : new Buku().search("timun")){
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
    }
}
