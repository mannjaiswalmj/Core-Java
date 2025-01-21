//We can create this With Interface as well


abstract class Computer{
    abstract public void code();

}

class Desktop extends Computer{
    public void code(){
        System.out.println("Code comiple run : Faster");
    }
}


class Laptop extends Computer{
    public void code(){
        System.out.println("Code comiple run");
    }
}

class Developer {

    public void devApp( Computer comp ){
        comp.code();
    }


}

public class Abstract3 {

    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer navin = new Developer();
        navin.devApp(lap);
        navin.devApp(desk);
    }
    
}
