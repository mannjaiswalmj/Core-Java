//Annotations help to associate metadata (information) 
//to the program elements i.e. instance variables, constructors, methods, classes, etc

@Deprecated    // Means it will be soon removed, avoid using it
class A{
    public void showToTheBelongs(){
        System.out.println("In A show");
    }
}

class B{
    
    //@Override
    public void showToTheBelong(){
        System.out.println("In B show");
    }
}


public class Annotation1 {
    public static void main(String[] args){

        B obj = new B();
        obj.showToTheBelong();


    }
    
}
