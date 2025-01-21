package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();

        //List allows you to have duplicate values
        list.add("element1");
        list.add("element2");
        list.add("element2");
        System.out.println(list);

        //list allows null value
        list.add(null);
        list.add(null);
        System.out.println(list);

        //List mantains Insertion Order

        //Access elements from list
        System.out.println(list.get(2));

    }
    
}
