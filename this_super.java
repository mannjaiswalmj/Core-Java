//By default every class extends the "Object" class, even if we mention it or not 

class A extends Object
{
    public A(){
        super();        //Every Constructor in Java has a method which is "super()", even if we donot mention it
        System.out.println("In A"); 
    }

    public A(int n){
        super();
        System.out.println("In A Int");
    }

}

class B extends A        // B is only extending A class not "Object" class
{
    public B(){
        super(9);        // Super means calling the constructor of the super class
        System.out.println("In B");
    }

    public B(int n){
        //super();
        this();        // "this()" method will call the default constructor of this class
        System.out.println("In B Int");

    }

}



public class this_super {

    public static void main(String[] args) {

        B obj = new B(5);
        
    }
    
}
