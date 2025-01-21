package Threadss;

class A extends Thread{
    public void run(){      // we have to name the method run() 
        for(int i=0; i<=10; i++){
         System.out.println("Hi");    
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println("Hello");    
           }
    }
}

public class MultipleThreads {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        obj1.start();           // Start() is the method from thread class 
        obj2.start();           // two threads will work alternatively
        

        
    }
    
}
