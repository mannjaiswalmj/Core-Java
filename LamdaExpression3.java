//Lamda Expression with return

@FunctionalInterface
interface C {
    int add(int i, int j);
}


public class LamdaExpression3 {
    public static void main(String[] args) {

        C obj = (i,j) -> i+j;           // dont have have to type "return", it automatically return after "->" lamda expression
        int res = obj.add(5, 8);
        System.out.println(res);



        // C obj1 = new C() {
        //     public int add(int i, int j){
        //         return i+j;
        //     }
        // };
        // int result = obj1.add(4, 7);
        // System.out.println(result);
        
    }
    
}
