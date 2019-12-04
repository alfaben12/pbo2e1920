/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;


public class TestBackendAnggota {
    public static void main(String[] args) {
        Anggota ang1 = new Anggota("Rio","Trenggalek","085236122705");
        Anggota ang2 = new Anggota("Ferry Julyo","Tulungagung","085236122707");
        Anggota ang3 = new Anggota("Anggit","Bojonegoro","085236122777");
        
        
        ang1.save();
        ang2.save();
        ang3.save();
        
        ang2.setAlamat("Tuban");
        ang2.save();
        
        for(Anggota a : new Anggota().getAll()){
            System.out.println("Nama : "+a.getNama()+", Alamat : "+a.getAlamat()+", Telepon: "+a.getTelepon());
        }
        
        for(Anggota a : new Anggota().search("Tuban")){
            System.out.println("Nama : "+a.getNama()+", Alamat : "+a.getAlamat()+", Telepon: "+a.getTelepon());
        }
    }
}
