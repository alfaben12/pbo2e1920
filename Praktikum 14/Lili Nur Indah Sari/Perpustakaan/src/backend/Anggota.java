package backend;

import java.util.*;
import java.sql.*;

public class Anggota {
    private int idanggota;
    private String nama;
    private String alamat;
    private String telepon;

    public Anggota(){
        
    }
    
    public Anggota(String nama, String alamat, String telepon){
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
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

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    public Anggota getById(int id){
        Anggota ag = new Anggota();
        ResultSet rs = DBHelper.selectQuery("Select * from anggota where idanggota = '" + id + "'");
        try{
            while(rs.next()){
                ag = new Anggota();
                ag.setIdanggota(rs.getInt("idanggota"));
                ag.setNama(rs.getString("nama"));
                ag.setAlamat(rs.getString("alamat"));
                ag.setTelepon(rs.getString("telepon"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ag;
    }
    
    public ArrayList<Anggota> getAll(){
        ArrayList<Anggota> ListAnggota = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("Select * from anggota");
        try{
            while(rs.next()){
                Anggota ag = new Anggota();
                ag.setIdanggota(rs.getInt("idanggota"));
                ag.setNama(rs.getString("nama"));
                ag.setAlamat(rs.getString("alamat"));
                ag.setTelepon(rs.getString("telepon"));
                ListAnggota.add(ag);
            }
        }catch(Exception e ){
            e.printStackTrace();
        }
        return ListAnggota;
    }
    
    public ArrayList<Anggota> search(String keyword){
        ArrayList<Anggota> ListAnggota = new ArrayList();
        String sql = "Select * from anggota where nama like '%" + keyword + "%' or alamat like '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(sql);
        try{
            while(rs.next()){
                Anggota ag = new Anggota();
                ag.setIdanggota(rs.getInt("idanggota"));
                ag.setNama(rs.getString("nama"));
                ag.setAlamat(rs.getString("alamat"));
                ag.setTelepon(rs.getString("telepon"));
                ListAnggota.add(ag);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ListAnggota;
    }
    
    public void save(){
        if(getById(idanggota).getIdanggota() == 0){
            String sql = "Insert into anggota (nama, alamat, telepon) values ('" + this.nama +"','" + this.alamat +"','" + this.telepon + "')";
            this.idanggota = DBHelper.insertQueryGetId(sql);
        }else{
            String SQL = "Update anggota set nama = '" + this.nama + "', alamat = '" + this.alamat +"', telepon = '" + this.telepon + "'"
                    + "where idanggota = '" + this.idanggota +"'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "Delete from anggota where idanggota = '" + this.idanggota + "'";
        DBHelper.executeQuery(SQL);
    }
    
}
