/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferry.percobaan3;

/**
 *
 * @author Shirogami
 */
import java.util.HashMap;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap hMapItem = new HashMap();
        hMapItem.put("1","Biskuit");
        hMapItem.put("2","Shampo");
        hMapItem.put("3","Soap");
        
        System.out.println(hMapItem);
        System.out.format("Hashmap item Total : %d\n\n",hMapItem.size());
        
        Object mObject = hMapItem.remove("1");
        System.out.format("%s remove from Hashmap\n",mObject);
        System.out.format("Hashmap item Total : %d\n",hMapItem.size());
        System.out.println(hMapItem);
        
        hMapItem.clear();
        System.out.format("Hashmap item Total : %d\n",hMapItem.size());

    }
}
