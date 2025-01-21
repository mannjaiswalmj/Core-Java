class A{

    public void show(){
        System.out.println("In A show");
    }
}

class B extends A
{

    public void show(){
        System.out.println("In B show");
    }
}

class C{
    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }
}





public class Polymorphism {

    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        obj = new B();   //Method overridding or Run time polymorphism
        obj.show();

        C obj1 = new C();
        int result = obj1.sum(5, 7);
        System.out.println("SUm is : "+ result);

        result = obj1.sum(4,5,7);
        System.out.println("Sum is : " + result);  //Method overloading or Compile time polymorphism

        
    }
    
}
