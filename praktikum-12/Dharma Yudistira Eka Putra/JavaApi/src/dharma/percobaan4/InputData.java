/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dharma.percobaan4;

import java.util.ArrayList;

/**
 *
 * @author Dharma
 */
public class InputData {
    ArrayList<Mahasiswa> listMahasiswa;

    public InputData() {
        listMahasiswa = new ArrayList<>();
    }
    
    public void isiData(String nim, String nama, String alamat){
        Mahasiswa mhs = new Mahasiswa(nim, nama, alamat);
        listMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa> getData(){
        return listMahasiswa;
    }
}
