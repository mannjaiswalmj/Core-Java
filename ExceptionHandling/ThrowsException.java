package ExceptionHandling;
//throws is a keyword in Java that is used in the signature of a method to indicate ,
//that this method might throw one of the listed type exceptions.

class A{  

    public void show() throws ClassNotFoundException{

        Class.forName("Ddj");
    
        // try{
        // Class.forName("ddj");
        // }
        // catch(ClassNotFoundException e){
        //     System.out.println("Class not found" + e);
        // }
    }

}

public class ThrowsException {
    static {
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {

        A obj = new A();
        try {
            obj.show();
        } catch (Exception e) {
            System.out.println("Class not Found");
        }
        

    
        
    }
    
}
