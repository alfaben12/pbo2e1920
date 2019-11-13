package jobs12.percobaan1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 *
 * @author ujan
 */
public class DemoHashSet {
    public static void main(String[] args)
    {
        Set mSetCity =  new HashSet();
        
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
