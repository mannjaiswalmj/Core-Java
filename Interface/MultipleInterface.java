package Interface;

/*     Class -> Class = extends
 *     class -> Interface = implements
 *     interface -> Interface = extends
 */

interface A{

    void show();
    void config();
}

interface X{
    void run();
}

interface Y extends X {

}

class B implements A, Y
{   
    public void show(){
        System.out.println("IN show");

    }
    public void config(){
        System.out.println("In config");

    }
    public void run(){      // even if implementing Y we have to define run()
        System.out.println("Running...");
    }

}

public class MultipleInterface {
    public static void main(String[] args) {
 
        A obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();       // A doesnt know that run() exists
        Y obj2 = new B();       // But X and Y know that run() exists that why we have create reference of X or Y
        obj1.run();
        obj2.run();
        
    }
    
}
