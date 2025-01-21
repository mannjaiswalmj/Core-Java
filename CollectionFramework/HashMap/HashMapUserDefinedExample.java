package CollectionFramework.HashMap;

import java.util.HashMap;
import java.util.Map;

class Student{
    private String firstName;
    private String lastName;

    public Student(String firstName , String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
    }

    @Override   //Create toString() using Source Action, so that we can see the values at the end(not the address)
    public String toString() {      
        return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    
}

public class HashMapUserDefinedExample {
    public static void main(String[] args) {
        
        Map<Integer,Student> std = new HashMap<>();
        std.put(1, new Student("Tony ", "Stark"));
        std.put(2, null);
        std.put(3,new Student("John ","Snow"));
        // std.put(4, "Mango");   // it will give error, cuz put() takes only (Integer,Student) arguments
        
        System.out.println(std);
    }
    
}
