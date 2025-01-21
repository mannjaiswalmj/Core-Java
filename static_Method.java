class Mobile{
    String company; // They are called Instance Variable
    int price;
    static String name;  // It is called Static Variable
    

    public void show() {
        System.out.println(company + " : " + price + " : " + name);
    }

    public static void show1(){
        System.out.println( "in static method");
        //we cannot use non static variables in static method
    }

    public static void show2(Mobile obj){
      System.out.println(obj.company + " : " + obj.price + " : " + name);
      //we can use non static variavbles like this (indirectly) 

        
    }
}

public class static_Method {
    
    public static void main(String[] args) {
        
        
        Mobile obj1 = new Mobile();
        obj1.company = "Apple";
        obj1.price = 15000;
        Mobile.name = "Smartphone"; 

        Mobile obj2 = new Mobile();
        obj2.company = "Samsung";
        obj2.price = 17000;
        Mobile.name = "Smartphone";

   //     obj1.name = "Phone"; // now it is static so it common , so if the value get changed it will chnge for everyone
        Mobile.name = "Phone"; // It is Static variable, so we should use it will "class" name instead of "obj" name

        obj1.show();
        obj2.show();

   //     Mobile.show(); //We cannot call non Static method with the class name
        Mobile.show1();
    }
}
