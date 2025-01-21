enum Status{
    Running,Pending,Failed,Success;
}

public class Enum1 {
    public static void main(String[] args) {
        int i = 5;
        Status s = Status.Pending;
        System.out.println(s);          // To print there name
        
        System.out.println(s.ordinal());    // To print there no.

        Status []x = Status.values();       // TO print them all
        
        for(Status n: x){
            System.out.println(n +" : " +n.ordinal());

        }


    }
}
