/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author mispan
 */
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Buku {
        private int idbuku;
    private Kategori kategori = new Kategori();
    private String judul;
    private String penerbit;
    private String penulis;

    public Buku() {
        
    }

    public Buku(Kategori kategori, String judul, String penerbit, String penulis) {
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
        this.kategori = kategori;
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
        
        Buku buku = new Buku();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                        + "     b.idbuku as idbuku, "
                                        + "     b.judul as judul, "
                                        + "     b.penerbit as penerbit, "
                                        + "     b.penulis as penulis, "
                                        + "     k.idkategori as idkategori, "
                                        + "     k.nama as nama, "
                                        + "     k.keterangan as keterangan "
                                        + "     FROM buku as b "
                                        + "     LEFT JOIN kategori as k ON b.idkategori = k.idkategori "
                                        + "     WHERE b.idbuku = '" + id + "'");
        try{
            while(rs.next()){
                buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return buku;
    }
    
    public ArrayList<Buku> getAll(){
        
        ArrayList<Buku> ListBuku = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                        + "     b.idbuku as idbuku, "
                                        + "     b.judul as judul, "
                                        + "     b.penerbit as penerbit, "
                                        + "     b.penulis as penulis, "
                                        + "     k.idkategori as idkategori, "
                                        + "     k.nama as nama, "
                                        + "     k.keterangan as keterangan "
                                        + "     FROM buku as b "
                                        + "     LEFT JOIN kategori as k ON b.idkategori = k.idkategori ");
        
        try{
            while(rs.next()){
                Buku buku = new Buku();
                buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return ListBuku;
    }
    
    public ArrayList<Buku> search(String keyword){
        ArrayList<Buku> ListBuku = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                        + "     b.idbuku as idbuku, "
                                        + "     b.judul as judul, "
                                        + "     b.penerbit as penerbit, "
                                        + "     b.penulis as penulis, "
                                        + "     k.idkategori as idkategori, "
                                        + "     k.nama as nama, "
                                        + "     k.keterangan as keterangan "
                                        + "     FROM buku as b "
                                        + "     LEFT JOIN kategori as k ON b.idkategori = k.idkategori "
                                        + "     WHERE b.judul LIKE '%"+ keyword +"%' "
                                        + "         OR b.penerbit LIKE '%"+ keyword +"%' "
                                        + "         OR b.penulis LIKE '%"+ keyword +"%' ");
        
        try{
            while(rs.next()){
                Buku buku = new Buku();
                buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ListBuku;
    }
    public void save(){
        if(getById(idbuku).getIdbuku()==0){
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES("
                    +"         '" + this.judul + "',"
                    +"         '" + this.getKategori().getIdKategori() + "',"
                    +"         '" + this.penulis + "', "
                    +"         '" + this.penerbit + "' "
                    +"         )";
            this.idbuku = DBHelper.insertQueryGetId(SQL);
        }
        else{
            String SQL = "UPDATE buku SET "
                    +"      judul = '" + this.judul +"', "
                    +"      idkategori = '" + this.getKategori().getIdKategori() + "', "
                    +"      penulis = '" + this.penulis + "', "
                    +"      penerbit = '" + this.penerbit + "' "
                    +"      WHERE idbuku = '" + this.idbuku +"'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.idbuku + "'";
        DBHelper.executeQuery(SQL);
    }
}
