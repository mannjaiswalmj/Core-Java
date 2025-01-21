class A{
    public int add(int n1,int n2){
        return n1+n2;
    }

}

class B extends A
{
    public int multi(int n1, int n2){
        return n1*n2;
    } 
    
    
    public void show(){
        System.out.println("In B Show");
    }
}

class C extends B{      //Multilevel inheritance
    public  int div(int n1, int n2){
        return n1/n2;
    }

    public void show(){
        System.out.println("In c Show");
    }

}

//Multiple inheritance in java is not possible

public class Inheritance {

    public static void main(String[] args) {
        C obj = new C();
        int r1 = obj.multi( 4,5);
        int r2 = obj.add(4,5);
        int r3 = obj.div(15,3);


        System.out.println(r1+" "+ r2 + " " + r3);

        obj.show();             // Method overridding
        B obj2 = new B();
        obj2.show();
        
        
    }
    
}
