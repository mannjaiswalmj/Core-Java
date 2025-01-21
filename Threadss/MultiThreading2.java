package Threadss;

/* Some imp thread methods
    public String getname(); --> returns name of the Thread
    public void setname();  --> set name of the thread
    public void run();      --> contain the task of thread
    public void start();    --> start thread by allocating resources
    public void sleep();    --> pause the thread
    public long getId();    --> returns the id of the thread
    setPriority(), getPriority() --> set and get the priority of the thread
    join(), interrupt(), resume(), stop() etc 

 */

public class MultiThreading2 extends Thread {
    public static void main(String[] args) {
        System.out.println("Program Started...");
        int x = 900+78;
        System.out.println(x);

        //Current thread
        Thread th = currentThread();
        String tname = th.getName();
        System.out.println("Current thread name is: " +tname);

        //set name
        th.setName("Mymain");
        System.out.println("New name is : "+tname);

        System.out.println(th.getId());
        System.out.println(th.getPriority());
        


        System.out.println("Program Ended...");
    }
    
}
