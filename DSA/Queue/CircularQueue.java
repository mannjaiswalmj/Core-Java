package DSA.Queue;

public class CircularQueue {
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private int arr[] = new int[4];


    public void enqueue(int data){
       if(!isfull()){
        rear = (rear+1)%4;
        arr[rear] = data;
        size++;
       }
       else{
        System.out.println("Queue is full ");
       }

    }

    public int dequeue(){
        if(isEmpty())
            throw new RuntimeException("Queue is Empty");
            
        int data = arr[front];
        front = (front+1)%4;
        size--;
        return data;
    }

     public void show(){
        for(int i=front; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public boolean isfull(){
        return size==4;
    }

    public boolean isEmpty(){
        return size==0;
    }



    
}
