package CollectionFramework.Hashset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

//Hashset implements Set Interface
//Hashset internally uses HashMap to store its element
//Hashset does not allows duplicate values
//Hashset allows null values
//Hashset is an UnOrdered Collection (means Objects that you insert in HashSet are not guaranteed to be
// inserted in the same order. Objects are inserted based on their hash code)

//Hashset is not thread safe , You must explicitly Synchronise it


public class Hashset1 {
    public static void main(String[] args) {

     // Collection<String> fruit = new HashSet<>();
        Set<String> fruits = new HashSet<>();
        fruits.add("Orange");
        fruits.add("Papaya");
        fruits.add("Pineapple");
        System.out.println(fruits);     //Hashset is an Unordered Collection

        //Hashset doesnot allows Duplicate values
        fruits.add("Pineapple");
        System.out.println(fruits);

        //Hashset allows only one null value
        fruits.add(null);
        System.out.println(fruits);

        //Creating Hashset from another Collection using the Hashset(Collection C) constructor
        Set<String> fruitAndVeggis = new HashSet<>(fruits);
        System.out.println(fruitAndVeggis);

        Set<String> veggis = new HashSet<>();
        veggis.add("Potato");
        veggis.add("Tomato");
        veggis.add("Broccoli");
        
        //Add all the elements from Collection to Hashset using adaAll() method
        fruitAndVeggis.addAll(veggis);
        System.out.println(fruitAndVeggis);








    }   
}
