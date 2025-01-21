package DSA.Stack;

public class Stack {

    // Stack can be implemented with array and linkedlist as well

    int arr[] = new int[5];
    int top;
    int size;

    public Stack(){
        top =-1;
        size = arr.length;
    }

    public void push(int data){
        top++;

        if(top<size)
          arr[top] = data;      
        else
            System.out.println("Stack OverFlow");
        
    }
    
    public int pop(){
        if(top>-1)
            return arr[top--];  //Post decrement
         else
            System.out.println("Stack Underflow");
        return 0;
    }

    public int peek(){

        return arr[top];
    }

    public void printValues(){
        for(int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
