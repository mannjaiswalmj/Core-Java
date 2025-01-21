class human{
    int age;
    String name;

    // constructor automatically get called when the obj is created

    public human(){    // default construtor
        System.out.println("Deafult constructor");
    }

    public human(int age, String name){      //paramatrised constructor

        this.age = age; // age =a;
        this.name = name;  //name = n;
        System.out.println("Paramatrised constructor");
    }

}

public class Constructor {
    public static void main(String[] args) {

        human obj1 = new human();
        human obj2 = new human(18,"kunal");
        
    }
}
