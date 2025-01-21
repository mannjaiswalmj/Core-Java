//If we want to use abstract only once we can use this concept of Abtract class with Anonnymus Inner Class
// Abstract Class obj cannot be created
//In this case Obj of Anonnymus Inner class is Created


abstract class A{
    public abstract void show();
}


public class Abstract2 {
    public static void main(String[] args) {

        A obj = new A() {   // A() is not the obj of abstract class, it is the obj of Annonymus Inner class
            public void show(){
                System.out.println("In new Show");
            }
        };
        
    }
}
