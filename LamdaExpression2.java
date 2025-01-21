// Lamda Expression 
interface B{
    void show(int i);
}

public class LamdaExpression2 {
    public static void main(String[] args) {

        B obj1 = (i) -> System.out.println("In show" + i);

        B obj2 = i -> System.out.println("In show B " + i);       // if there is only 1 variable , so we remove () as well

        // B obj = new B() {
        //     public void show(int i){
        //         System.out.println("In show" + i);
        //     }
        // };
        

    }
    
}
