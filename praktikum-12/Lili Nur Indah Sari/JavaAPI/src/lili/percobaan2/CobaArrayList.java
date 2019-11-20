/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lili.percobaan2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author USER
 */
public class CobaArrayList {
    public static void main(String[] args) {
        List mListCountry = new ArrayList();
        mListCountry.add("indonesia");
        mListCountry.add("malaysia");
        mListCountry.add("german");
        System.out.println(mListCountry);
        Iterator mIterator = mListCountry.iterator();
        while(mIterator.hasNext()){
            Object element = mIterator.next();
            System.out.format("%", element);
        }
        System.out.format("list index 0 = %s\n", mListCountry.get(0));
        System.out.format("list index 2 = %s\n", mListCountry.get(2));
    }
}
