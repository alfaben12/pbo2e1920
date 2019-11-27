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

    public void setIdbuku(int idbuku) {
        this.idbuku = idbuku;
    }

    public int getIdbuku() {
        return idbuku;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }
    
    public Buku getById(int id){
        Buku buku = new Buku();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + " b.idbuku AS idbuku, "
                + " b.judul AS judul, "
                + " b.penerbit AS penerbit, "
                + " b.penulis AS penulis, "
                + " k.idkategori AS idkategori, "
                + " k.nama AS nama, "
                + " k.keterangan AS keterangan "
                + " FROM buku b "
                + " LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                + " WHERE b.idbuku = '" + id + "'");
        
        try {
            while (rs.next()) {                
                buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setName(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return buku;
    }
    
    public ArrayList<Buku> getAll(){
        ArrayList<Buku> listAnggota = new ArrayList<>();
        
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + " b.idbuku AS idbuku, "
                + " b.judul AS judul, "
                + " b.penerbit AS penerbit, "
                + " b.penulis AS penulis, "
                + " k.idkategori AS idkategori, "
                + " k.nama AS nama, "
                + " k.keterangan AS keterangan "
                + " FROM buku b "
                + " LEFT JOIN kategori k ON b.idkategori = k.idkategori");
        
        try {
            while (rs.next()) {                
                Buku buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setName(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                listAnggota.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listAnggota;
    }
    
    public ArrayList<Buku> search(String keyword){
        ArrayList<Buku> listAnggota = new ArrayList<>();
        
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + " b.idbuku AS idbuku, "
                + " b.judul AS judul, "
                + " b.penerbit AS penerbit, "
                + " b.penulis AS penulis, "
                + " k.idkategori AS idkategori, "
                + " k.nama AS nama, "
                + " k.keterangan AS keterangan "
                + " FROM buku b "
                + " LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                + " WHERE b.judul LIKE '%" + keyword + "%' "
                + " OR b.penerbit LIKE '%" + keyword + "%' "
                + " OR b.penulis LIKE '%" + keyword + "%' ");
        
        try {
            while (rs.next()) {                
                Buku buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setName(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                listAnggota.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listAnggota;
    }
    
    public void save(){
        if (getById(idbuku).getIdbuku()== 0) {
            String sql = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES("
                    + " '" + this.judul + "', "
                    + " '" + this.getKategori().getIdKategori() + "', "
                    + " '" + this.penulis + "',"
                    + " '" + this.penerbit + "' "
                    + " )";
            this.idbuku = DBHelper.insertQueryGetId(sql);
        }else {
            String sql = "UPDATE buku SET "
                    + " judul = '" + this.judul + "', "
                    + " idkategori = '" + this.getKategori().getIdKategori() + "', "
                    + " penulis = '" + this.penulis + "',"
                    + " penerbit = '" + this.penerbit + "' "
                    + " WHERE idbuku = '" + this.idbuku + "'";
            DBHelper.executeQuery(sql);
        }
    }
    
    public void delete(){
        String sql = "DELETE FROM buku WHERE idbuku = '" + this.idbuku + "'";
        DBHelper.executeQuery(sql);
    }
    
    
}
