/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rizky.percobaan1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 *
 * @author Hp
 */
public class DemoHashSet {
    public static void main(String[] args) {
        Set mSetCity = new HashSet();
        mSetCity.add("malang");
        mSetCity.add("banyuwangi");
        mSetCity.add("jogjakarta");
        mSetCity.add("batu");
        
        System.out.println(mSetCity);
        Iterator<String> mIterator = mSetCity.iterator();
        
        while (mIterator.hasNext()){
            System.out.println(mIterator.next().toLowerCase());
        }
    }
}
