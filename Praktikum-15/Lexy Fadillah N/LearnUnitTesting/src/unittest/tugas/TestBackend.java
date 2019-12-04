/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.tugas;

/**
 *
 * @author asus
 */
public class TestBackend {
    public static void main(String[] args){

        Anggota ang1 = new Anggota("Gonjel", "Jl.Irak", "0812345678");
        Anggota ang2 = new Anggota("Gibrut", "Jl.Ngantang", "0123456789");
        Anggota ang3 = new Anggota("Supek", "Jl.Ngandat", "0987654321");

        // test insert
        ang1.save();
        ang2.save();
        ang3.save();

        // test update
        ang2.setAlamat("Jl.Songgoriti");
        ang2.save();

        // test delete
        ang3.delete();

        // test select all
        for(Anggota a : new Anggota().getAll()){
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ", Telp: " + a.getTelp());
        }
        // test search
        for(Anggota a : new Anggota().search("ilmiah")){
        System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ", Telp: " + a.getTelp());
        }
    }
}
