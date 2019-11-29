/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan.backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Dharma
 */
public class Peminjaman {
    private int idPeminjaman;
    private Anggota anggota = new Anggota();
    private Buku buku = new Buku();
    private String tanggalPinjam;
    private String tanggalKembali;

    public Peminjaman() {
    }

    public Peminjaman(Anggota anggota, Buku buku, String tanggalPinjam, String tanggalKembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.idPeminjaman = idPeminjaman;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public void setIdPeminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public int getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }
    
    public Peminjaman getById(int id){
        Peminjaman peminjaman = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + " p.idpeminjaman AS idpeminjaman, "
                + " p.tanggalpinjam AS tanggalpinjam, "
                + " p.tanggalkembali AS tanggalkembali,"
                + " a.idanggota AS idanggota, "
                + " a.nama AS nama, "
                + " a.alamat AS alamat, "
                + " a.telepon AS telepon, "
                + " b.idbuku AS idbuku, "
                + " b.judul AS judul, "
                + " b.penerbit AS penerbit, "
                + " b.penulis AS penulis, "
                + " k.idkategori AS idkategori, "
                + " k.nama AS nama, "
                + " k.keterangan AS keterangan "
                + " FROM peminjaman p"
                + " LEFT JOIN anggota a ON a.idanggota = p.idanggota "
                + " LEFT JOIN buku b ON b.idbuku = p.idbuku "
                + " LEFT JOIN kategori k ON k.idkategori = b.idkategori "
                + " WHERE p.idpeminjaman = '" + id + "'");
        
        try {
            while (rs.next()) {
                peminjaman = new Peminjaman();
                peminjaman.setIdPeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdAnggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getAnggota().setAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().getKategori().setIdKategori(rs.getInt("idkategori"));
                peminjaman.getBuku().getKategori().setName(rs.getString("nama"));
                peminjaman.getBuku().getKategori().setKeterangan(rs.getString("keterangan"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.getBuku().setPenerbit(rs.getString("penerbit"));
                peminjaman.getBuku().setPenulis(rs.getString("penulis"));
                peminjaman.setTanggalPinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalKembali(rs.getString("tanggalkembali"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return peminjaman;
    }
    
    public ArrayList<Peminjaman> getAll(){
        ArrayList<Peminjaman> listAnggota = new ArrayList<>();
        
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + " p.idpeminjaman AS idpeminjaman, "
                + " p.tanggalpinjam AS tanggalpinjam, "
                + " p.tanggalkembali AS tanggalkembali,"
                + " a.idanggota AS idanggota, "
                + " a.nama AS nama, "
                + " a.alamat AS alamat, "
                + " a.telepon AS telepon, "
                + " b.idbuku AS idbuku, "
                + " b.judul AS judul, "
                + " b.penerbit AS penerbit, "
                + " b.penulis AS penulis, "
                + " k.idkategori AS idkategori, "
                + " k.nama AS nama, "
                + " k.keterangan AS keterangan "
                + " FROM peminjaman p"
                + " LEFT JOIN anggota a ON a.idanggota = p.idanggota "
                + " LEFT JOIN buku b ON b.idbuku = p.idbuku "
                + " LEFT JOIN kategori k ON k.idkategori = b.idkategori ");
        
        try {
            while (rs.next()) {                
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setIdPeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdAnggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getAnggota().setAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().getKategori().setIdKategori(rs.getInt("idkategori"));
                peminjaman.getBuku().getKategori().setName(rs.getString("nama"));
                peminjaman.getBuku().getKategori().setKeterangan(rs.getString("keterangan"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.getBuku().setPenerbit(rs.getString("penerbit"));
                peminjaman.getBuku().setPenulis(rs.getString("penulis"));
                peminjaman.setTanggalPinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalKembali(rs.getString("tanggalkembali"));
                
                listAnggota.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listAnggota;
    }
    
    public ArrayList<Peminjaman> search(String keyword){
        ArrayList<Peminjaman> listAnggota = new ArrayList<>();
        
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + " p.idpeminjaman AS idpeminjaman, "
                + " p.tanggalpinjam AS tanggalpinjam, "
                + " p.tanggalkembali AS tanggalkembali,"
                + " a.idanggota AS idanggota, "
                + " a.nama AS nama, "
                + " a.alamat AS alamat, "
                + " a.telepon AS telepon, "
                + " b.idbuku AS idbuku, "
                + " b.judul AS judul, "
                + " b.penerbit AS penerbit, "
                + " b.penulis AS penulis, "
                + " k.idkategori AS idkategori, "
                + " k.nama AS nama, "
                + " k.keterangan AS keterangan "
                + " FROM peminjaman p"
                + " LEFT JOIN anggota a ON a.idanggota = p.idanggota "
                + " LEFT JOIN buku b ON b.idbuku = p.idbuku "
                + " LEFT JOIN kategori k ON k.idkategori = b.idkategori "
                + " WHERE a.idanggota LIKE '%" + keyword + "%' "
                + " OR b.idbuku LIKE '%" + keyword + "%' ");
        
        try {
            while (rs.next()) {                
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setIdPeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdAnggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getAnggota().setAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().getKategori().setIdKategori(rs.getInt("idkategori"));
                peminjaman.getBuku().getKategori().setName(rs.getString("nama"));
                peminjaman.getBuku().getKategori().setKeterangan(rs.getString("keterangan"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.getBuku().setPenerbit(rs.getString("penerbit"));
                peminjaman.getBuku().setPenulis(rs.getString("penulis"));
                peminjaman.setTanggalPinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalKembali(rs.getString("tanggalkembali"));
                
                listAnggota.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listAnggota;
    }
    
    public void save(){
        if (getById(idPeminjaman).getIdPeminjaman()== 0) {
            String sql = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES("
                    + " '" + this.anggota.getIdAnggota()+ "', "
                    + " '" + this.buku.getIdbuku()+ "', "
                    + " '" + this.tanggalPinjam + "',"
                    + " '" + this.tanggalKembali + "' "
                    + " )";
            this.idPeminjaman = DBHelper.insertQueryGetId(sql);
        }else {
            String sql = "UPDATE peminjaman SET "
                    + " idanggota = '" + this.anggota.getIdAnggota() + "', "
                    + " idbuku = '" + this.buku.getIdbuku() + "', "
                    + " tanggalpinjam = '" + this.tanggalPinjam + "',"
                    + " tanggalkembali = '" + this.tanggalKembali + "' ";
            DBHelper.executeQuery(sql);
        }
    }
    
    public void delete(){
        String sql = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idPeminjaman + "'";
        DBHelper.executeQuery(sql);
    }
    
}
