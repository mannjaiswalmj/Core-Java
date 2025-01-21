class calculator{

    int num = 2;
    
    public int add(int a,int b){
        System.out.println("add runs");
        return a+b;
    }

    public int add(int a, int b, int c){
        System.out.println("add 3");
        return a+b+c;

    }
    
    public double add( double a,  double b){
        System.out.println("add double");
        return a+b;
    }
    
}


class A{

    public A(){
        System.out.println("Obj created");
    }

    public void show(){
        System.out.println("In show");
    }
}


public class class1 {

    public static void main(String[] args) {
        int num1;
        
        calculator cal = new calculator();
        double result = cal.add(9,8.4);
        System.out.println(result);


        new A();   // object is creatred

        new A().show();   // anonymous object
        // we cannot use the anonymous object again, so if we try to use it again it will create a new object
        new A().show();  // new object

    }
    

}
