class A{
    public void show(){
        System.out.println("In show");
    }
}


public class AnonymusInnerClass {

    public static void main(String[] args) {

        A obj = new A(){            // THis is Annonymus Inner Class, It can only be used once
                                   // this concept gets used in Interfaces, Lamda expersion etc
            public void show(){
                System.out.println("New show");
            }

        };
        obj.show();

    }
    
}
