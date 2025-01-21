package CollectionFramework.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//HashMap class implemets Map interface (Java Map interface is not a subtype of the Collection interface.)

//HashMap provides the basic implementation of the Map interface. 
// HashMap stores the data in (Key, Value) pairs,
// One object is used as a key (index) to another object (value).

//HashMAp doesnot allow Duplicate values
//HashMap allows null values and null key
//HashMap is not thread Safe.
//HashMap is unordered collection
//HashMap is hashTable based implementation of Map Interface

public class HashMap1 {
    public static void main(String[] args) {

        Map<String, Integer> numberMapping = new HashMap<>();
        numberMapping.put("One",1);
        numberMapping.put("Two",2);
        numberMapping.put("Three",3);
        numberMapping.put("Four",4);
        numberMapping.put("Five",5);
        numberMapping.put(null, 6);
        numberMapping.put("Two", 7);

        System.out.println(numberMapping);

        //check if numberMapping is Empty
        System.out.println(numberMapping.isEmpty());

        //check the size of Hashmap
        System.out.println(numberMapping.size());

        //check if key exists in HashMap
        if(numberMapping.containsKey("Four")){
            System.out.println("Exists");
        }else{
            System.out.println("Dosenot Exists");
        }

        //check if Value exists in HashMap
        if (numberMapping.containsValue(5)){
            System.out.println("Exists");
        } else {
            System.out.println("Not Exists");
        }

        //get "value" by using "key"
        Integer i = numberMapping.get("Two");
        System.out.println(i);

        //get only keys from HashMap
        Set<String> s = numberMapping.keySet();
        System.out.println(numberMapping.keySet());

        //get only Values from HashMap
        Collection<Integer> v = numberMapping.values();
        System.out.println(v);

        //remove 
        numberMapping.remove("Two");
        System.out.println(numberMapping);
        
    }
    
}
