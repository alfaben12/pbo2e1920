package kevin.percobaan2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CobaArrayList {
    public static void main(String[] args) {
        List mListCountry = new ArrayList();
        mListCountry.add("Indonesia");
        mListCountry.add("Malaysia");
        mListCountry.add("Germany");
        
//        System.out.println(mListCountry);
//        System.out.printf("List ke-0 : %s\n", mListCountry.get(0));
//        System.out.printf("List ke-2 : %s\n", mListCountry.get(2));

        System.out.println("Country List");
        Iterator mIterator = mListCountry.iterator();
        while(mIterator.hasNext()){
            Object element = mIterator.next();
            System.out.printf("%s ", element);
        }
    }
}
