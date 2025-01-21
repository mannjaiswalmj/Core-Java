package DSA.Stack;

// import java.util.Stack;

//Inbuilt class 
/* .push(3);
 * .pop();
 * .peek();
 */

public class stack1 {
    public static void main(String[] args) {
        Stack nums = new Stack();

        nums.push(9);
        nums.push(8);
       System.out.println(nums.pop()); 
        nums.push(2);
        nums.push(7);
        nums.push(5);
        nums.push(3);

        // System.out.println(nums);
        nums.printValues();
        
        System.out.println(nums.peek());
    }

    
}
