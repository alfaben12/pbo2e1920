/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivi.percobaan1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 *
 * @author Vivi Agustina
 */
public class DemoHastSet {
    public static void main(String[] args) {
        Set mSetCity = new HashSet();
        mSetCity.add("Malang");
        mSetCity.add("Banyuwangi");
        mSetCity.add("jogjakarta");
        mSetCity.add("Batu");
       
        
        System.out.println(mSetCity);
        Iterator<String> mIterator = mSetCity.iterator();
        
        while (mIterator.hasNext()){
            System.out.println(mIterator.next().toLowerCase());
        
        
        }
    }
}
