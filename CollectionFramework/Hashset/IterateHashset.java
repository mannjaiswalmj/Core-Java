package CollectionFramework.Hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Enhanced for loop
//Basic loop with iterator
//while loop with iterator
// java 8 forEach() method with lamda
// java 8 streaming + forEach() + LamdaExpression

public class IterateHashset {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Strawberry");
        System.out.println(fruits);

        //Enhanced for loop 
        for(String s : fruits){
            System.out.println(s);
        }

        //Basic loop with Iterator
        Iterator<String> it = fruits.iterator();
        for(int i=0; i< fruits.size(); i++){
            System.out.println(it.next());          //both are same
        }

        // for(Iterator<String> iter = fruits.iterator(); iter.hasNext();){
        //     String s =  iter.next();
        //     System.out.println(s);
        // }

        //while loop with Iterator
        Iterator<String> ok = fruits.iterator();
        while (ok.hasNext()) {
            String s = ok.next();
            System.out.println(s);
        }

        //Java 8 forEach() with lamda
        fruits.forEach(element -> System.out.println(element));

        //Java 8 streaming + forEach() + lamda
        fruits.stream().filter(fr -> !"Java".equals(fr)).forEach(fr -> System.out.print(fr+" "));
        
    }
    
}
