/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan.backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Dharma
 */
public class Kategori {
    private int idKategori;
    private String name;
    private String keterangan;

    public Kategori() {
    }

    public Kategori(String name, String keterangan) {
        this.name = name;
        this.keterangan = keterangan;
    }
    
    

    public void setIdKategori(int idKategori) {
        this.idKategori = idKategori;
    }

    public int getIdKategori() {
        return idKategori;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public Kategori getById(int id){
        Kategori kat = new Kategori();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori "
                + " WHERE idKategori = '" + id + "'");
        
        try {
            while (rs.next()) {                
                kat = new Kategori();
                kat.setIdKategori(rs.getInt("idkategori"));
                kat.setName(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return kat;
    }
    
    public ArrayList<Kategori> getAll(){
        ArrayList<Kategori> listKategori = new ArrayList<>();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori");
        
        try {
            while (rs.next()) {                
                Kategori kat = new Kategori();
                kat.setIdKategori(rs.getInt("idkategori"));
                kat.setName(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                
                listKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listKategori;
    }
    
    public ArrayList<Kategori> search(String keyword){
        ArrayList<Kategori> listKategori = new ArrayList<>();
        
        String sql = ("SELECT * FROM kategori WHERE "
                + " nama LIKE '%" + keyword + "%' "
                + " OR keterangan LIKE '%" + keyword + "%' ");
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try {
            while (rs.next()) {                
                Kategori kat = new Kategori();
                kat.setIdKategori(rs.getInt("idkategori"));
                kat.setName(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                
                listKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listKategori;
    }
    
    public void save(){
        if (getById(idKategori).getIdKategori() == 0) {
            String sql = "INSERT INTO kategori (nama, keterangan) VALUES("
                    + " '" + this.name + "', "
                    + " '" + this.keterangan + "' "
                    + " )";
            this.idKategori = DBHelper.insertQueryGetId(sql);
        }else {
            String sql = "UPDATE kategori SET "
                    + " nama = '" + this.name + "', "
                    + " keterangan = '" + this.keterangan + "' "
                    + " WHERE idkategori = '" + this.idKategori + "'";
            DBHelper.executeQuery(sql);
        }
    }

    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public void delete(){
        String sql = "DELETE FROM kategori WHERE idkategori = '" + this.idKategori + "'";
        DBHelper.executeQuery(sql);
    }
}
