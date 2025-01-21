package CollectionFramework.Hashset;

import java.util.HashSet;
import java.util.Set;

public class Hashset2 {
    public static void main(String[] args) {
        Set<Integer> number = new HashSet<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        System.out.println(number);

        // use remove()
        number.remove(1);
        System.out.println(number);

        //removeAll()
        Set<Integer> evenNumber = new HashSet<>();
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);

        number.removeAll(evenNumber);
        System.out.println(number);

        //clear()
        number.clear();
        System.out.println(number);







    }
    
}
