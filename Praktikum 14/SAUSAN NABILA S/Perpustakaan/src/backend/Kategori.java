/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author 45U5
 */
import java.util.ArrayList;
import java.sql.*;

public class Kategori {

    private int idkategori;
    private String nama;
    private String keterangan;

    public Kategori(){
        
    }
    
    public Kategori(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    public int getIdkategori() {
        return idkategori;
    }

    public void setIdkategori(int idkategori) {
        this.idkategori = idkategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Kategori getById(int id) {
        Kategori kat = new Kategori();
        ResultSet rs = DBHelper.selectQuery("Select * from kategori where idkategori = '" + id + "'");
        try {
            while (rs.next()) {
                kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori> getAll() {
        ArrayList<Kategori> ListKategori = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("Select * from kategori");
        try {
            while (rs.next()) {
                Kategori kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori> search(String keyword) {
        ArrayList<Kategori> ListKategori = new ArrayList();
        String sql = "Select * from kategori where nama like '%" + keyword + "%' or keterangan like '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            while (rs.next()) {
                Kategori kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void save() {
        if (getById(idkategori).getIdkategori() == 0) {
            String sql = "Insert into kategori (nama, keterangan) values ('" + this.nama + "','" + this.keterangan + "')";
            this.idkategori = DBHelper.insertQueryGetId(sql);
        } else {
            String SQL = "Update kategori set nama = '" + this.nama + "', keterangan = '" + this.keterangan + "'"
                    + "where idkategori = '" + this.idkategori + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "Delete from kategori where idkategori = '" + this.idkategori + "'";
        DBHelper.executeQuery(SQL);
    }

    public String toString() {
        return nama;
    }
    
    
}

