package Threadss.ProcuderConsumerProblem;


public class Company {

    int n; 
    Boolean f = false;
    //if f is false (chance:Producer) means Producer will produce
    //if f = true   (chance: consumer) means now consumer will consume & producer will not interfare

    
    // synchronized means whenever producer is working, it will not be interfared by any other theard
   synchronized public void produceItem(int n){
        if(f){
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        this.n = n;
        System.out.println("Produce : "+ this.n);
        f=true;
        notify();
    }

    synchronized public int consumeItem() {

        if(!f){
            try {
                wait();
            } catch (InterruptedException e) {   }
        }
        System.out.println("Consumed : "+this.n);
        f= false;
        notify();

        return this.n;


    }
    
    
}

