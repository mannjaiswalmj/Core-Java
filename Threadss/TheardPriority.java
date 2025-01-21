package Threadss;


class X extends Thread{

    public void run(){      // we have to name the method run() 
        for(int i=1; i<=10; i++){

         System.out.println("Hi"); 

         try {
            Thread.sleep(1000);       // make this thread sleep for 10 millsec
        } catch (InterruptedException e) {  e.printStackTrace(); }

        }
    }
}

class Y extends Thread{

    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Hello"); 
            
            try {
                Thread.sleep(1000);       // make this thread sleep for 10 millsec
            } catch (InterruptedException e) {  e.printStackTrace();
            }

           }
    }
}

public class TheardPriority {
    public static void main(String[] args)  {

        X obj1 = new X();
        Y obj2 = new Y();

        obj1.start();           // Start() is the method from thread class 
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();           // two threads will work alternatively

        System.out.println(obj1.getPriority());     // Getting priority of obj1 (1->less, 5->normal, 10->High)


        // obj2.setPriority(Thread.MAX_PRIORITY);      // Setting priority of obj2 to MAX i.e 10

        
        
    }
}
