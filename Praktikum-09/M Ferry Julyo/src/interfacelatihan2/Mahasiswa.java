/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan2;

/**
 *
 * @author Shirogami
 */
public class Mahasiswa {
    protected String nama;
    
    public Mahasiswa(String nama){
        this.nama=nama;
    }
    
    public void kuliahDiKampus(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku kuliah di kampus.");
    }
}
