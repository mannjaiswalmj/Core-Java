// Lamda Expression will only work with functional Interface i.e Interface that has only one method
//Lamda Experssion "->" , is used to reduce the no. of lines

interface A{
    void show();
}


public class LamdaExpression1 {
    public static void main(String[] args) {

        A obj1 = () -> System.out.println("In show");            // code reduced to one line
        obj1.show();                                     

        // A obj2 = () ->                           // This is how it written
        // {
        //     System.out.println("IN A show");
        // };



        // A obj = new A() {                        // orginal way
        //     public void show(){
        //         System.out.println("In show");
        //     }
        // };
        
    }
    
}
