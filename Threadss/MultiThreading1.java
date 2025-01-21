package Threadss;

//Two ways to create a thread
/*
 1) using Runnable interface  (implements)
 2) using Thread class    (extends)
 */

//Creating our thread using Runnable interface
class Mythread implements Runnable{
    public void run() {
        //creat task
        for(int i=1; i<=10; i++){
            System.out.println("Value " +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyAnotherThread extends Thread{

    public void run(){
        //task
        for(int i=10; i>=1; i--){
            System.out.println("Another thread = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
        }
    }
}

public class MultiThreading1 {
    public static void main(String[] args) {

        Mythread t = new Mythread();

        Thread thr = new Thread(t);
        thr.start();

        MyAnotherThread t2 = new MyAnotherThread();
        t2.start();
        

    }
    
}
