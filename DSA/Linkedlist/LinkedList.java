package DSA.Linkedlist;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }
}

public class LinkedList {

    Node head = null;

    public void add(int data){
        Node newNode = new Node(data);
        Node current = head;

        if(head == null)
            head = newNode;
        else{

            while (current.next != null) 
                current = current.next; 
            
            current.next = newNode;
        }
    }

    public void printValues(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        Node cureNode = head;
    
        while (cureNode.next != null) {
            cureNode = cureNode.next;      
        }
        // System.out.println(cureNode);
        cureNode.next = newNode;

    }

    public void delete(int data) {
        Node current =head;

        while(current.next != null && current.next.data != data){
            current = current.next;
        }

        if(current.next != null)
            current.next = current.next.next;

        // we just shifted the refernce (& the delted one does not have any ref)
        // so it will be collected by Garbage Collector
    }
}
