package Threadss.ProcuderConsumerProblem;

public class Consumer extends Thread{

    Company c;
    Consumer(Company c){
        this.c =c;
    }

    public void run(){
        int i=1;
        while(true){
            this.c.consumeItem();
            try {
                Thread.sleep(2000);  // If sleep value gets changed so it will disturpt the flow, 
            } catch (InterruptedException e) {   }  // so we need to make inter-thread communication
            i++;

        }
    }
    
}
