//Inner Class : Class inside a Class

class A{            // Class cannot be Static Class

    int age;
    public void show(){
        System.out.println("in show");
    }

    static class B{                // B is Inner Class ( Subclass of A)
        public void config(){
            System.out.println("in Config");
        }
    }

}


public class InnerClass {

    public static void main(String[] args) {

        A obj = new A();
        obj.show();

       // A.B obj1 = obj.new B();     //If Inner class is not static      
         A.B obj1 = new A.B();        // if Inner Class is Static
        obj1.config();
        
    }
    
}
