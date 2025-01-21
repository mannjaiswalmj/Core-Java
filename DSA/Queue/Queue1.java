package DSA.Queue;

// import java.util.Queue

public class Queue1 {
    public static void main(String[] args) {
        Queue num = new Queue();

        num.enqueue(5);
        num.enqueue(8);
        num.enqueue(78);
        num.enqueue(44);

        System.out.println(num.dequeue());

        num.enqueue(14);
        num.show();
    
}
}
