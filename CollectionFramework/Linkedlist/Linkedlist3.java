package CollectionFramework.Linkedlist;

import java.util.LinkedList;

//Removing elements from a linkedlist (Beginning, last, Given element, Clear ALl)

//removeFirst()
//removeLast()
//remove()
//clear()

public class Linkedlist3 {
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Strawberry");
        fruits.add("Apple");
        fruits.add("Pineapple");
        System.out.println(fruits);

        fruits.removeFirst();
        System.out.println("After removing first element -> "+ fruits);

        fruits.removeLast();
        System.out.println("After removing last element -> "+fruits);

        fruits.remove("Apple");
        System.out.println("After removing Apple -> "+fruits);

        fruits.clear();
        System.out.println("Cleared All : "+ fruits);

        
    }
    
}
