class Human{
    private int age;
    private String name;

    //The private instance variable can be accessed, by using getter and setter
    
    public int getAge() {   //getter
        return age;
    }
    public void setAge(int age) {   //setter
        this.age = age;             //' ‘this’ keyword that refers to the current instance of the class 
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;           // this refer to current object
    }

    // Encapsulation is the process of combining data and functions into a single unit called class. 
    //In Encapsulation, the data is not accessed directly; 
    //it is accessed through the functions present inside the class.  {getter & setter}
    //Thus, encapsulation makes the concept of data hiding possible

    
} 

public class encapsulation {
    
    public static void main(String[] args) {

        Human obj = new Human();
        obj.setAge(30);
        obj.setName("Ronak");

        System.out.println(obj.getName() + " : " + obj.getAge());
        
    }
}
