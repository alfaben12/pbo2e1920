/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author Shirogami
 */
public class Sarjana extends Mahasiswa implements ICumlaude{

    public Sarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        super.kuliahDiKampus();
        System.out.println("AKu sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3.51");
    }
    
}
