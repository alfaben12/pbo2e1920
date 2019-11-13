package fidy.percobaan2;
import java.util.ArrayList;
import java.util.List;

public class CobaArrayList {
    public static void main(String[] args) {
        List mListCountry = new ArrayList();
        mListCountry.add("Indonesia");
        mListCountry.add("Malaysia");
        mListCountry.add("Germany");
        
        System.out.println(mListCountry);
        System.out.format("List Index 0 = %s\n", mListCountry.get(0));
        System.out.format("List Index z = %s\n", mListCountry.get(0));
    }
    
}
