/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dharma.percobaan3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Dharma
 */
public class DemoHashMap {
    public static void main(String[] args) {
        HashMap hMapItem = new HashMap();
        hMapItem.put("1", "Biskuit");
        hMapItem.put("2", "Shampoo");
        hMapItem.put("3", "Soap");
        System.out.println(hMapItem);
        
        Collection mCollection = hMapItem.values();
        Iterator mIterator = mCollection.iterator();
        while (mIterator.hasNext()) {            
            System.out.println(mIterator.next());
        }
        
        System.out.println("HashMap Item Total: " + hMapItem.size());
        
        Object mObject = hMapItem.remove("1");
        System.out.println("Remove from hashmap: " + mObject);
        System.out.println("HasMap Item Total: " + hMapItem.size());
        System.out.println(hMapItem);
        
        hMapItem.clear();
        System.out.println("HashMap Item Total: " + hMapItem.size());
    }
}
