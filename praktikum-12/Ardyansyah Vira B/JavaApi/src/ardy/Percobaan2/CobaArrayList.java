/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ardy.Percobaan2;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
/**
 *
 * @author win
 */
public class CobaArrayList {
     public static void main(String[] args) {
        List mListCountry = new ArrayList();
        mListCountry.add("Indonesia");
        mListCountry.add("Malaysia");
        mListCountry.add("German");
        Iterator mIterator = mListCountry.iterator();
//        System.out.println("Country List");
//        while(mIterator.hasNext()){
//            Object element = mIterator.next();
//            System.out.format("%s ", element);
//        }
        System.out.format("List index 0 = %s\n", mListCountry.get(0));
        System.out.format("List index 2 = %s\n", mListCountry.get(2));
    }
}
