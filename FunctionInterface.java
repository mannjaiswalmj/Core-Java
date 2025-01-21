
@FunctionalInterface  // It means u can only create only method
interface A{
    public void show();
}

// class B implements A{
//     public void show(){
//         System.out.println("In B show");
//     }

// }


public class FunctionInterface {
    public static void main(String[] args) {

        A obj = new A()
        {
            public void show(){
                System.out.println("In A show");
            }
        };
        obj.show();
        
    }
}
