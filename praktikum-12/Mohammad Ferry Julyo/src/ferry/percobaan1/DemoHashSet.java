/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferry.percobaan1;

/**
 *
 * @author Shirogami
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
    
public class DemoHashSet {
    public static void main(String[] args) {
        Set mSetCity  = new HashSet();
        mSetCity.add("Malang");
        mSetCity.add("Banyuwangi");
        mSetCity.add("Yogyakarta");
        mSetCity.add("Batu");
        
        System.out.println(mSetCity);
        Iterator<String> mIterator = mSetCity.iterator();
        
        while (mIterator.hasNext()){
            System.out.println(mIterator.next().toLowerCase());
        }
        
    }
}