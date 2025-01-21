package CollectionFramework.Linkedlist;

import java.util.LinkedList;

//Adding elements to the linkedlist (beginning, last, specified position)

//add()
//add(2,elment)
//addFirst()
//addLast()

public class Linkedlist1 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        System.out.println(fruits);
        
        //Adding element at Specified position in linkedlist
        fruits.add(2,"Pineapple");
        System.out.println(fruits);

        //Adding element at beginning in linkedlist
        fruits.addFirst("Strawbarry");
        System.out.println(fruits);

        //Adding element at last in linkedlist
        fruits.addLast("Chiku");
        System.out.println(fruits);

        String firstElement = fruits.getFirst();
        System.out.println("First Element is: "+ firstElement);

        fruits.forEach(r -> System.out.println(r));



        
    }
    
}
