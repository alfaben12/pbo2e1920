/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megan.percobaan1;

/**
 *
 * @author Megananda
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoHashset {
    public static void main(String[] args) {
        Set mSetCity = new HashSet();
        mSetCity.add("Malang");
        mSetCity.add("Malang");
        mSetCity.add("Jogjakarta");
        mSetCity.add("Batu");
        
        System.out.println(mSetCity);
        Iterator<String> mIterator = mSetCity.iterator();
        
        while(mIterator.hasNext()){
            System.out.println(mIterator.next().toLowerCase());
        }
    }
    
}