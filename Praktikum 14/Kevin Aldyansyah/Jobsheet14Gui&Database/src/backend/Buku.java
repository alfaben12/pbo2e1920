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
 * @author Kevin
 */
public class Buku {
    private int idbuku;
    private Kategori kategori = new Kategori();
    private String judul;
    private String penerbit;
    private String penulis;
    
    public Buku() {

    }

    public Buku(Kategori kategori, String judul, String penerbit, String penulis) {
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }

    public int getIdbuku() {
        return idbuku;
    }

    public void setIdbuku(int idbuku) {
        this.idbuku = idbuku;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    public Buku getById(int id){
         Buku b = new Buku();
         ResultSet rs = DBHelper.selectQuery("SELECT "
                + "b.idbuku as idbuku, "
                + "b.judul as judul, "
                + "b.penerbit as penerbit, "
                + "b.penulis as penulis, "
                + "k.idkategori as idkategori, "
                + "k.nama as nama, "
                + "k.keterangan as keterangan "
                + "FROM buku b LEFT JOIN kategori k ON b.idkategori = k.idkategori WHERE b.idbuku = '" + id + "'");
         try {
            while(rs.next()){
                b = new Buku();
                b.setIdbuku(rs.getInt("idbuku"));
                b.getKategori().setIdkategori(rs.getInt("idkategori"));
                b.getKategori().setNama(rs.getString("nama"));
                b.getKategori().setKeterangan(rs.getString("keterangan"));
                b.setJudul(rs.getString("judul"));
                b.setPenerbit(rs.getString("penerbit"));
                b.setPenulis(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }
    public ArrayList<Buku> getAll(){
        ArrayList<Buku> ListBuku = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "b.idbuku as idbuku, "
                + "b.judul as judul, "
                + "b.penerbit as penerbit, "
                + "b.penulis as penulis, "
                + "k.idkategori as idkategori, "
                + "k.nama as nama, "
                + "k.keterangan as keterangan "
                + "FROM buku b LEFT JOIN kategori k ON b.idkategori = k.idkategori");
        try {
            while(rs.next()){
                Buku b = new Buku();
                b.setIdbuku(rs.getInt("idbuku"));
                b.getKategori().setIdkategori(rs.getInt("idkategori"));
                b.getKategori().setNama(rs.getString("nama"));
                b.getKategori().setKeterangan(rs.getString("keterangan"));
                b.setJudul(rs.getString("judul"));
                b.setPenerbit(rs.getString("penerbit"));
                b.setPenulis(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    public ArrayList<Buku> search(String keyword){
        ArrayList<Buku> ListBuku = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT b.idbuku as idbuku, "
                + "b.judul as judul, "
                + "b.penerbit as penerbit, "
                + "b.penulis as penulis, "
                + "k.idkategori as idkategori, "
                + "k.nama as nama, "
                + "k.keterangan as keterangan "
                + "FROM buku b LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                + "WHERE b.judul LIKE '%" + keyword + "%' "
                + " OR b.penerbit LIKE '%" + keyword + "%' "
                + " OR b.penulis LIKE '%" + keyword + "%' ");
        try {
            while(rs.next()){
                Buku b = new Buku();
                b.setIdbuku(rs.getInt("idbuku"));
                b.getKategori().setIdkategori(rs.getInt("idkategori"));
                b.getKategori().setNama(rs.getString("nama"));
                b.getKategori().setKeterangan(rs.getString("keterangan"));
                b.setJudul(rs.getString("judul"));
                b.setPenerbit(rs.getString("penerbit"));
                b.setPenulis(rs.getString("penulis"));
                ListBuku.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    public void save() {
        if (getById(idbuku).getIdbuku() == 0) {
            String sql = "INSERT INTO buku (judul, idkategori, penulis, penerbit) "
                    + "VALUES ("
                    + "'" + this.judul + "', "
                    + "'" + this.getKategori().getIdkategori() + "',"
                    + "'" + this.penulis + "', "
                    + "'" + this.penerbit + "' "
                    + ")";
            this.idbuku = DBHelper.insertQueryGetId(sql);
        } else {
            String sql = "UPDATE buku SET "
                    + "judul = '" + this.judul + "', "
                    + "idkategori = '" + this.getKategori().getIdkategori() + "', "
                    + "penulis = '" + this.penulis + "', "
                    + "penerbit = '" + this.penerbit + "' "
                    + "WHERE idbuku = '" + this.idbuku + "'";
            DBHelper.executeQuery(sql);
        }
    }

    public void delete() {
        String sql = "DELETE FROM buku WHERE idbuku = '" + this.idbuku + "'";
        DBHelper.executeQuery(sql);
    }
}
