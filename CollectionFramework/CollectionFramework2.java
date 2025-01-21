package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFramework2 {

    public static void main(String[] args) {
        
        Collection<String> fruitCollection = new ArrayList<>();
        fruitCollection.add("Banana");
        fruitCollection.add("Apple");
        fruitCollection.add("Mango");
        System.out.println(fruitCollection);

        fruitCollection.remove("Apple");
        System.out.println(fruitCollection);

        System.out.println(fruitCollection.contains("Apple"));

        fruitCollection.forEach((elements)->  System.out.println(elements));

        // fruitCollection.forEach((elements)->{
        //     System.out.println(elements);
        // });


    }
    
}
