package quiz2;

import java.util.ArrayList;
public class InputData {
    ArrayList<Results> ListMahasiswa;

    public InputData() {
        ListMahasiswa = new ArrayList();
    }
    
    public void isiData(String angka1, String angka2, String operator, String hasil) {
        Results mhs = new Results(angka1, angka2, operator, hasil);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Results> getData() {
        return ListMahasiswa;
    }
}