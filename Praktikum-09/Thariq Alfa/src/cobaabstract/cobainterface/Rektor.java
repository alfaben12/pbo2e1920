/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaabstract.cobainterface;

/**
 *
 * @author USER
 */
public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Silahkan perkenalkan diri Anda..");
        
        mahasiswa.lulus();
        mahasiswa.kuliahDiKampus();
        mahasiswa.meraihIPKTinggi();
        
        System.out.println("----------------------------------------------");
    }
    
    public void beriSertifikatMawapres(IBerprestasi mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES. ");
        System.out.println("SElamat! BAgaimana Anda bisa berprestasi?");
            
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
            
        System.out.println("----------------------------------------------");  
        }
    }   