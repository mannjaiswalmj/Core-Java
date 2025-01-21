package DSA.Queue;

public class CircularQueue1 {
    public static void main(String[] args) {
        CircularQueue num = new CircularQueue();

        num.enqueue(10);
        num.enqueue(4);
        num.enqueue(55);
        num.enqueue(96);

        System.out.println(num.dequeue());
        System.out.println(num.dequeue());
        System.out.println(num.dequeue());
        System.out.println(num.dequeue());
        // System.out.println(num.dequeue());

        num.enqueue(82);
        num.enqueue(78);
        num.enqueue(32);

        num.show();
    }
}
