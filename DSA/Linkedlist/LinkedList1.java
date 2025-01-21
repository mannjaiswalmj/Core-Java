package DSA.Linkedlist;

// import java.util.LinkedList;

//LinkedList is a inbuilt class in java (we can use it any time)
// we created our own linkedlist class with their own methods

public class LinkedList1 {
    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.add(5);
        l.add(9);
        l.add(7);

        l.printValues();

        l.addFirst(6);
        l.printValues();

        l.addLast(3);
        l.printValues();

        l.delete(7);
        l.printValues();

        // l.forEach(n -> System.out.print(n + " "));

    }
}
