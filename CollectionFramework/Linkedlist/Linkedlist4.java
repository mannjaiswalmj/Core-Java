package CollectionFramework.Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

//Iterating and Searching elements in a linkedlist (First Occurence , Last Occurence while searching)

public class Linkedlist4 {
    public static void main(String[] args) {
        LinkedList<String> progLang = new LinkedList<>();
        progLang.add("C++");
        progLang.add("Java");
        progLang.add("Kotlin");
        progLang.add("Python");
        progLang.add("Java");
        System.out.println(progLang);

        boolean result = progLang.contains("SpringBoot");
        System.out.println(result);

        //finding the first occurence of an element in a linkedlist
        int firstOccurence = progLang.indexOf("Java");
        System.out.println("First Occurence at :  " + firstOccurence);

        //finding the last occurence of an element in a linkedlist
        int LastIndex = progLang.lastIndexOf("Java");
        System.out.println("LAst Occurence at: "+ LastIndex);

        //Many ways to Iterate over a linkedlist....

        //Iterator
        Iterator<String> it =  progLang.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        //forEach()
        progLang.forEach(element -> System.out.println(element));

        //for enchanced loop
        for(String prog : progLang){
            System.out.println(prog);
        }

        //simple for loop
        for(int i=0; i<progLang.size(); i++){
            String n = progLang.get(i);
            System.out.println(n);
        }


        }
        
    }
    

