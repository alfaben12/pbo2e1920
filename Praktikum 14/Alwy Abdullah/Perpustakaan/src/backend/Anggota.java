/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;

public class Anggota {
    private int idanggota;
    private String nama;
    private String alamat;
    private String telpon;

    public Anggota() {
    }

    public Anggota(String nama, String alamat, String telpon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telpon = telpon;
    }

    public int getIdanggota() {
        return idanggota;
    }

    public void setIdanggota(int idanggota) {
        this.idanggota = idanggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }
    
    public Anggota getById(int id){
        Anggota ang = new Anggota();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota "
                                            + "WHERE idanggota = '" + id + "'");
        
        try{
            while (rs.next()) {                
                ang = new Anggota();
                ang.setIdanggota(rs.getInt("idanggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelpon(rs.getString("telpon"));
                
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ang;
    }
    
    public ArrayList<Anggota> getAll(){
        ArrayList<Anggota> ListKategori = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota");
        
        try{
            while (rs.next()) { 
                Anggota ang = new Anggota();
                ang.setIdanggota(rs.getInt("idanggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelpon(rs.getString("telpon"));
                
                ListKategori.add(ang);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ListKategori;
    }
    
    public ArrayList<Anggota> search(String keyword){
        ArrayList<Anggota> listKategori = new ArrayList();
        
        String sql = "SELECT * FROM anggota WHERE "
                    + "     nama LIKE '%" + keyword + "%' "
                    + "     OR alamat LIKE '%" + keyword + "%' "
                    + "     OR telpon LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try{
            while (rs.next()) { 
                Anggota ang = new Anggota();
                ang.setIdanggota(rs.getInt("idanggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelpon(rs.getString("telpon"));
                
                listKategori.add(ang);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return listKategori;
    }
    
    public void save(){
        if (getById(idanggota).getIdanggota() == 0) {
            String SQL = "INSERT INTO anggota (nama, alamat, telpon) VALUES("
                    + "     '" + this.nama + "', "
                    + "     '" + this.alamat + "', "
                    + "     '" + this.telpon + "' "
                    + "     )";
            this.idanggota = DBHelper.insertQueryGetId(SQL);
        }
        else{
            String SQL = "UPDATE kategori SET "
                    + "     nama = '" + this.nama + "', "
                    + "     alamat = '" + this.alamat + "', "
                    + "     telpon = '" + this.telpon + "' "
                    + "     WHERE idanggota = '" + this.idanggota + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.idanggota + "'";
        DBHelper.executeQuery(SQL);
    }
}
