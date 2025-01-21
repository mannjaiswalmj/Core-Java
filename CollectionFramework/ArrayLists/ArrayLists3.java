package CollectionFramework.ArrayLists;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayLists3 {
    public static void main(String[] args) {
        
        List<String> course = Arrays.asList("C","C++","Java","Python","SpringBoot");

        //Basic loop
        for(int i=0; i<course.size(); i++){
            System.out.println(course.get(i));
        }

        //Enhanced for each loop
        for (String c : course) {
            System.out.println(c);  
        }

        //Basic loop with Iterator
        for(Iterator it = course.iterator(); it.hasNext();){
            String c = (String) it.next();
            System.out.println(c);
        }

        //Iterator with while loop
        Iterator it = course.iterator();
        while(it.hasNext()){
            String c = (String) it.next();
            System.out.println(c);
        }

        //java 8 streams + lamda
        course.stream().forEach(x -> System.out.println(x));

        //java 8 foreach + lamda
        course.forEach(x -> System.out.println(x));

    }
}
