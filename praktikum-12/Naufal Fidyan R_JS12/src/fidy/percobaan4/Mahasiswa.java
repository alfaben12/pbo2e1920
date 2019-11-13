package fidy.percobaan4;

public class Mahasiswa {
    private String nama, alamat, nim;
    
    public Mahasiswa(String nama, String alamat, String nim){
        this.nama = nama;
        this.alamat = alamat;
        this.nim = nim;
    }
    
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getNim(){
        return nim;
    }
    
    
}
