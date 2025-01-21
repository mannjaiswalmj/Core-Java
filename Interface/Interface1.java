package Interface;

/* All the fields in interfaces are public, static and final by default.
All methods are public & abstract by default.
A class that implements an interface must implement all the methods declared in the interface.
Interfaces support the functionality of multiple inheritan */

interface A{

    int age =44;                // All the variable are static & final
    String area = "Pune";

    void show();        //All methods are public & abstract by default.
    void config();
}

class B implements A{
    public void show(){
        System.out.println("IN show");

    }
    public void config(){
        System.out.println("in config");
    }
}


public class Interface1 {

    public static void main(String[] args) {

        A obj = new B();
        obj.show();
        obj.config();
        
    }
    
}


//Type of Interface
/* 1) Normal Interface :- A interface with more than one method

 * 2) Funtional Interface or SAM ( Single Abstract Method) :-
     A interface with only one method

 * 3) Marker Interface :- A interface with no method
    
 */