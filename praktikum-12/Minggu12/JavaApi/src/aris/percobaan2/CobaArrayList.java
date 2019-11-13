package aris.percobaan2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CobaArrayList {
    public static void main(String[] args) {
        List mListCountry = new ArrayList();
        mListCountry.add("Indonesia");
        mListCountry.add("Malaysia");
        mListCountry.add("Jerman");
        System.out.println("Country List");
        Iterator mIterator = mListCountry.iterator();
        while(mIterator.hasNext()){
           Object element = mIterator.next();
          System.out.format("%sn",element);
        }
        
    }
}
