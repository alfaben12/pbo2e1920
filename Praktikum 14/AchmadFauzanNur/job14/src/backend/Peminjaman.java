/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.util.*;
import java.sql.*;
/**
 *
 * @author ojan
 */
public class Peminjaman {
    private int idpeminjaman, idanggota, idbuku;
    private Anggota ang = new Anggota();
    private Buku buku = new Buku();
    private String tanggalPinjam;
    private String tanggalKembali;

    public Peminjaman() {

    }

    public Peminjaman(Anggota ang, Buku buku, String tanggalPinjam, String tanggalKembali) {
        this.ang = ang;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public int getIdanggota() {
        return idanggota;
    }

    public void setIdanggota(int idanggota) {
        this.idanggota = idanggota;
    }

    public int getIdbuku() {
        return idbuku;
    }

    public void setIdbuku(int idbuku) {
        this.idbuku = idbuku;
    }

    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Anggota getAnggota() {
        return ang;
    }

    public void setAnggota(Anggota ang) {
        this.ang = ang;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public Peminjaman getById(int id) {
        Peminjaman pem = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + " p.idpeminjaman AS idpeminjaman, "
                + " p.tanggalpinjam AS tanggalpinjam, "
                + " p.tanggalkembali AS tanggalkembali, "
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
                + " FROM peminjaman p "
                + " LEFT JOIN buku b ON b.idbuku = p.idbuku "
                + " LEFT JOIN anggota a ON a.idanggota = p.idanggota"
                + " LEFT JOIN kategori k ON b.idkategori = k.idkategori"
                + " WHERE p.idpeminjaman = '" + id + "'");
        try {
            while (rs.next()) {
                pem = new Peminjaman();
                pem.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pem.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pem.getAnggota().setNama(rs.getString("nama"));
                pem.getAnggota().setAlamat(rs.getString("alamat"));
                pem.getAnggota().setTelepon(rs.getString("telepon"));
                pem.getBuku().setIdbuku(rs.getInt("idbuku"));
                pem.getBuku().getKategori().setIdkategori(rs.getInt("idkategori"));
                pem.getBuku().getKategori().setNama(rs.getString("nama"));
                pem.getBuku().getKategori().setKeterangan(rs.getString("keterangan"));
                pem.getBuku().setJudul(rs.getString("judul"));
                pem.getBuku().setPenerbit(rs.getString("penerbit"));
                pem.getBuku().setPenulis(rs.getString("penulis"));
                pem.setTanggalPinjam(rs.getString("tanggalPinjam"));
                pem.setTanggalKembali(rs.getString("tanggalPinjam"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pem;
    }

    public ArrayList<Peminjaman> getAll() {
        ArrayList<Peminjaman> ListPinjam = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + " p.idpeminjaman AS idpeminjaman, "
                + " p.tanggalpinjam AS tanggalpinjam, "
                + " p.tanggalkembali AS tanggalkembali, "
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
                + " FROM peminjaman p "
                + " LEFT JOIN buku b ON b.idbuku = p.idbuku "
                + " LEFT JOIN anggota a ON a.idanggota = p.idanggota"
                + " LEFT JOIN kategori k ON b.idkategori = k.idkategori");
        try {
            while (rs.next()) {
                Peminjaman pem = new Peminjaman();
                pem = new Peminjaman();
                pem.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pem.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pem.getAnggota().setNama(rs.getString("nama"));
                pem.getAnggota().setAlamat(rs.getString("alamat"));
                pem.getAnggota().setTelepon(rs.getString("telepon"));
                pem.getBuku().setIdbuku(rs.getInt("idbuku"));
                pem.getBuku().getKategori().setIdkategori(rs.getInt("idkategori"));
                pem.getBuku().getKategori().setNama(rs.getString("nama"));
                pem.getBuku().getKategori().setKeterangan(rs.getString("keterangan"));
                pem.getBuku().setJudul(rs.getString("judul"));
                pem.getBuku().setPenerbit(rs.getString("penerbit"));
                pem.getBuku().setPenulis(rs.getString("penulis"));
                pem.setTanggalPinjam(rs.getString("tanggalPinjam"));
                pem.setTanggalKembali(rs.getString("tanggalKembali"));
                
                ListPinjam.add(pem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPinjam;
    }

    public void save() {
        if (getById(idpeminjaman).getIdpeminjaman() == 0) {
            String sql = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) "
                    + "VALUES ("
                    + "'" + this.getAnggota().getIdanggota() + "', "
                    + "'" + this.getBuku().getIdbuku() + "',"
                    + "'" + this.tanggalPinjam + "', "
                    + "'" + this.tanggalKembali + "' "
                    + ")";
            this.idpeminjaman = DBHelper.insertQueryGetId(sql);
        } else {
            String sql = "UPDATE peminjaman SET "
                    + "idanggota = '" + this.getAnggota().getIdanggota() + "', "
                    + "idbuku = '" + this.getBuku().getIdbuku() + "', "
                    + "tanggalpinjam = '" + this.tanggalPinjam + "', "
                    + "tanggalkembali = '" + this.tanggalKembali + "'";
            DBHelper.executeQuery(sql);
        }
    }

    public void cariAnggota(int id) {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota WHERE idanggota = '" + id + "'");
        try {
            while (rs.next()) {
                getAnggota().setIdanggota(rs.getInt("idanggota"));
                getAnggota().setNama(rs.getString("nama"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cariBuku(int id) {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM buku WHERE idbuku = '" + id + "'");
        try {
            while (rs.next()) {
                getBuku().setIdbuku(rs.getInt("idbuku"));
                getBuku().setJudul(rs.getString("judul"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Peminjaman> search(String keyword){
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + " p.idpeminjaman AS idpeminjaman, "
                + " p.tanggalpinjam AS tanggalpinjam, "
                + " p.tanggalkembali AS tanggalkembali, "
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
                + " FROM peminjaman p "
                + " LEFT JOIN buku b ON b.idbuku = p.idbuku "
                + " LEFT JOIN anggota a ON a.idanggota = p.idanggota"
                + " LEFT JOIN kategori k ON b.idkategori = k.idkategori");
        try {
            while(rs.next()){
                Peminjaman pem = new Peminjaman();
                pem = new Peminjaman();
                pem.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pem.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pem.getAnggota().setNama(rs.getString("nama"));
                pem.getAnggota().setAlamat(rs.getString("alamat"));
                pem.getAnggota().setTelepon(rs.getString("telepon"));
                pem.getBuku().setIdbuku(rs.getInt("idbuku"));
                pem.getBuku().getKategori().setIdkategori(rs.getInt("idkategori"));
                pem.getBuku().getKategori().setNama(rs.getString("nama"));
                pem.getBuku().getKategori().setKeterangan(rs.getString("keterangan"));
                pem.getBuku().setJudul(rs.getString("judul"));
                pem.getBuku().setPenerbit(rs.getString("penerbit"));
                pem.getBuku().setPenulis(rs.getString("penulis"));
                pem.setTanggalPinjam(rs.getString("tanggalPinjam"));
                pem.setTanggalKembali(rs.getString("tanggalKembali"));
                
                ListPeminjaman.add(pem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPeminjaman;
    }
        
    public void delete() {
        String sql = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
        DBHelper.executeQuery(sql);
    }
}