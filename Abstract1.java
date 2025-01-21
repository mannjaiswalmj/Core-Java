abstract class Car{                      // abstract Class

    public abstract void drive();       //abstract method
    public abstract void fly();

    public void playMusic(){
        System.out.println("Playing Music");
    }
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Driving...");
    }

}

class UpdatedWagonR extends Car{         //Concrete Class
    
    public void fly(){
        System.out.println("FLying");
    }

    public void drive(){
        System.out.println("Diriving");

    }

}

/*  An abstract class must be declared with an abstract keyword.
    It can have abstract and non-abstract methods.
    It cannot be instantiated. (which means abstract class Object cannot be created)
    It can have constructors and static methods also.

    Subclass have to define all the abstract Method  ( it is Compulsory)
 
 */

public class Abstract1 {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();         // object canbe created of  only subclass
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
    
}
