package CollectionFramework.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists1 {
    public static void main(String[] args) {

//This is how we can create ArrayList using ArrayList() constructor and add new elments using add() method.
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        System.out.println(fruits);

//how to create Arraylist from another collection using the ArrayList(Collection c) constructor

//Adding all the elements from existing collection to new ArrayList using all() method.

        List<Integer> firstFivePrimeNo = new ArrayList<>();   //create ArrayList object
        firstFivePrimeNo.add(2);
        firstFivePrimeNo.add(3);
        firstFivePrimeNo.add(5);
        firstFivePrimeNo.add(7);
        firstFivePrimeNo.add(11);

        List<Integer> firstTenPrimeNo = new ArrayList<>(firstFivePrimeNo);

        List<Integer> nextPrimeNo = new ArrayList<>();
        nextPrimeNo.add(13);
        nextPrimeNo.add(17);
        nextPrimeNo.add(19);
        nextPrimeNo.add(23);
        nextPrimeNo.add(29);

        firstTenPrimeNo.addAll(nextPrimeNo);
        System.out.println(firstTenPrimeNo);

        firstTenPrimeNo.forEach(n -> System.out.println(n));





    }
    
}
