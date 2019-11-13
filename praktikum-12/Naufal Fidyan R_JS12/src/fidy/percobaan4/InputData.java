package fidy.percobaan4;
 import java.util.ArrayList;

public class InputData {
    ArrayList<Mahasiswa>ListMahasiswa;
    
    public InputData(){
        ListMahasiswa = new ArrayList();
    }
    
    public void isiData(String nama, String alamat, String nim){
        Mahasiswa mhs = new Mahasiswa(nim,nama,alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa> getData(){
        return ListMahasiswa;
    }
}
