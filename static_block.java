class Mobile{
    String brand;
    int price;
    String name;

    static{
        System.out.println("In the static block");
    }//static block will called before the constructor, static block get called right after the class load
    // and the class only load once (when the first obj get created)
    // If there is no obj, the class will not load and the static block will not get created

    public Mobile(){
        System.out.println("In the Constuctor");
    }
}


public class static_block {
    public static void main(String[] args) throws ClassNotFoundException {

        //If we want to load the Class without creating any obj, we can use this (by using exception)
        Class.forName("Mobile");

        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();

        
        
    }
}
