/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.tugas;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author asus
 */
public class Anggota {
    private int idanggota;
    private String nama;
    private String alamat;
    private String telp;

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

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public Anggota() {
    }

    public Anggota(String nama, String alamat, String telp) {
        this.nama = nama;
        this.alamat = alamat;
        this.telp = telp;
    }
    
    public Anggota getById(int id) {
        Anggota agt = new Anggota();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota " + " WHERE idAnggota = '" + id + "'");

        try {
            while (rs.next()) {
                agt = new Anggota();
                agt.setIdanggota(rs.getInt("idanggota"));
                agt.setNama(rs.getString("nama"));
                agt.setAlamat(rs.getString("alamat"));
                agt.setTelp(rs.getString("telp"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return agt;
    }

    public ArrayList<Anggota> getAll() {
        ArrayList<Anggota> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota agt = new Anggota();
                agt.setIdanggota(rs.getInt("idanggota"));
                agt.setNama(rs.getString("nama"));
                agt.setAlamat(rs.getString("alamat"));
                agt.setTelp(rs.getString("telp"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }

    public ArrayList<Anggota> search(String keyword) {
        ArrayList<Anggota> ListAnggota = new ArrayList();

        String sql = "Select * from anggota where " + " nama like '%" + keyword + "%' " + " or alamat like '%" + keyword + "%' ";

        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Anggota agt = new Anggota();
                agt.setIdanggota(rs.getInt("idanggota"));
                agt.setNama(rs.getString("nama"));
                agt.setAlamat(rs.getString("alamat"));
                agt.setTelp(rs.getString("telp"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }
    
    public void save(){
        if(getById(idanggota).getIdanggota() == 0){
            String SQL = "Insert into anggota (nama,alamat,telp) values(" 
                    + " '" +this.nama + "', "
                    + " '" +this.alamat + "', "
                    + " '"+this.telp+"' "
                    + " )";
                    this.idanggota = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "Update anggota set"
                   + " nama = '" +this.nama +"', "
                   + " alamat = '" +this.alamat +"', "
                   + " telp = '"+this.telp+"' "
                   +"Where idanggota = '"+this.idanggota+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM anggota WHERE idAnggota = '"+this.idanggota+"'";
        DBHelper.executeQuery(SQL);
    }
    public ArrayList<Anggota> getByNamaAlamatAndTelepon(String nama, String alamat, String telp) {
        ArrayList<Anggota> ListKategori = new ArrayList();
        ResultSet rs;

        if ((nama.trim().length() > 0) && (alamat.trim().length() > 0) && (telp.trim().length() > 0)) {
            rs = DBHelper.selectQuery("SELECT * FROM anggota WHERE nama = '" + nama + "' AND alamat = '" + alamat + "' AND telp = '" + telp + "'");
        } else if ((nama.trim().length() > 0) && (alamat.trim().length() > 0) && (telp.trim().length() == 0)) {
            rs = DBHelper.selectQuery("SELECT * FROM anggota WHERE nama = '" + nama + "' AND alamat = '" + alamat + "'");
        } else if ((nama.trim().length() > 0) && (alamat.trim().length() == 0) && (telp.trim().length() > 0)) {
            rs = DBHelper.selectQuery("SELECT * FROM anggota WHERE nama = '" + nama + "' AND telp = '" + telp + "'");
        } else if ((nama.trim().length() == 0) && (alamat.trim().length() > 0) && (telp.trim().length() > 0)) {
            rs = DBHelper.selectQuery("SELECT * FROM anggota WHERE alamat = '" + alamat + "' AND telp = '" + telp + "'");
        } else if ((nama.trim().length() > 0) && (alamat.trim().length() == 0) && (telp.trim().length() == 0)) {
            rs = DBHelper.selectQuery("SELECT * FROM anggota WHERE nama = '" + nama + "'");
        } else if ((nama.trim().length() == 0) && (alamat.trim().length() > 0) && (telp.trim().length() == 0)) {
            rs = DBHelper.selectQuery("SELECT * FROM anggota WHERE alamat = '" + alamat + "'");
        } else {
            rs = DBHelper.selectQuery("SELECT * FROM kategori WHERE telp = '" + telp + "'");
        }

        try {
            while (rs.next()) {
                Anggota agt = new Anggota();
                agt.setIdanggota(rs.getInt("idanggota"));
                agt.setNama(rs.getString("nama"));
                agt.setAlamat(rs.getString("alamat"));
                agt.setTelp(rs.getString("telp"));
                ListKategori.add(agt);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }
}
