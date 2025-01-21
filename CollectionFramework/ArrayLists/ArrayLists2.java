package CollectionFramework.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists2 {
    public static void main(String[] args) {
        List<String> mobileComapany = new ArrayList<>();

        //is.Empty()
        System.out.println(mobileComapany.isEmpty());

        mobileComapany.add("Apple");
        mobileComapany.add("Samsung");
        mobileComapany.add("Xaomi");
        mobileComapany.add("Goggle");
        mobileComapany.add("Nokia");

        //.size()
        System.out.println("Here is the Top "+ mobileComapany.size() + " Comapnies in the world");

        //Retirve elment from given index
        System.out.println(mobileComapany.get(3));

        //Modify the element at given index
        mobileComapany.set(2, "Motorola");
        System.out.println(mobileComapany);

        //remove, removeall, clear
        mobileComapany.remove(3);
        System.out.println(mobileComapany);

        mobileComapany.remove("Motorola");    //both ways to use remove
        System.out.println(mobileComapany);

        List<String> subList = new ArrayList<>();
        subList.add("Apple");
        subList.add("Samsung");

        mobileComapany.removeAll(subList);          //remove all
        System.out.println(mobileComapany);


        mobileComapany.clear();                     //clear()
        System.out.println(mobileComapany);



        

    }
    
}
