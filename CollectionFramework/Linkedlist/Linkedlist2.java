package CollectionFramework.Linkedlist;

import java.util.LinkedList;

//Retriving elements from linkedlist (Beginning, last, specified position, All elements)

//getFirst()
//getLast()
//get()
//for enchaned loop

public class Linkedlist2 {
    public static void main(String[] args) {
         LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        System.out.println(fruits);

        //Getting the first element from linkedlist using getFirst()
        String firstElement = fruits.getFirst();
        System.out.println("First Element is: " + firstElement);


        //Getting the Last element from linkedlist using getLast()
        String lastElement = fruits.getLast();
        System.out.println("Last Element is: "+ lastElement);


        //Getting element at given position from linkedlist using get()
        String element = fruits.get(2);
        System.out.println("Element is: "+ element);

        //Retriving all the elements from the linkedlist
        for(String fr : fruits){
            System.out.println(fr);
        }

    }
    
}
