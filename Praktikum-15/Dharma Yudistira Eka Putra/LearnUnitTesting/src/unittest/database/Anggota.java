/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Dharma
 */
public class Anggota {
    private int idAnggota;
    private String nama;
    private String alamat;
    private String telepon;

    public Anggota() {
    }

    public Anggota(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    
    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getTelepon() {
        return telepon;
    }
    
    public Anggota getById(int id){
        Anggota anggota = new Anggota();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota "
                + " WHERE idanggota = '" + id + "'");
        
        try {
            while (rs.next()) {                
                anggota = new Anggota();
                anggota.setIdAnggota(rs.getInt("idanggota"));
                anggota.setNama(rs.getString("nama"));
                anggota.setAlamat(rs.getString("alamat"));
                anggota.setTelepon(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return anggota;
    }
    
    public ArrayList<Anggota> getAll(){
        ArrayList<Anggota> listAnggota = new ArrayList<>();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota");
        
        try {
            while (rs.next()) {                
                Anggota anggota = new Anggota();
                anggota.setIdAnggota(rs.getInt("idanggota"));
                anggota.setNama(rs.getString("nama"));
                anggota.setAlamat(rs.getString("alamat"));
                anggota.setTelepon(rs.getString("telepon"));
                
                listAnggota.add(anggota);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listAnggota;
    }
    
    public ArrayList<Anggota> search(String keyword){
        ArrayList<Anggota> listAnggota = new ArrayList<>();
        
        String sql = ("SELECT * FROM anggota WHERE "
                + " nama LIKE '%" + keyword + "%' "
                + " OR alamat LIKE '%" + keyword + "%' "
                + " OR telepon LIKE '%" + keyword + "%' ");
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try {
            while (rs.next()) {                
                Anggota anggota = new Anggota();
                anggota.setIdAnggota(rs.getInt("idanggota"));
                anggota.setNama(rs.getString("nama"));
                anggota.setAlamat(rs.getString("alamat"));
                anggota.setTelepon(rs.getString("telepon"));
                
                listAnggota.add(anggota);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listAnggota;
    }
    
    public void save(){
        if (getById(idAnggota).getIdAnggota() == 0) {
            String sql = "INSERT INTO anggota (nama, alamat, telepon) VALUES("
                    + " '" + this.nama + "', "
                    + " '" + this.alamat + "', "
                    + " '" + this.telepon + "' "
                    + " )";
            this.idAnggota = DBHelper.insertQueryGetId(sql);
        }else {
            String sql = "UPDATE anggota SET "
                    + " nama = '" + this.nama + "', "
                    + " alamat = '" + this.alamat + "', "
                    + " telepon = '" + this.telepon + "' "
                    + " WHERE idanggota = '" + this.idAnggota + "'";
            DBHelper.executeQuery(sql);
        }
    }
    
    public void delete(){
        String sql = "DELETE FROM anggota WHERE idanggota = '" + this.idAnggota + "'";
        DBHelper.executeQuery(sql);
    }
    
    public ArrayList<Anggota> getByNamaAlamatAndTelepon(String nama, String alamat, String telepon) {
        ArrayList<Anggota> ListKategori = new ArrayList();
        ResultSet rs = null;
        if ((nama.trim().length() > 0) && (alamat.trim().length() > 0) && (telepon.trim().length() > 0)) {
            rs = DBHelper.selectQuery("SELECT * FROM anggota Where nama = '" + nama + "' and alamat = '" + alamat + "' and telepon ='" + telepon + "'");
        } else if ((nama.trim().length() > 0) && (alamat.trim().length() == 0) && (telepon.trim().length() == 0)) {
            rs = DBHelper.selectQuery("SELECT * FROM anggota Where nama = '" + nama + "'");
        } else if ((nama.trim().length() == 0) && (alamat.trim().length() > 0) && (telepon.trim().length() == 0)) {
            rs = DBHelper.selectQuery("SELECT * FROM anggota Where alamat = '" + alamat + "'");
        } else if ((nama.trim().length() == 0) && (alamat.trim().length() == 0) && (telepon.trim().length() > 0)) {
            rs = DBHelper.selectQuery("SELECT * FROM anggota Where telepon = '" + telepon + "'");
        }
        
        try {
            while (rs.next()) {
                Anggota kat = new Anggota();
                kat.setIdAnggota(rs.getInt("idanggota"));
                kat.setNama(rs.getString("nama"));
                kat.setAlamat(rs.getString("alamat"));
                kat.setTelepon(rs.getString("telepon"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }
    
}
