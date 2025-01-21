package CollectionFramework.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Different ways to iterate over hashMap

//for each Method (Enhanced for loop)
// using Iterator
// using Java 8 forEach() method

public class IterateHashMap {
    public static void main(String[] args) {
        
        Map<String, Integer> numberMapping = new HashMap<>();
        numberMapping.put("One",1);
        numberMapping.put("Two",2);
        numberMapping.put("Three",3);
        numberMapping.put("Four",4);
        numberMapping.put("Five",5);

        //Enhanced for each loop
        for(Map.Entry<String, Integer> entry : numberMapping.entrySet()){
            System.out.println("Keys-> " + entry.getKey() + " Values-> " + entry.getValue());
        }

        //using Iterator
        Set<Map.Entry<String,Integer>> entries = numberMapping.entrySet();
        Iterator<Map.Entry<String,Integer>> it = entries.iterator();
        
        while(it.hasNext()){
            Map.Entry<String,Integer> e = it.next();
            System.out.println("Keyys=> " + e.getKey() + " Values=> " + e.getValue());
        }

        //Java 8 forEach() method
        numberMapping.forEach( (K,V) -> System.out.println("K-> " + K +" V-> " + V));




        
    }
}
