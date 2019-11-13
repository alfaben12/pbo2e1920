package kevin.percobaan1;
import java.util.*;
public class CobaHashSet {
    public static void main(String[] args) {
        Set mSetCity = new HashSet();
        mSetCity.add("Malang");
        mSetCity.add("Banyuwangi");
        mSetCity.add("Jogjakarta");
        mSetCity.add("Batu");
        mSetCity.add("Malang");
        System.out.println(mSetCity);
        Iterator<String> mIterator = mSetCity.iterator();
        
        while(mIterator.hasNext()){
            System.out.println(mIterator.next().toLowerCase());
        }
    }
}
