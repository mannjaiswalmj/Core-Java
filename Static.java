class Mobile{
    String company; // They are called Instance Variable
    int price;
    static String name;  // It is called Static Variable
    //Static variable is common for all and it belong to the class not to the its instance

    public void show() {
        System.out.println(company + " : " + price + " : " + name);
    }
}

public class Static {
    
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.company = "Apple";
        obj1.price = 15000;
        obj1.name = "Smartphone"; //here also we should use class name with static variable

        Mobile obj2 = new Mobile();
        obj2.company = "Samsung";
        obj2.price = 17000;
        Mobile.name = "Smartphone";

   //     obj1.name = "Phone"; // now it is static so its common , so if the value get changed it will chnge for everyone
        Mobile.name = "Phone"; // It is Static variable, so we should use it will "class" name instead of "obj" name

        obj1.show();
        obj2.show();





    
    }
}
